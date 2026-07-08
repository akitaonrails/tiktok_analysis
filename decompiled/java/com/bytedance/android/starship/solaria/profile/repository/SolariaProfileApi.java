package com.bytedance.android.starship.solaria.profile.repository;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.google.gson.n;

/* JADX INFO: loaded from: classes18.dex */
public interface SolariaProfileApi {
    @InterfaceC1501170pAR("/tiktok/v1/efficiency_portrait/")
    C11NZ<n> fetchProfiles();

    @InterfaceC1501170pAR("/tiktok/v1/efficiency_portrait/")
    C11NZ<n> fetchProfiles(@InterfaceC1485405rg ProfileQueryParams profileQueryParams);
}
