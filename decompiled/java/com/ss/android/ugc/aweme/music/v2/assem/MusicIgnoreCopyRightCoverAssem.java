package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C290550Ba9;
import X.C416480GUs;
import X.C418440Gaw;
import X.C628700OlI;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicPlayViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class MusicIgnoreCopyRightCoverAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public View LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final AssemVMLazy LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicIgnoreCopyRightCoverAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MusicIgnoreCopyRightCoverAssem.class, "musicPlayVM", "getMusicPlayVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicPlayViewModel;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MusicIgnoreCopyRightCoverAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 1263), AFwS240S0000000_9.get$arr$(533), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicPlayViewModel.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 1264), AFwS240S0000000_9.get$arr$(534), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return C628700OlI.LIZJ() ? R.layout.dq4 : C628700OlI.LIZ().musicCoverDesign == 2 ? R.layout.dq5 : R.layout.dq3;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        ((MusicPlayViewModel) assemVMLazy.getValue()).xQ2(false);
    }

    public static UrlModel lp(Music music) {
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        if (C290550Ba9.LIZ()) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(Collections.singletonList("https://sf16-sg.tiktokcdn.com/obj/eden-sg/aulpsJ-ojllwZ-hahK/ljhwZthlaukjlkulzlp/img_sdp_offlinesound_cover.png"));
            return urlModel;
        }
        if ((!music.isPgc() && (matchedPGCSoundInfo = music.getMatchedPGCSoundInfo()) != null && matchedPGCSoundInfo.getTitle() != null) || music.isPgc()) {
            UrlModel urlModel2 = new UrlModel();
            urlModel2.setUrlList(Collections.singletonList("https://sf16-sg.tiktokcdn.com/obj/eden-sg/aulpsJ-ojllwZ-hahK/ljhwZthlaukjlkulzlp/img_sdp_offlinesound_cover.png"));
            return urlModel2;
        }
        return music.getCoverMedium();
    }

    public void mp(View view) {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OlG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, null, null, new AwS588S0100000_9(this, 318), 14, null);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        Bundle arguments;
        mo127do();
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        MusicPlayViewModel musicPlayViewModel = (MusicPlayViewModel) assemVMLazy.getValue();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            arguments = fragmentLJI.getArguments();
        } else {
            arguments = null;
        }
        musicPlayViewModel.LL = arguments;
        ((MusicPlayViewModel) this.LLJJJIL.getValue()).LLILLJJLI = C724240Sb0.LIZ(this);
        this.LLJJIJIIJIL = view.findViewById(R.id.ou2);
        this.LLJJI = view.findViewById(R.id.ow3);
        this.LLJJIII = view.findViewById(R.id.owt);
        this.LLJJIJI = view.findViewById(R.id.ovu);
        view.findViewById(R.id.ox5);
        this.LLJJIJIL = view.findViewById(R.id.otu);
        if (!C628700OlI.LIZIZ()) {
            View view2 = this.LLJJI;
            if (view2 != null) {
                C416480GUs.LIZ(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
            }
            View view3 = this.LLJJIII;
            if (view3 != null) {
                C416480GUs.LIZ(view3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
            }
            View view4 = this.LLJJIJI;
            if (view4 != null) {
                C416480GUs.LIZ(view4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
            }
        }
        mp(view);
    }
}
