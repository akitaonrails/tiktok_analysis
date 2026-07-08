package com.bytedance.tiktok.homepage.services;

import X.InterfaceC799850VZf;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopLeftIconInflate;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopRightIconInflate;
import com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService;

/* JADX INFO: loaded from: classes25.dex */
public final class MainFragmentCacheExpServiceImpl implements IMainFragmentCacheExpService {
    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final InterfaceC799850VZf LIZ() {
        return new MainFragmentTopRightIconInflate();
    }

    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final InterfaceC799850VZf LIZIZ() {
        return new MainFragmentTopLeftIconInflate();
    }
}
