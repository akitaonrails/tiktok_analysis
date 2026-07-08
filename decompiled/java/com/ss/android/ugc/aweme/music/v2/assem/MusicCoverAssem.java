package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0ATF;
import X.C0ZP4;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C628700OlI;
import X.C630310Ont;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.flexible.api.FlexibleComponentCallback;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicPlayViewModel;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class MusicCoverAssem extends DynamicAssem implements MusicPlayAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public View LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public View LLJJJ;
    public C0ZP4 LLJJJIL;
    public C0ZP4 LLJJJJ;
    public C0ZP4 LLJJJJJIL;
    public final AssemVMLazy LLJJJJLIIL;
    public final AssemVMLazy LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public Integer LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCoverAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MusicCoverAssem.class, "musicPlayVM", "getMusicPlayVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicPlayViewModel;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MusicCoverAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 1232), AFwS240S0000000_9.get$arr$(521), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicPlayViewModel.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 1233), AFwS240S0000000_9.get$arr$(522), null, true);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(254));
        this.LLJL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(253));
        this.LLJLIL = 0;
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1230));
        this.LLJLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1231));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final int mp() {
        return ((Number) this.LLJLILLLLZIIL.getValue()).intValue();
    }

    public final MusicDetailViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (MusicDetailViewModel) assemVMLazy.getValue();
    }

    public final MusicPlayViewModel sp() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (MusicPlayViewModel) assemVMLazy.getValue();
    }

    public final IPlayerComponentAbility x32() {
        return (IPlayerComponentAbility) this.LLJLL.getValue();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return C628700OlI.LIZJ() ? R.layout.dq4 : C628700OlI.LIZ().musicCoverDesign == 2 ? R.layout.dq5 : R.layout.dq3;
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.MusicPlayAbility
    public final void LJJL() {
        sp().xQ2(false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        FlexibleComponentCallback flexibleComponentCallback;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        super.onDestroy();
        if (!op().LLJJJJ || op().LLJJJJJIL) {
            return;
        }
        Integer num = this.LLJLIL;
        if (num == null || num.intValue() != 0) {
            Integer num2 = this.LLJLIL;
            if (num2 == null || num2.intValue() != 3) {
                IPlayerComponentAbility iPlayerComponentAbilityX322 = x32();
                if ((iPlayerComponentAbilityX322 != null && iPlayerComponentAbilityX322.uz1() == 4) || (flexibleComponentCallback = (FlexibleComponentCallback) C1558520qew.LIZ(C1558520qew.LJIIL(this), FlexibleComponentCallback.class, null)) == null || flexibleComponentCallback.Be1() || (iPlayerComponentAbilityX32 = x32()) == null) {
                    return;
                }
                iPlayerComponentAbilityX32.tryResumePlay();
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        sp().xQ2(false);
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.MusicPlayAbility
    public final void cz2(Music music) {
        Integer num;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        if (op().LLJJJJ && (((num = this.LLJLIL) == null || num.intValue() != 3) && (iPlayerComponentAbilityX32 = x32()) != null)) {
            iPlayerComponentAbilityX32.tryResumePlay();
        }
        tp(false);
        sp().xQ2(false);
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.MusicPlayAbility
    public final void oS1(Music music) {
        IMDPAutoPlayAbility iMDPAutoPlayAbility;
        Integer num;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        if (op().LLJJJJ && (((num = this.LLJLIL) == null || num.intValue() != 3) && (iPlayerComponentAbilityX32 = x32()) != null)) {
            iPlayerComponentAbilityX32.LLLLLLLLLL();
        }
        tp(true);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        if (interfaceC665370Q7zLJIIL != null && (iMDPAutoPlayAbility = (IMDPAutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IMDPAutoPlayAbility.class, null)) != null) {
            iMDPAutoPlayAbility.Fq2(true);
        }
        sp().wQ2(music, false, false, mp());
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.music.v2.assem.MusicCoverAssem for r7v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(android.view.View r8) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.assem.MusicCoverAssem.onViewCreated(android.view.View):void");
    }

    public final void tp(boolean z) {
        if (C628700OlI.LIZ().alwaysAutoPlayMDPMusic) {
            return;
        }
        ((Keva) this.LLJJLIIIJLLLLLLLZ.getValue()).storeBoolean((String) this.LLJL.getValue(), z);
    }

    public void up(View view) {
        AssemViewModel.asyncSubscribe$default(op(), new C2217381BqS() { // from class: X.0OoD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, null, null, new AwS375S0200000_9(this, view, 70), 14, null);
    }

    public static UrlModel lp(Music music, MusicDetail musicDetail) {
        UrlModel urlModel;
        if (((Boolean) C0ATF.LIZ.getValue()).booleanValue() && (urlModel = musicDetail.localCoverUrl) != null) {
            return urlModel;
        }
        if (C630310Ont.LIZIZ(music)) {
            return C630310Ont.LIZLLL(music);
        }
        return music.getCoverMedium();
    }
}
