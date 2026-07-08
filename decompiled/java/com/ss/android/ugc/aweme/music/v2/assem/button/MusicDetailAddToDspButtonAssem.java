package com.ss.android.ugc.aweme.music.v2.assem.button;

import X.C009B;
import X.C019F;
import X.C01GW;
import X.C0ANM;
import X.C0ANN;
import X.C0P0X;
import X.C0P2X;
import X.C0PEM;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C19244010Qk;
import X.C197039127h;
import X.C19719912Dl;
import X.C2140608a4;
import X.C2217381BqS;
import X.C23250099c;
import X.C2543309xv;
import X.C279550AxV;
import X.C297350Bl7;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C608360Nta;
import X.C629380OmO;
import X.C629600Omk;
import X.C629610Oml;
import X.C629620Omm;
import X.C633020OsG;
import X.C634020Ots;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C814420VxA;
import X.EnumC631120OpC;
import X.InterfaceC2217461Bqa;
import X.InterfaceC629580Omi;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.DspLinkState;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.DspSheetType;
import com.ss.android.ugc.aweme.music.model.LogData;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicETBusinessModule;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.model.TTToDspLogExtra;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDetailAddToDspButtonAssem extends DynamicAssem {
    public static final C629380OmO LLJLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1308));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1309));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1315));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1310));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1311));
    public final AssemVMLazy LLJJJ;
    public Music LLJJJIL;
    public String LLJJJJ;
    public C197039127h LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public C629620Omm LLJJLIIIJLLLLLLLZ;
    public InterfaceC629580Omi LLJL;
    public TT2DSPSongInfo LLJLIL;
    public DspPlatform LLJLILLLLZIIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0OmO] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicDetailAddToDspButtonAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLL = new Object() { // from class: X.0OmO
        };
    }

    public MusicDetailAddToDspButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1312), AFwS240S0000000_9.get$arr$(546), null, true);
        this.LLJLILLLLZIIL = DspPlatform.UNKNOWN;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dpo;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final LogData lp() {
        String string;
        Bundle arguments;
        LinkedHashMap linkedHashMap;
        Map<String, String> logExtraMap;
        TTToDspLogExtra tTToDspLogExtra = (TTToDspLogExtra) this.LLJJIJI.getValue();
        if (tTToDspLogExtra != null) {
            Music music = this.LLJJJIL;
            if (music == null || (logExtraMap = music.getLogExtraMap()) == null) {
                linkedHashMap = null;
            } else {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : logExtraMap.entrySet()) {
                    if (Intrinsics.LJFF(entry.getKey(), "meta_song_matched_type")) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            tTToDspLogExtra.append(linkedHashMap);
        }
        TTToDspLogExtra tTToDspLogExtra2 = (TTToDspLogExtra) this.LLJJIJI.getValue();
        if (tTToDspLogExtra2 != null) {
            tTToDspLogExtra2.append("has_tooltip", this.LLJJL ? "1" : CardStruct.IStatusCode.DEFAULT);
        }
        DspPlatform dspPlatformLJIILJJIL = C633020OsG.LIZIZ.LJIILJJIL(this.LLJJJIL);
        EnumC631120OpC enumC631120OpC = EnumC631120OpC.MUSIC_DETAIL;
        C0P0X c0p0x = C0P0X.UNKNOWN;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (arguments = fragmentLJI.getArguments()) == null || (string = arguments.getString("first_enter_from")) == null) {
            string = "";
        }
        MusicETBusinessModule musicETBusinessModule = MusicETBusinessModule.MDP;
        String eventName = this.LLJLILLLLZIIL.getEventName();
        Music music2 = this.LLJJJIL;
        String str = (String) this.LLJJI.getValue();
        String str2 = (String) this.LLJJIII.getValue();
        TTToDspLogExtra tTToDspLogExtra3 = (TTToDspLogExtra) this.LLJJIJI.getValue();
        String str3 = this.LLJJJJ;
        String str4 = (String) this.LLJJIJIIJIL.getValue();
        int iIntValue = ((Number) this.LLJJIJIL.getValue()).intValue();
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return new LogData(dspPlatformLJIILJJIL, enumC631120OpC, c0p0x, "single_song", string, musicETBusinessModule, null, music2, null, null, str, str2, CardStruct.IStatusCode.DEFAULT, null, null, tTToDspLogExtra3, str3, str4, eventName, false, iIntValue, ((MusicDetailViewModel) assemVMLazy.getValue()).LLJJJJ ? ((MusicDetailViewModel) this.LLJJJ.getValue()).LLJJJJLIIL : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.assem.button.MusicDetailAddToDspButtonAssem.up():void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        InterfaceC629580Omi interfaceC629580Omi = this.LLJL;
        if (interfaceC629580Omi != null) {
            interfaceC629580Omi.destroy();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        tp(true);
    }

    public final int mp(DspPlatform dspPlatform) {
        switch (C0P2X.LIZ[dspPlatform.ordinal()]) {
            case 1:
                return R.raw.icon_color_apple_music;
            case 2:
                return R.raw.icon_color_amazon_music;
            case 3:
                return R.raw.icon_color_spotify_icon;
            case 4:
                return R.raw.icon_color_melon;
            case 5:
                return R.raw.icon_color_deezer_icon;
            case 6:
                return R.raw.icon_color_soundcloud;
            case 7:
                return R.raw.icon_color_youtube_music_icon;
            case 8:
                return R.raw.icon_color_anghami;
            default:
                return R.raw.icon_list_add;
        }
    }

    @C14EU
    public final void onReceiveMusic2DspAuthEvent(C608360Nta c608360Nta) {
        up();
    }

    @C14EU
    public final void onReceiveMusic2DspLinkChangeEvent(C634020Ots c634020Ots) {
        up();
    }

    @C14EU
    public final void onReceiveShowAddSongGuideEvent(C629610Oml c629610Oml) {
        InterfaceC629580Omi interfaceC629580Omi;
        boolean z;
        InterfaceC629580Omi interfaceC629580Omi2;
        List<TT2DSPSongInfo> tT2DSPSongInfos;
        String str = c629610Oml.LIZ;
        Music music = this.LLJJJIL;
        String idStr = null;
        if (music != null) {
            idStr = music.getIdStr();
        }
        if (Intrinsics.LJFF(str, idStr) && getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) && c629610Oml.LIZIZ != DspPlatform.UNKNOWN && (interfaceC629580Omi = this.LLJL) != null) {
            DspLinkState dspLinkState = DspLinkState.UNLINKED;
            Music music2 = this.LLJJJIL;
            if (music2 != null && (tT2DSPSongInfos = music2.getTT2DSPSongInfos()) != null) {
                Iterator<TT2DSPSongInfo> it2 = tT2DSPSongInfos.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    TT2DSPSongInfo next = it2.next();
                    if (Intrinsics.LJFF(next.alwaysShowInFyp, Boolean.TRUE)) {
                        if (next != null) {
                            z = true;
                        }
                    }
                }
                z = false;
            } else {
                z = false;
            }
            if (interfaceC629580Omi.LIZIZ(dspLinkState, false, z) && (interfaceC629580Omi2 = this.LLJL) != null) {
                interfaceC629580Omi2.LIZLLL(C724240Sb0.LJI(this), c629610Oml.LIZIZ.getValue(), "single_song", c629610Oml.LIZJ);
            }
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        EventBus.LIZLLL().LJIJJ(this);
        C197039127h c197039127h = (C197039127h) view;
        this.LLJJJJJIL = c197039127h;
        if (c197039127h != null) {
            c197039127h.setTag(R.id.ih9, "font_sync");
        }
        C197039127h c197039127h2 = this.LLJJJJJIL;
        if (c197039127h2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
            c197039127h2.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
        }
        if (C297350Bl7.LIZ()) {
            C197039127h c197039127h3 = this.LLJJJJJIL;
            if (c197039127h3 != null) {
                c197039127h3.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            }
            C197039127h c197039127h4 = this.LLJJJJJIL;
            if (c197039127h4 != null) {
                c197039127h4.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Omj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, null, null, new AwS588S0100000_9(this, 323), 14, null);
        if (C2543309xv.LIZ() || ((Number) C0ANM.LIZ.getValue()).intValue() == 0) {
            this.LLJL = C633020OsG.LIZIZ.LJIIZILJ(C0ANN.LIZ());
        }
        if (((Number) C279550AxV.LIZ.getValue()).intValue() != 0) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C2140608a4(null), 2);
        }
    }

    public final void sp(C629600Omk c629600Omk) {
        C009B c009b;
        Integer num;
        TTToDspLogExtra tTToDspLogExtra;
        LogData logDataLp = lp();
        if (c629600Omk != null) {
            c009b = c629600Omk.LIZ;
        } else {
            c009b = null;
        }
        if (c009b == C009B.CAMPAIGN && (num = c629600Omk.LIZLLL) != null && (tTToDspLogExtra = logDataLp.ttToDspLogExtra) != null) {
            tTToDspLogExtra.append("specific_dsp", DspPlatform.Companion.from(num).getEventName());
        }
        C633020OsG.LIZIZ.LJJLIIIJJIZ(logDataLp);
    }

    public final void tp(boolean z) {
        String string;
        EnumC631120OpC enumC631120OpC;
        Bundle arguments;
        if (this.LLJJLIIIJLLLLLLLZ != null && z) {
            C629620Omm c629620Omm = this.LLJJLIIIJLLLLLLLZ;
            if (c629620Omm != null) {
                c629620Omm.q0(new AwS410S0200000_9(this, c629620Omm, 53));
            }
            this.LLJJLIIIJLLLLLLLZ = null;
            return;
        }
        if (this.LLJJJJLIIL) {
            return;
        }
        this.LLJJJJLIIL = true;
        C197039127h c197039127h = this.LLJJJJJIL;
        if (c197039127h != null) {
            C19244010Qk c19244010Qk = new C19244010Qk(new WeakReference(c197039127h));
            WeakReference weakReference = new WeakReference(c197039127h.getContext());
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (arguments = fragmentLJI.getArguments()) != null) {
                string = arguments.getString("extra_music_from");
            } else {
                string = null;
            }
            if (Intrinsics.LJFF(string, "homepage_hot")) {
                enumC631120OpC = EnumC631120OpC.FEED_FYP;
            } else {
                enumC631120OpC = EnumC631120OpC.OTHER;
            }
            C629620Omm c629620Omm2 = new C629620Omm(c19244010Qk, weakReference, enumC631120OpC, this.LLJJJIL, new AwS553S0100000_9(this, 1313), new AwS553S0100000_9(this, 1314));
            if (c629620Omm2.shouldShow()) {
                if (z) {
                    c629620Omm2.q0(new AwS410S0200000_9(this, c629620Omm2, 54));
                } else {
                    this.LLJJLIIIJLLLLLLLZ = c629620Omm2;
                }
                this.LLJJL = true;
                return;
            }
            this.LLJJLIIIJLLLLLLLZ = null;
            this.LLJJL = false;
        }
    }

    public final void op(AddSongContextData addSongContextData, List<TT2DSPSongInfo> list) {
        C633020OsG.LIZIZ.LJJZ(C724240Sb0.LJI(this), addSongContextData, DspSheetType.SELECT_DSP, list, null, null);
    }
}
