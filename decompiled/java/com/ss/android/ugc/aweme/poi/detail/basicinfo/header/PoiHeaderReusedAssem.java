package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.C13LE;
import X.C19719912Dl;
import X.C384050F3z;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.PoiDetailInfoAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderReusedAssem extends BaseSlashGlueReusedAssem<PoiListApi.PoiDetailResponse> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e78;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        super.unBind();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem, com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        float fApplyDimension = TypedValue.applyDimension(1, 16, Resources.getSystem().getDisplayMetrics());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
        c384050F3z.LJIIIIZZ = Float.valueOf(fApplyDimension);
        c384050F3z.LJIIIZ = Float.valueOf(fApplyDimension);
        view.setBackground(c384050F3z.LIZ(getContentView().getContext()));
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem, com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent
    /* JADX INFO: renamed from: op */
    public final void up(BaseComponentData baseComponentData) {
        super.up(baseComponentData);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem, com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        super.up((BaseComponentData) obj);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem
    public final C19719912Dl sp(BaseComponentData baseComponentData) {
        return C13LE.LIZ(PoiDetailInfoAssem.class);
    }
}
