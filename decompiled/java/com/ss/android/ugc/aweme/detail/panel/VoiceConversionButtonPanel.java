package com.ss.android.ugc.aweme.detail.panel;

import X.C21459218yU;
import X.C302080Bsk;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C814420VxA;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.detail.IVoiceConversionReuseService;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionRecordService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class VoiceConversionButtonPanel extends ShootFeedPanel {
    public final Bundle G0;
    public final String H0;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int L0() {
        return 2131822401;
    }

    public VoiceConversionButtonPanel(Bundle bundle) {
        String string;
        this.G0 = bundle;
        if (bundle != null) {
            string = bundle.getString("feed_data_voice_conversion_voice_name");
        } else {
            string = null;
        }
        this.H0 = string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void I0(View view) {
        Music music;
        String string;
        Music music2;
        IVoiceConversionReuseService iVoiceConversionReuseServiceLJ = VoiceConversionRecordService.LJ();
        Activity activity = this.activity;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
        Aweme awemeO = o();
        MusicModel musicModelConvertToMusicModel = null;
        if (awemeO != null) {
            music = awemeO.getMusic();
        } else {
            music = null;
        }
        Aweme awemeO2 = o();
        if (awemeO2 != null && (music2 = awemeO2.getMusic()) != null) {
            musicModelConvertToMusicModel = music2.convertToMusicModel();
        }
        String str = this.H0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Bundle bundle = this.G0;
        if (bundle != null && (string = bundle.getString("voice_conversion_id", "")) != null) {
            str2 = string;
        }
        iVoiceConversionReuseServiceLJ.LIZIZ(lifecycleOwner, activity, music, musicModelConvertToMusicModel, str, str2, "VoiceConversionButtonPanel");
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View M0(RelativeLayout relativeLayout) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.blv, relativeLayout, false);
        C21459218yU c21459218yU = (C21459218yU) viewTd.findViewById(R.id.hu1);
        String str = this.H0;
        if (str != null) {
            c21459218yU.setTuxFont(42);
            N0(c21459218yU, str);
        }
        if (C302080Bsk.LIZ()) {
            TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.syy);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZ = R.raw.icon_camera_fill;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            tuxIconView.setTuxIcon(c419910GdJ);
            TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.szn);
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                }
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.R6(tuxTextView, marginLayoutParams);
            TuxIconView tuxIconView2 = (TuxIconView) viewTd.findViewById(R.id.voice_icon);
            ViewGroup.LayoutParams layoutParams2 = tuxIconView2.getLayoutParams();
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            C786410Ut5.M6(tuxIconView2, layoutParams2);
        }
        return viewTd;
    }
}
