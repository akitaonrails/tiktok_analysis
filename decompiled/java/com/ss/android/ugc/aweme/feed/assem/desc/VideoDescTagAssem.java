package com.ss.android.ugc.aweme.feed.assem.desc;

import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1A5L;
import X.C21279718Pj;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C715860S6e;
import X.C724750Sbp;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1294060jmO;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.assem.desc.commerce.PromotedTagVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
@InterfaceC1294060jmO
public final class VideoDescTagAssem extends ReusedUIContentAssem<VideoDescTagAssem> implements InterfaceC712990Rxx<VideoItemParams> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public TuxTextView LLJJJJ;
    public TuxTag LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public C21279718Pj LLJJL;
    public C21279718Pj LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final C715860S6e LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoDescTagAssem.class, "promotedTagVM", "getPromotedTagVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/commerce/PromotedTagVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoDescTagAssem.class, "videoDescVM", "getVideoDescVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/VideoDescVM;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public VideoDescTagAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PromotedTagVM.class);
        this.LLJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 222), null, AFwS243S0000000_11.get$arr$(63));
        this.LLJLILLLLZIIL = new C715860S6e(this);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final VideoDescVM cp() {
        return (VideoDescVM) this.LLJLILLLLZIIL.getValue(this, LLJLL[1]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.s_v);
        this.LLJJJJJIL = (TuxTag) view.findViewById(R.id.yhh);
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.q0v);
        this.LLJJL = (C21279718Pj) view.findViewById(R.id.q0w);
        this.LLJJLIIIJLLLLLLLZ = (C21279718Pj) view.findViewById(R.id.jla);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.asr);
        this.LLJL = tuxTextView;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C2271391DvN.LIZ(tuxTextView, (C1A5L) C2271381DvM.LLZIL.getValue());
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJLIL.getValue(this, LLJLL[0]);
        subscribe(assemViewModel, C736820SvI.LIZIZ(assemViewModel.usedInReusedScene), null, AFwS294S0000000_11.get$arr$(231));
        VideoDescVM videoDescVMCp = cp();
        subscribe(videoDescVMCp, C736820SvI.LIZIZ(videoDescVMCp.usedInReusedScene), null, AFwS294S0000000_11.get$arr$(232));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(VideoItemParams videoItemParams) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
