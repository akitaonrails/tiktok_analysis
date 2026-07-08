package com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public interface IEcUgOutOfAppService {
    String LIZ(Uri uri);

    boolean LIZIZ(Activity activity, Uri uri);

    String LIZJ(Uri uri);

    Intent LIZLLL(Activity activity, Uri uri);

    String LJ(Uri uri, String str);

    List<String> LJFF();

    String LJI(Uri uri);

    Intent LJII(Activity activity, Uri uri);

    boolean LJIIIIZZ(Activity activity, Uri uri);

    String handlePdpShareInfo(String str, String str2, Map<String, Object> map);
}
