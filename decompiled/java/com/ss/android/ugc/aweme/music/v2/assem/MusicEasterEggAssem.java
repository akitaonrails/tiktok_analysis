package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C01GW;
import X.C0XQ7;
import X.C13LE;
import X.C1548820qPI;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C630120Ona;
import X.C638910P4f;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicEasterEggAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJJI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public String LLJJIJIL;
    public boolean LLJJJ;
    public MusicDetail LLJJJIL;
    public final C638910P4f LLJJJJ;
    public final C638910P4f LLJJJJJIL;
    public final C638910P4f LLJJJJLIIL;
    public final C638910P4f LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicEasterEggAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicEasterEggAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1251), AFwS240S0000000_9.get$arr$(528), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(256));
        this.LLJJJJ = new C638910P4f(this, 10);
        this.LLJJJJJIL = new C638910P4f(this, 8);
        this.LLJJJJLIIL = new C638910P4f(this, 7);
        this.LLJJL = new C638910P4f(this, 9);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dq0;
    }

    public final void release() {
        FrameLayout frameLayout;
        if (this.LLJJIJI) {
            C1548820qPI.LJIIIIZZ("onStart", this.LLJJJJ);
            C1548820qPI.LJIIIIZZ("onError", this.LLJJL);
            C1548820qPI.LJIIIIZZ("onClick", this.LLJJJJLIIL);
            C1548820qPI.LJIIIIZZ("onClose", this.LLJJJJJIL);
            this.LLJJIJI = false;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIII;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        this.LLJJIII = null;
        C630120Ona.LIZ(getContentView());
        View contentView = getContentView();
        if ((contentView instanceof FrameLayout) && (frameLayout = (FrameLayout) contentView) != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        this.LLJJJ = false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        release();
        super.onDestroy();
    }

    public static String lp(String str) {
        boolean z;
        C0XQ7.LJ();
        String curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
        if (curUserId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            curUserId = CardStruct.IStatusCode.DEFAULT;
        }
        if (str.length() == 0) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C786410Ut5.j4("need_show_easter_egg_%s", Arrays.copyOf(new Object[]{C2188811AlT.LIZIZ(sbLIZ)}, 1));
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OyP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, null, null, new AwS588S0100000_9(this, 316), 14, null);
    }
}
