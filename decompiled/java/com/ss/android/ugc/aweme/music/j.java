package com.ss.android.ugc.aweme.music;

import X.C09R3;
import X.C13LE;
import X.C1647800syw;
import X.C1664770tQJ;
import X.C1697810uHb;
import X.C1DRG;
import X.C2217381BqS;
import X.C573120Mdq;
import X.EnumC1647570syZ;
import X.InterfaceC1628590sTx;
import X.InterfaceC1648020szI;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.AObjectS246S0100000_25;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class j extends C1647800syw {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final List<String> LLJJ;
    public final List<String> LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(j.class, "recordBottomTabComponent", "getRecordBottomTabComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(j.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJIJI = 8;
    }

    private final InterfaceC1648020szI H2() {
        return (InterfaceC1648020szI) this.LLJILJILJ.getValue(this, LLJJIII[0]);
    }

    private final InterfaceC1628590sTx w2() {
        return (InterfaceC1628590sTx) this.LLJILLL.getValue(this, LLJJIII[1]);
    }

    private final boolean G2() {
        return getShortVideoContext().shootMode == 16;
    }

    @Override // X.C1647800syw, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (C573120Mdq.LIZ()) {
            List<String> list = this.LLJJ;
            EnumC1647570syZ enumC1647570syZ = EnumC1647570syZ.RECORD_NOW;
            list.addAll(Collections.singletonList(enumC1647570syZ.getTag()));
            this.LLJJI.removeAll(Collections.singletonList(enumC1647570syZ.getTag()));
        }
        H2().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 122));
        w2().Wv().LIZ(this, new AObjectS246S0100000_25(this, 123));
        w2().Vk().LIZ(this, new AObjectS246S0100000_25(this, 124));
    }

    public j(C1DRG c1drg) {
        super(c1drg);
        this.LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1628590sTx.class, null);
        this.LLJJ = C1697810uHb.LJIILJJIL(EnumC1647570syZ.PHOTO_SHORT.getTag(), EnumC1647570syZ.RECORD_COMBINE.getTag(), EnumC1647570syZ.RECORD_COMBINE_15.getTag(), EnumC1647570syZ.RECORD_COMBINE_60.getTag(), EnumC1647570syZ.RECORD_COMBINE_180.getTag(), EnumC1647570syZ.RECORD_COMBINE_600.getTag(), EnumC1647570syZ.RECORD_SPLIT_3MIN.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_PHOTO.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_VIDEO.getTag(), EnumC1647570syZ.RECORD_SPLIT_LIGHTENING.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_QUICK.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_PHOTO_AND_VIDEO.getTag(), EnumC1647570syZ.NEW_BOTTOM_STORY.getTag(), EnumC1647570syZ.NEW_BOTTOM_DM_CAMERA.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_DM_VIDEO.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_DM_PHOTO.getTag());
        this.LLJJI = C1697810uHb.LJIILJJIL(EnumC1647570syZ.RECORD_NOW.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_TEXT.getTag(), "record_mode_duet", "DUET_MODE_CAMERA_RECORD", "record_mode_mv", EnumC1647570syZ.LIVE.getTag(), "AISelf");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T2(X.C1647390syH r5) {
        /*
            r4 = this;
            boolean r0 = r5.LJFF
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L22
            java.util.List<java.lang.String> r1 = r4.LLJJ
            java.lang.Object r0 = r5.LIZIZ
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 == 0) goto L20
            java.util.List<java.lang.String> r1 = r4.LLJJ
            java.lang.Object r0 = r5.LJI
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 == 0) goto L20
        L1a:
            r4.LLIZ = r3
            r4.Bu(r3)
            return
        L20:
            r3 = 0
            goto L1a
        L22:
            java.util.List<java.lang.String> r1 = r4.LLJJI
            java.lang.Object r0 = r5.LJI
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 == 0) goto L32
            r4.LLIZ = r2
            r4.Bu(r2)
            return
        L32:
            boolean r0 = r4.G2()
            if (r0 == 0) goto L3f
            boolean r0 = X.C573120Mdq.LIZ()
            if (r0 != 0) goto L3f
            r3 = 0
        L3f:
            r4.LLIZ = r3
            r4.Bu(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.j.T2(X.0syH):void");
    }
}
