package rlf;

import X.C01GW;
import X.C13LE;
import X.C1697810uHb;
import X.C2217371BqR;
import X.C452501pT;
import X.C572340Mca;
import X.InterfaceC2217461Bqa;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final a LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final C01GW LIZJ;
    public static final C572340Mca LIZLLL;
    public static final List<Integer> LJ;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(a.class, "lastMode", "getLastMode()I", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217371BqR};
        LIZ = new a();
        LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(512));
        LIZLLL = new C572340Mca(AFwS194S0000000_8.get$arr$(511), -1);
        LJ = C1697810uHb.LJIIJJI(16, 10, 11, 14, 18);
    }

    public final int LIZ() {
        return ((Number) LIZLLL.getValue(this, LIZIZ[0])).intValue();
    }

    public final int LIZIZ(ShortVideoContext shortVideoContext, Function0<Boolean> function0) {
        if (shortVideoContext.LJJIIZI() || shortVideoContext.LJJIJIIJI() || shortVideoContext.cameraComponentModel.isEditorProRecordMode || !Intrinsics.LJFF(shortVideoContext.shootWay, "direct_shoot")) {
            return -1;
        }
        if (LIZ() == 16 && !function0.invoke().booleanValue()) {
            return -1;
        }
        return LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.Object r8, java.lang.String r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.shortvideo.ShortVideoContext
            r4 = 1
            r6 = 0
            if (r0 == 0) goto L88
            X.0HZe r5 = new X.0HZe
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0 = r8
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContext) r0
            java.lang.String r1 = r0.shootWay
            int r0 = r0.shootMode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.<init>(r2, r1, r0)
        L18:
            java.lang.Object r0 = r5.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            java.lang.Object r1 = r5.getSecond()
            java.lang.Object r0 = r5.getThird()
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel
            java.lang.String r3 = "save_draft_in_ai_generating"
            if (r0 == 0) goto L86
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r8
            boolean r0 = X.C0BUD.LIZ()
            if (r0 == 0) goto L86
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r8.creativeModel
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet r0 = r0.aigcBusinessModel
            com.ss.android.ugc.aweme.theater.model.AITheaterModel r0 = r0.aiTheaterModel
            if (r0 != 0) goto L4c
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r3)
            if (r0 == 0) goto L86
        L4c:
            if (r2 != 0) goto L50
            if (r4 == 0) goto L85
        L50:
            java.lang.String r0 = "direct_shoot"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L85
            java.util.List<java.lang.Integer> r1 = rlf.a.LJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L85
            java.lang.String r2 = "publish"
            java.lang.String r1 = "save_local"
            java.lang.String r0 = "save_draft"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0, r2, r3}
            java.util.List r0 = X.C1697810uHb.LJIIJJI(r0)
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L85
            X.0Mca r2 = rlf.a.LIZLLL
            X.1Bqa<java.lang.Object>[] r0 = rlf.a.LIZIZ
            r1 = r0[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.setValue(r7, r1, r0)
        L85:
            return
        L86:
            r4 = 0
            goto L4c
        L88:
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel
            if (r0 == 0) goto Lad
            X.0HZe r5 = new X.0HZe
            r3 = r8
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r3
            int r0 = r3.getOriginal()
            if (r0 != r4) goto Lab
            r0 = 1
        L98:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = r3.mShootWay
            int r0 = r3.getShootMode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.<init>(r2, r1, r0)
            goto L18
        Lab:
            r0 = 0
            goto L98
        Lad:
            X.0HZe r5 = new X.0HZe
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = ""
            r5.<init>(r2, r0, r1)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: rlf.a.LIZJ(java.lang.Object, java.lang.String):void");
    }
}
