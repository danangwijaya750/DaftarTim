package id.infiniteuny.daftartim.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by wijaya on 06/10/19
 */
class ApiClient {
    companion object{

        fun create(): Repository{
            val retrofit = Retrofit.Builder()
                .addConverterFactory(
                    GsonConverterFactory.create())
                .baseUrl("https://www.thesportsdb.com/api/v1/json/")
                .build()

            return retrofit.create(Repository::class.java)
        }

    }
}