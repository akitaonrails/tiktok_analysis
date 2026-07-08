package com.ss.android.ugc.aweme.captionsheet;

import X.C01GW;
import X.C0BJA;
import X.C0S58;
import X.C20693915yL;
import X.C452501pT;
import X.EnumC20698315z3;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class PhotoTranslationPanelFragmentV2 extends CaptionsPanelFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYtOTs6Jys/ISHELIOSo2PGscISAnJxE+KCEgJCQ4ICA9GCQiLCMVOiQrJCo9PBN+";
    public final EnumC20698315z3 LLJJJJ;
    public C20693915yL LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public final C01GW LLJJL;

    public PhotoTranslationPanelFragmentV2() {
        this(0);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment, com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final String getTitle() {
        return (String) this.LLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final String aS() {
        return (!C0BJA.LIZIZ() || C0S58.LIZ) ? getString(2131829254) : getString(2131829021);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final boolean PR() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final EnumC20698315z3 iS() {
        return this.LLJJJJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoTranslationPanelFragmentV2(int i) {
        super(0);
        EnumC20698315z3 enumC20698315z3 = EnumC20698315z3.PHOTO_MODE;
        this.LLJJJJ = enumC20698315z3;
        this.LLJJJJLIIL = true;
        this.LLJJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1584));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nS(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.captionsheet.PhotoTranslationPanelFragmentV2.nS(android.view.View):void");
    }
}
