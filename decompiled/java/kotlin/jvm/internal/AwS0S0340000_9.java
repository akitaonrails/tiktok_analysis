package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C1163440gNi;
import X.C13LE;
import X.C628830OlV;
import X.C629010Oln;
import X.C629020Olo;
import X.C636090OxD;
import X.C713240RyM;
import com.ss.android.ugc.aweme.detail.prefab.DetailHeaderAssem;
import com.ss.android.ugc.aweme.detail.prefab.DetailPageContainerAssem;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.StudioMusicExService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS0S0340000_9 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;
    public boolean z4;
    public boolean z5;
    public boolean z6;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S0340000_9 awS0S0340000_9, Object obj) {
        C628830OlV c628830OlV = (C628830OlV) obj;
        c628830OlV.LL = C13LE.LIZ(DetailHeaderAssem.class);
        c628830OlV.LLJIJIL = C1163440gNi.LIZJ;
        c628830OlV.LJII("basic_info", new AwS588S0100000_9((MusicDetail) awS0S0340000_9.l0, 458));
        if (StudioMusicExService.INSTANCE.enableShare()) {
            c628830OlV.LJII("advanced_info", new AwS375S0200000_9((MusicDetailFragment) awS0S0340000_9.l1, (MusicDetail) awS0S0340000_9.l0, 125));
            c628830OlV.LJII("buttons", new C629020Olo(awS0S0340000_9.z3, awS0S0340000_9.z4, (C013C) awS0S0340000_9.l2, awS0S0340000_9.z5, awS0S0340000_9.z6, (MusicDetailFragment) awS0S0340000_9.l1));
            c628830OlV.LJII("custom1", new AwS375S0200000_9((MusicDetailFragment) awS0S0340000_9.l1, (MusicDetail) awS0S0340000_9.l0, 127));
        }
        C629010Oln.LIZ(c628830OlV, "advanced_info");
        C629010Oln.LIZ(c628830OlV, "buttons");
        C629010Oln.LIZ(c628830OlV, "custom1");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0340000_9 awS0S0340000_9, Object obj) {
        C628830OlV c628830OlV = (C628830OlV) obj;
        c628830OlV.LL = C13LE.LIZ(DetailPageContainerAssem.class);
        c628830OlV.LLIZLLLIL = R.id.ex3;
        c628830OlV.LLJIJIL = C1163440gNi.LIZJ;
        c628830OlV.LJII("navbar", AFwS240S0000000_9.get$arr$(795));
        c628830OlV.LJII("content", AFwS240S0000000_9.get$arr$(797));
        c628830OlV.LJII("header", new AwS0S0340000_9((MusicDetail) awS0S0340000_9.l0, (MusicDetailFragment) awS0S0340000_9.l1, (C013C) awS0S0340000_9.l2, awS0S0340000_9.z3, awS0S0340000_9.z4, awS0S0340000_9.z5, awS0S0340000_9.z6, 0));
        c628830OlV.LJII(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, new AwS588S0100000_9((MusicDetailFragment) awS0S0340000_9.l1, 456));
        c628830OlV.LJII("record", new AwS588S0100000_9((MusicDetailFragment) awS0S0340000_9.l1, 459));
        if (C636090OxD.LIZ()) {
            c628830OlV.LJII("bottom_mask_view", AFwS240S0000000_9.get$arr$(754));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S0340000_9 awS0S0340000_9, Object obj) {
        MusicDetailFragment musicDetailFragment = (MusicDetailFragment) awS0S0340000_9.l0;
        C713240RyM.LIZ(musicDetailFragment, new AwS0S0340000_9((MusicDetail) awS0S0340000_9.l1, musicDetailFragment, (C013C) awS0S0340000_9.l2, awS0S0340000_9.z3, awS0S0340000_9.z4, awS0S0340000_9.z5, awS0S0340000_9.z6, 1));
        C713240RyM.LIZ((MusicDetailFragment) awS0S0340000_9.l0, AFwS236S0000000_6.get$arr$(421));
        C713240RyM.LIZ((MusicDetailFragment) awS0S0340000_9.l0, AFwS240S0000000_9.get$arr$(760));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS0S0340000_9(com.ss.android.ugc.aweme.music.model.MusicDetail r3, com.ss.android.ugc.aweme.music.v2.MusicDetailFragment r4, X.C013C r5, boolean r6, boolean r7, boolean r8, boolean r9, int r10) {
        /*
            r2 = this;
            r2.$t = r10
            switch(r10) {
                case 0: goto L19;
                case 1: goto L19;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.z3 = r6
            r1.z4 = r7
            r1.l2 = r5
            r1.z5 = r8
            r1.z6 = r9
            r0 = 1
        L15:
            r1.<init>(r0)
            return
        L19:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.z3 = r6
            r1.z4 = r7
            r1.l2 = r5
            r1.z5 = r8
            r1.z6 = r9
            r0 = 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS0S0340000_9.<init>(com.ss.android.ugc.aweme.music.model.MusicDetail, com.ss.android.ugc.aweme.music.v2.MusicDetailFragment, X.013C, boolean, boolean, boolean, boolean, int):void");
    }
}
