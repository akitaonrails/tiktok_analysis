package com.ss.android.ugc.aweme.feed.assem.duetbutton;

import X.C13LE;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C299670Bor;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC700430Rdh;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS110S0200000_6;
import Y.ARunnableS14S0101000_3;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class VideoDuetButtonAssem extends BaseCellSlotComponent<VideoDuetButtonAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public C197039127h LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoDuetButtonAssem.class, "duetButtonVM", "getDuetButtonVM()Lcom/ss/android/ugc/aweme/feed/assem/duetbutton/VideoDuetButtonViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public VideoDuetButtonAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoDuetButtonViewModel.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 79), null, AFwS236S0000000_6.get$arr$(60));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b9w;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.gbl);
        this.LLJLLIL = c197039127h;
        C197039127h c197039127h2 = null;
        if (c197039127h == null) {
            c197039127h = null;
        }
        setComponentClickStatusExperimental(c197039127h, EnumC700430Rdh.POSITIVE);
        C197039127h c197039127h3 = this.LLJLLIL;
        if (c197039127h3 == null) {
            c197039127h3 = null;
        }
        C786410Ut5.U8(c197039127h3, new ACListenerS110S0200000_6(this, view, 4));
        if (C299670Bor.LIZ()) {
            C197039127h c197039127h4 = this.LLJLLIL;
            if (c197039127h4 != null) {
                c197039127h2 = c197039127h4;
            }
            ViewGroup.LayoutParams layoutParams = c197039127h2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                C786410Ut5.W5(c197039127h2, layoutParams);
                c197039127h2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                c197039127h2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        Object value = this.LLJLLL.getValue(this, LLJZ[0]);
        Aweme aweme = videoItemParams2.getAweme();
        value.getClass();
        if (VideoDuetButtonViewModel.vQ2(aweme)) {
            HandlerHook.viewPost(LJJIJL(), new ARunnableS14S0101000_3(0, this, 8));
            C786410Ut5.LJLLLLLL(0, getContentView());
            Aweme aweme2 = videoItemParams2.getAweme();
            String str = videoItemParams2.mEventType;
            ShareDependService.LIZ.getClass();
            ShareDependServiceImpl.LJJJJI().LJJIJIIJIL(str, AwemeExtKt.getAuthorUid(aweme2), aweme2.getAid());
            return;
        }
        C786410Ut5.LJLLLLLL(8, getContentView());
        HandlerHook.viewPost(LJJIJL(), new ARunnableS14S0101000_3(8, this, 8));
    }
}
