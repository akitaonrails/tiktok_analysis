package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday;

import X.AbstractC214814194y;
import X.C0LE3;
import X.C0MGE;
import X.C0MWS;
import X.C1766560w4U;
import X.C201955140j;
import X.C2188811AlT;
import X.C560380LyO;
import X.C560470LyX;
import X.C786410Ut5;
import X.EnumC560450LyV;
import Y.ACListenerS143S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseOnThisDayPreviewScene extends AbstractC214814194y implements C0MGE, C0MWS {
    public ViewPager LLJJIJIL;
    public View LLJJJ;
    public ShortVideoContext LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final VideoPublishEditModel LLJJJIL = new VideoPublishEditModel();
    public String LLJJJJLIIL = "";
    public String LLJJL = "";

    @Override // X.C0MWS
    public final C0LE3 getType() {
        return null;
    }

    public void LLLLL() {
        ViewPager viewPager = this.LLJJLIIIJLLLLLLLZ ? (ViewPager) findViewById(R.id.rsj) : (ViewPager) findViewById(R.id.rsi);
        this.LLJJIJIL = viewPager;
        if (viewPager != null) {
            C786410Ut5.LLJ(viewPager, 0);
        }
        View viewFindViewById = findViewById(R.id.bmy);
        this.LLJJJ = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS143S0100000_8(this, 97), viewFindViewById);
        }
        LLLLJI();
    }

    public void LLLLJI() {
        TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ(requireFragmentActivity());
        tuxImmersionBarLJ.LIZJ(false, false);
        tuxImmersionBarLJ.LJ(R.attr.e1);
        tuxImmersionBarLJ.LJIIIIZZ(R.attr.e1);
        tuxImmersionBarLJ.LIZIZ.LJIIJ(false);
        tuxImmersionBarLJ.LIZLLL();
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onPause() {
        super.onPause();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(":(BaseOnThisDayPreviewScene) onPause");
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onResume() {
        super.onResume();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(":(BaseOnThisDayPreviewScene) onResume");
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        EnumC560450LyV enumC560450LyV = EnumC560450LyV.OTHERS;
        C560380LyO.LJIIZILJ(enumC560450LyV, null, this.LLJJJIL);
        C560380LyO.LJIILLIIL(new C560470LyX(enumC560450LyV, System.currentTimeMillis()));
    }

    @Override // X.C0MWS
    public final void LJLL(boolean z) {
        C786410Ut5.LJLLLLLL(8, this.mView);
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        int i;
        String string;
        String string2;
        super.onActivityCreated(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("celebration_type");
        } else {
            i = 0;
        }
        this.LLJJJJJIL = i;
        Bundle bundle3 = this.mArguments;
        String str = "";
        if (bundle3 == null || (string = bundle3.getString("unique_id")) == null) {
            string = "";
        }
        this.LLJJJJLIIL = string;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null && (string2 = bundle4.getString("enter_method")) != null) {
            str = string2;
        }
        this.LLJJL = str;
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eqy, viewGroup, false);
    }
}
