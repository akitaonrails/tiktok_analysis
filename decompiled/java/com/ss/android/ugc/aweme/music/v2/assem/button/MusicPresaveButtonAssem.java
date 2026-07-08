package com.ss.android.ugc.aweme.music.v2.assem.button;

import X.C019F;
import X.C01GW;
import X.C0P08;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C297350Bl7;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C608360Nta;
import X.C629390OmP;
import X.C633020OsG;
import X.C634020Ots;
import X.C638370P2d;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C814420VxA;
import X.EnumC631300OpU;
import X.EnumC631330OpX;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.PreSaveLogData;
import com.ss.android.ugc.aweme.music.model.TT2DspAlbumInfo;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicPresaveButtonAssem extends DynamicAssem {
    public static final C629390OmP LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1316));
    public final AssemVMLazy LLJJIII;
    public Music LLJJIJI;
    public C197039127h LLJJIJIIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0OmP] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicPresaveButtonAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = new Object() { // from class: X.0OmP
        };
    }

    public MusicPresaveButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1317), AFwS240S0000000_9.get$arr$(547), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dpo;
    }

    public final void mp() {
        C0P08 c0p08;
        C0P08 c0p082;
        C0P08 c0p083;
        C0P08 c0p084;
        C0P08 c0p085;
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        Music music = this.LLJJIJI;
        DspPlatform dspPlatformLJJIZ = c633020OsG.LJJIZ(music != null ? music.getTT2DspAlbumInfo() : null);
        DspPlatform dspPlatform = DspPlatform.UNKNOWN;
        int i = R.raw.icon_list_add;
        if (dspPlatformLJJIZ != dspPlatform) {
            C197039127h c197039127h = this.LLJJIJIIJIL;
            if (c197039127h != null) {
                c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_list_add));
            }
            C197039127h c197039127h2 = this.LLJJIJIIJIL;
            if ((c197039127h2 instanceof C0P08) && (c0p082 = (C0P08) c197039127h2) != null) {
                c0p082.LJJLIIIIJ();
            }
            C197039127h c197039127h3 = this.LLJJIJIIJIL;
            if ((c197039127h3 instanceof C0P08) && (c0p08 = (C0P08) c197039127h3) != null) {
                c0p08.setFallbackEnabled(false);
            }
            C197039127h c197039127h4 = this.LLJJIJIIJIL;
            if (c197039127h4 != null) {
                c197039127h4.setText(2131826339);
                return;
            }
            return;
        }
        Music music2 = this.LLJJIJI;
        List<DspPlatform> listLJJLIIIJJI = c633020OsG.LJJLIIIJJI(null, music2 != null ? music2.getTT2DspAlbumInfo() : null, null, null);
        if (listLJJLIIIJJI.size() != 1) {
            C197039127h c197039127h5 = this.LLJJIJIIJIL;
            if (c197039127h5 != null) {
                c197039127h5.setButtonStartIcon(Integer.valueOf(R.raw.icon_list_add));
            }
            C197039127h c197039127h6 = this.LLJJIJIIJIL;
            if ((c197039127h6 instanceof C0P08) && (c0p084 = (C0P08) c197039127h6) != null) {
                c0p084.LJJLIIIIJ();
            }
            C197039127h c197039127h7 = this.LLJJIJIIJIL;
            if ((c197039127h7 instanceof C0P08) && (c0p083 = (C0P08) c197039127h7) != null) {
                c0p083.setFallbackEnabled(false);
            }
            C197039127h c197039127h8 = this.LLJJIJIIJIL;
            if (c197039127h8 != null) {
                c197039127h8.setText(2131826339);
                return;
            }
            return;
        }
        C197039127h c197039127h9 = this.LLJJIJIIJIL;
        if (c197039127h9 != null) {
            c197039127h9.LJJJJJ();
        }
        C197039127h c197039127h10 = this.LLJJIJIIJIL;
        if (c197039127h10 != null) {
            int i2 = C638370P2d.LIZ[((DspPlatform) ListProtector.get(listLJJLIIIJJI, 0)).ordinal()];
            if (i2 == 1) {
                i = R.raw.icon_color_apple_music;
            } else if (i2 == 2) {
                i = R.raw.icon_color_amazon_music;
            } else if (i2 == 3) {
                i = R.raw.icon_color_spotify_icon;
            }
            c197039127h10.setButtonStartIcon(Integer.valueOf(i));
        }
        C197039127h c197039127h11 = this.LLJJIJIIJIL;
        if ((c197039127h11 instanceof C0P08) && (c0p085 = (C0P08) c197039127h11) != null) {
            c0p085.setFallbackEnabled(false);
        }
        C197039127h c197039127h12 = this.LLJJIJIIJIL;
        if (c197039127h12 != null) {
            c197039127h12.setText(2131826339);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU
    public final void onReceiveMusic2DspAuthEvent(C608360Nta c608360Nta) {
        mp();
    }

    @C14EU
    public final void onReceiveMusic2DspLinkChangeEvent(C634020Ots c634020Ots) {
        mp();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        EventBus.LIZLLL().LJIJJ(this);
        C197039127h c197039127h = (C197039127h) view;
        this.LLJJIJIIJIL = c197039127h;
        if (c197039127h != null) {
            c197039127h.setTag(R.id.ih9, "font_sync");
        }
        C197039127h c197039127h2 = this.LLJJIJIIJIL;
        if (c197039127h2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
            c197039127h2.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
        }
        if (C297350Bl7.LIZ()) {
            C197039127h c197039127h3 = this.LLJJIJIIJIL;
            if (c197039127h3 != null) {
                c197039127h3.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            }
            C197039127h c197039127h4 = this.LLJJIJIIJIL;
            if (c197039127h4 != null) {
                c197039127h4.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OpY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, null, null, new AwS588S0100000_9(this, 324), 14, null);
        lp(this, true, false, 2);
        Music music = this.LLJJIJI;
        if (music != null) {
            C633020OsG.LIZIZ.LJIILLIIL(music, music.getTT2DspAlbumInfo());
        }
    }

    public static void lp(MusicPresaveButtonAssem musicPresaveButtonAssem, boolean z, boolean z2, int i) {
        String metaAlbumId;
        TT2DspAlbumInfo tT2DspAlbumInfo;
        TT2DspAlbumInfo tT2DspAlbumInfo2;
        boolean z3;
        TT2DspAlbumInfo tT2DspAlbumInfo3;
        boolean z4;
        TT2DspAlbumInfo tT2DspAlbumInfo4;
        String str;
        EnumC631330OpX enumC631330OpX;
        String id;
        MatchedSoundInfo matchedSongInfo;
        Bundle arguments;
        String string;
        TT2DspAlbumInfo tT2DspAlbumInfo5;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        Music music = musicPresaveButtonAssem.LLJJIJI;
        String str2 = "";
        if (music == null || (tT2DspAlbumInfo5 = music.getTT2DspAlbumInfo()) == null || (metaAlbumId = tT2DspAlbumInfo5.getMetaAlbumId()) == null) {
            metaAlbumId = "";
        }
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        Music music2 = musicPresaveButtonAssem.LLJJIJI;
        if (music2 != null) {
            tT2DspAlbumInfo = music2.getTT2DspAlbumInfo();
        } else {
            tT2DspAlbumInfo = null;
        }
        DspPlatform dspPlatformLJJIZ = c633020OsG.LJJIZ(tT2DspAlbumInfo);
        Fragment fragmentLJI = C724240Sb0.LJI(musicPresaveButtonAssem);
        if (fragmentLJI != null && (arguments = fragmentLJI.getArguments()) != null && (string = arguments.getString("first_enter_from")) != null) {
            str2 = string;
        }
        Music music3 = musicPresaveButtonAssem.LLJJIJI;
        String str3 = (String) musicPresaveButtonAssem.LLJJI.getValue();
        Music music4 = musicPresaveButtonAssem.LLJJIJI;
        if (music4 != null) {
            tT2DspAlbumInfo2 = music4.getTT2DspAlbumInfo();
        } else {
            tT2DspAlbumInfo2 = null;
        }
        DspPlatform dspPlatformLJJIZ2 = c633020OsG.LJJIZ(tT2DspAlbumInfo2);
        DspPlatform dspPlatform = DspPlatform.UNKNOWN;
        if (dspPlatformLJJIZ2 != dspPlatform) {
            z3 = true;
        } else {
            z3 = false;
        }
        Music music5 = musicPresaveButtonAssem.LLJJIJI;
        if (music5 != null) {
            tT2DspAlbumInfo3 = music5.getTT2DspAlbumInfo();
        } else {
            tT2DspAlbumInfo3 = null;
        }
        if (c633020OsG.LJJIZ(tT2DspAlbumInfo3) != dspPlatform) {
            z4 = true;
        } else {
            z4 = false;
        }
        Music music6 = musicPresaveButtonAssem.LLJJIJI;
        if (music6 != null) {
            tT2DspAlbumInfo4 = music6.getTT2DspAlbumInfo();
        } else {
            tT2DspAlbumInfo4 = null;
        }
        int size = c633020OsG.LJJLIIIJJI(music6, tT2DspAlbumInfo4, null, null).size();
        AssemVMLazy assemVMLazy = musicPresaveButtonAssem.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        if (((MusicDetailViewModel) assemVMLazy.getValue()).LLJJJJ) {
            str = ((MusicDetailViewModel) musicPresaveButtonAssem.LLJJIII.getValue()).LLJJJJLIIL;
        } else {
            str = null;
        }
        String idStr = null;
        PreSaveLogData preSaveLogData = new PreSaveLogData(dspPlatformLJJIZ, "single_song", str2, null, music3, str3, null, null, metaAlbumId, Boolean.valueOf(z3), Boolean.valueOf(z4), Integer.valueOf(size), str, null);
        if (z) {
            c633020OsG.LIZ(preSaveLogData);
        } else if (z2) {
            c633020OsG.LJJLIIIJLLLLLLLZ(preSaveLogData);
        }
        if (z) {
            enumC631330OpX = EnumC631330OpX.PRESAVE_SHOW;
        } else {
            enumC631330OpX = EnumC631330OpX.PRESAVE_CLICK;
        }
        int value = enumC631330OpX.getValue();
        int value2 = EnumC631300OpU.TT_TO_DSP.getValue();
        String str4 = (String) musicPresaveButtonAssem.LLJJI.getValue();
        Music music7 = musicPresaveButtonAssem.LLJJIJI;
        if (music7 != null) {
            idStr = music7.getIdStr();
        }
        Music music8 = musicPresaveButtonAssem.LLJJIJI;
        if (music8 != null && (matchedSongInfo = music8.getMatchedSongInfo()) != null) {
            id = matchedSongInfo.getId();
        } else {
            id = null;
        }
        c633020OsG.LJJJZ(new ReportData(value, value2, str4, idStr, id, null, metaAlbumId));
    }
}
