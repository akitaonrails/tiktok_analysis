package com.ss.android.ugc.profile.business.profile.preload;

import X.C1499810p8F;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.app.api.Api;
import java.util.ArrayList;
import java.util.concurrent.Future;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfilePagePreload implements InterfaceC727570SgN<Api.NetApi, Future<String>> {
    public static final int $stable = 0;

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        if (bundle != null && bundle.getString("preload_profile_page_url") != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        if (bundle != null && bundle.containsKey("profile_aweme_ttl")) {
            return new C1499810p8F(false, Api.LIZ, null, bundle.getInt("profile_aweme_ttl"), false, 24);
        }
        return new C1499810p8F(false, Api.LIZ, null, 0, false, 29);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload, reason: merged with bridge method [inline-methods] */
    public Future<String> preload2(Bundle bundle, Function1<? super Class<Api.NetApi>, ? extends Api.NetApi> function1) {
        String string;
        Parcelable parcelable = null;
        if (bundle != null) {
            string = bundle.getString("preload_profile_page_url");
        } else {
            string = null;
        }
        ArrayList arrayList = new ArrayList();
        if (bundle != null) {
            parcelable = bundle.getParcelable("preload_profile_page_extra_info");
        }
        return function1.invoke(Api.NetApi.class).doGet(string, arrayList, parcelable);
    }
}
