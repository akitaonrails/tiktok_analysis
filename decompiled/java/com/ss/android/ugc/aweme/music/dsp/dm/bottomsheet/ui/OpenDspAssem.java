package com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.ui;

import X.C019F;
import X.C0P2V;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC626270OhN;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.dsp.dm.model.DmMessageConfig;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class OpenDspAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public C197039127h LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C1559260qg8 LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OpenDspAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/dsp/dm/bottomsheet/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public OpenDspAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1163), AFwS240S0000000_9.get$arr$(482), null, true);
        this.LLJI = new C1559260qg8(new C723580SZw(this, MediaCardHierarchyData.class, null), checkSupervisorPrepared());
    }

    public final C197039127h Go() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.j3g) : null;
            this.LLIZLLLIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final MediaCardHierarchyData Ho() {
        return (MediaCardHierarchyData) this.LLJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        DmMessageConfig dmMessageConfig;
        String strLIZIZ;
        DmMessageConfig dmMessageConfig2;
        DspPlatform dspPlatform;
        super.onViewCreated(view);
        C197039127h c197039127hGo = Go();
        Context context = getContext();
        EnumC626270OhN enumC626270OhN = null;
        if (context != null) {
            Object[] objArr = new Object[1];
            MediaCardHierarchyData mediaCardHierarchyDataHo = Ho();
            if (mediaCardHierarchyDataHo != null && (dmMessageConfig2 = mediaCardHierarchyDataHo.getDmMessageConfig()) != null && (dspPlatform = dmMessageConfig2.dspPlatform) != null) {
                strLIZIZ = C0P2V.LIZIZ(dspPlatform);
            } else {
                strLIZIZ = null;
            }
            objArr[0] = strLIZIZ;
            string = context.getString(2131832472, objArr);
        } else {
            string = null;
        }
        c197039127hGo.setText(string);
        C786410Ut5.I7(new AbS691S0100000_9(this, 19, 42), Go());
        MediaCardHierarchyData mediaCardHierarchyDataHo2 = Ho();
        if (mediaCardHierarchyDataHo2 != null && (dmMessageConfig = mediaCardHierarchyDataHo2.getDmMessageConfig()) != null) {
            enumC626270OhN = dmMessageConfig.contentType;
        }
        if (enumC626270OhN == EnumC626270OhN.TRACK) {
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OEy
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0O1C) obj).LL;
                }
            }, null, AFwS240S0000000_9.get$arr$(481), AFwS195S0000000_9.get$arr$(242), new AwS588S0100000_9(this, 286), 2, null);
            return;
        }
        Go().setButtonVariant(1);
    }
}
