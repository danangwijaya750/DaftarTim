package id.infiniteuny.daftartim.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.infiniteuny.daftartim.R
import id.infiniteuny.daftartim.data.model.TeamResponse.Team
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.list_item.iv_tim
import kotlinx.android.synthetic.main.list_item.tv_tim_name
import kotlinx.android.synthetic.main.list_item.tv_tim_stadium

/**
 * Created by wijaya on 12/10/19
 */
class RvAdapter(val dataTim:List<Team>)
    : RecyclerView.Adapter<RvAdapter.ViewHoder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoder {
        return ViewHoder(LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_item
                ,parent,false))
    }

    override fun getItemCount(): Int =dataTim.size

    override fun onBindViewHolder(holder: ViewHoder, position: Int) {
        holder.bindData(dataTim[position])
    }

    class ViewHoder(override val containerView: View)
        :RecyclerView.ViewHolder(containerView)
        ,LayoutContainer {

        fun bindData(item:Team){
            tv_tim_name.text=item.strTeam
            tv_tim_stadium.text=item.strStadium
            Glide.with(containerView)
                .load(item.strTeamLogo)
                .into(iv_tim)
        }
    }
}