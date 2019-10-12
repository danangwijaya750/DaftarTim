package id.infiniteuny.daftartim.data.remote

import id.infiniteuny.daftartim.data.model.TeamResponse
import id.infiniteuny.daftartim.data.model.TeamResponse.Team
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by wijaya on 06/10/19
 */
interface Repository {
    @GET("1/lookup_all_teams.php?id=4328")
    fun ambilDataTim(): Call<TeamResponse>
}