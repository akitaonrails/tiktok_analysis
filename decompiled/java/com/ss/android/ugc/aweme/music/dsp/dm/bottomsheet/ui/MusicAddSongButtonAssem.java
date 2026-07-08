package com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.ui;

import X.C019F;
import X.C0OF4;
import X.C0P4R;
import X.C1391190mJ3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C633020OsG;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.DspSheetType;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicAddSongButtonAssem extends UIContentAssem {
    public static final C0OF4 LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public C197039127h LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C1559260qg8 LLJI;
    public Music LLJIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0OF4] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicAddSongButtonAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/dsp/dm/bottomsheet/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJIL = new Object() { // from class: X.0OF4
        };
    }

    public MusicAddSongButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1162), AFwS240S0000000_9.get$arr$(480), null, true);
        this.LLJI = new C1559260qg8(new C723580SZw(this, MediaCardHierarchyData.class, null), checkSupervisorPrepared());
    }

    public final C197039127h Go() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.af1) : null;
            this.LLIZLLLIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OEx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0O1C) obj).LL;
            }
        }, null, new AwS588S0100000_9(this, 284), new AwS553S0100000_9(this, 1161), new AwS588S0100000_9(this, 285), 2, null);
    }

    public final void Ho(AddSongContextData addSongContextData, List<TT2DSPSongInfo> list) {
        Fragment fragmentLJFF;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null) {
            return;
        }
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        IIMChatRoomOpenService iIMChatRoomOpenService = (IIMChatRoomOpenService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomOpenService.class, false, false, false, 14, null);
        if (iIMChatRoomOpenService != null) {
            fragmentLJFF = iIMChatRoomOpenService.LJFF(C724240Sb0.LIZ(this));
        } else {
            fragmentLJFF = null;
        }
        Fragment fragmentLJIL = c633020OsG.LJIL(fragmentLJFF, addSongContextData, DspSheetType.SELECT_DSP, list);
        if (fragmentLJIL == null) {
            return;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        DmDspDialogFragment.LLJJ.getClass();
        ArrayList arrayList = (ArrayList) DmDspDialogFragment.LLJJIII;
        arrayList.clear();
        arrayList.add(new C0P4R(addSongContextData, c19egLIZ, 2));
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIJI(fragmentLJI, fragmentLJIL, false, null, 8);
    }
}
