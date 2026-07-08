package com.ss.android.ugc.aweme.share.business.config;

import X.C1370200llC;
import X.C1379120lza;
import X.EnumC1369700lkO;
import X.EnumC1369720lkQ;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* JADX INFO: loaded from: classes22.dex */
public class AwemeSheetActionProtocol extends TTSheetActionProtocol {
    public final AwemeSharePackage LLILLJJLI;
    public final Aweme LLILLL;
    public final EnumC1369720lkQ LLILZ;
    public final EnumC1369700lkO LLILZIL;
    public final C1370200llC LLILZLL;

    @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public EnumC1369720lkQ O12() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public final EnumC1369700lkO P82() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public final C1370200llC getUiConfig() {
        return this.LLILZLL;
    }

    public AwemeSheetActionProtocol(BaseSharePackage baseSharePackage) {
        AwemeSharePackage awemeSharePackage;
        Aweme awemeLJJIFFI;
        SharePackage sharePackage;
        super(baseSharePackage);
        if (baseSharePackage instanceof AwemeSharePackage) {
            awemeSharePackage = (AwemeSharePackage) baseSharePackage;
        } else {
            awemeSharePackage = null;
        }
        this.LLILLJJLI = awemeSharePackage;
        if (awemeSharePackage != null) {
            Bundle bundle = awemeSharePackage.extras;
            if (bundle != null) {
                bundle.getString("panel_source");
            }
            awemeLJJIFFI = awemeSharePackage.LJJIFFI();
        } else {
            awemeLJJIFFI = null;
        }
        this.LLILLL = awemeLJJIFFI;
        String string = baseSharePackage.extras.getString("enter_from", "");
        String string2 = baseSharePackage.extras.getString("panel_source", "");
        C1379120lza.LIZ.getClass();
        if (C1379120lza.LIZIZ(string2)) {
            if (baseSharePackage instanceof SharePackage) {
                sharePackage = (SharePackage) baseSharePackage;
            } else {
                sharePackage = null;
            }
            if (C1379120lza.LIZLLL(sharePackage, string)) {
                C1370200llC c1370200llC = new C1370200llC();
                c1370200llC.LIZIZ = true;
                this.LLILZLL = c1370200llC;
                this.LLILZ = EnumC1369720lkQ.VERTICAL;
                this.LLILZIL = EnumC1369700lkO.BOTTOM;
                return;
            }
        }
        this.LLILZLL = null;
        this.LLILZ = EnumC1369720lkQ.HORIZONTAL;
        this.LLILZIL = EnumC1369700lkO.TOP;
    }
}
