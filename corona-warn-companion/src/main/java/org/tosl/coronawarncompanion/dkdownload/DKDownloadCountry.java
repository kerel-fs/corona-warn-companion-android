package org.tosl.coronawarncompanion.dkdownload;

import android.content.Context;
import android.util.Pair;

import com.android.volley.RequestQueue;

import java.net.URL;
import java.util.Date;
import java.util.List;

import io.reactivex.rxjava3.core.Single;

public interface DKDownloadCountry {
    Single<List<Pair<URL, String>>> getUrls(Context context, RequestQueue queue, Date minDate);
    String getCountryCode(Context context);
}
