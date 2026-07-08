package com.ss.android.ugc.aweme.feed.assem.desc;

import X.C01GW;
import X.C0S5R;
import X.C0S64;
import X.C0S76;
import X.C0SKF;
import X.C123100dR;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2795016j;
import X.C715860S6e;
import X.C715990S6r;
import X.C716020S6u;
import X.C718770SHj;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC0241006d;
import X.InterfaceC1282004zy;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoDescEventTrackAssem extends ReusedAssem<VideoDescEventTrackAssem> implements InterfaceC712990Rxx<VideoItemParams> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C715860S6e LLJJ = new C715860S6e(this);
    public final C01GW LLJJI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C716020S6u());
    public final VideoDescEventTrackAssem$titleParamsProvider$1 LLJJIII = new ETParamsProvider<C2795016j>() { // from class: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescEventTrackAssem$titleParamsProvider$1
        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
        public final C2795016j Mb0() {
            int i;
            Aweme aweme;
            String desc;
            C0S64 c0s64;
            C0S5R c0s5r;
            Aweme aweme2;
            Aweme aweme3;
            Aweme aweme4;
            String desc2;
            VideoDescEventTrackAssem videoDescEventTrackAssem = this.LL;
            VideoDescVM videoDescVM = (VideoDescVM) videoDescEventTrackAssem.LLJJ.getValue(videoDescEventTrackAssem, VideoDescEventTrackAssem.LLJJIJIIJIL[0]);
            VideoItemParams item = videoDescVM.getItem();
            int length = (item == null || (aweme4 = item.getAweme()) == null || (desc2 = aweme4.getDesc()) == null) ? 0 : desc2.length();
            int length2 = videoDescVM.LLJILLL.length();
            C718770SHj c718770SHj = videoDescVM.LLJJLIIIJLLLLLLLZ;
            C0S76 c0s76 = c718770SHj != null ? c718770SHj.LLLF.LJIIIIZZ : null;
            VideoItemParams item2 = videoDescVM.getItem();
            boolean zLIZ = C0SKF.LIZ(item2 != null ? item2.getAweme() : null);
            if (c0s76 == null || (c0s64 = videoDescVM.LLJJL) == null || (c0s5r = c0s64.LIZ) == null || !c0s5r.LIZJ) {
                i = 0;
            } else {
                i = 1;
                String str = c0s76.LIZ;
                String string = "";
                if (str == null) {
                    str = "";
                }
                if (videoDescVM.LLJJ.length() == 0) {
                    VideoItemParams item3 = videoDescVM.getItem();
                    String desc3 = (item3 == null || (aweme3 = item3.getAweme()) == null) ? null : aweme3.getDesc();
                    VideoItemParams item4 = videoDescVM.getItem();
                    List<TextExtraStruct> textExtra = (item4 == null || (aweme2 = item4.getAweme()) == null) ? null : aweme2.getTextExtra();
                    if (desc3 != null && desc3.length() != 0 && textExtra != null && !textExtra.isEmpty()) {
                        boolean[] zArr = new boolean[desc3.length()];
                        for (TextExtraStruct textExtraStruct : textExtra) {
                            if (textExtraStruct != null && textExtraStruct.getType() != 1) {
                                int start = textExtraStruct.getStart();
                                if (start < 0) {
                                    start = 0;
                                }
                                int end = textExtraStruct.getEnd();
                                int length3 = desc3.length();
                                if (end > length3) {
                                    end = length3;
                                }
                                if (textExtraStruct.getStart() > textExtraStruct.getEnd()) {
                                    start = textExtraStruct.getEnd();
                                    if (start < 0) {
                                        start = 0;
                                    }
                                    end = textExtraStruct.getStart();
                                    int length4 = desc3.length();
                                    if (end > length4) {
                                        end = length4;
                                    }
                                }
                                while (start < end) {
                                    zArr[start] = true;
                                    start++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        int length5 = desc3.length();
                        for (int i2 = 0; i2 < length5; i2++) {
                            if (zArr[i2]) {
                                sb.append(desc3.charAt(i2));
                            }
                        }
                        String string2 = sb.toString();
                        int length6 = string2.length() - 1;
                        int i3 = 0;
                        boolean z = false;
                        while (i3 <= length6) {
                            boolean z2 = Intrinsics.LJI(string2.charAt(!z ? i3 : length6), 32) <= 0;
                            if (z) {
                                if (!z2) {
                                    break;
                                }
                                length6--;
                            } else if (z2) {
                                i3++;
                            } else {
                                z = true;
                            }
                        }
                        string = string2.subSequence(i3, length6 + 1).toString();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(string);
                    videoDescVM.LLJJ = C2188811AlT.LIZIZ(sbLIZ);
                }
                CharSequence charSequence = c0s76.LIZJ;
                length = charSequence != null ? charSequence.length() : 0;
                length2 = videoDescVM.LLJJ.length();
            }
            VideoItemParams item5 = videoDescVM.getItem();
            int i4 = (item5 == null || (aweme = item5.getAweme()) == null || (desc = aweme.getDesc()) == null || !C123100dR.LIZ(desc)) ? 0 : 1;
            Integer numValueOf = Integer.valueOf(zLIZ ? 1 : 0);
            Integer numValueOf2 = Integer.valueOf(i);
            VideoItemParams item6 = videoDescVM.getItem();
            return new C2795016j(i4, length, length2, numValueOf, numValueOf2, C0SKF.LIZJ(item6 != null ? item6.getAweme() : null), 960);
        }

        @Override // com.ss.android.tracker.event.EventParamsProtocol
        public final InterfaceC1282004zy getParam() {
            if (lt2(C2795016j.class)) {
                return Mb0();
            }
            return null;
        }

        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        public final boolean lt2(Class<? extends InterfaceC0241006d> cls) {
            if (!Intrinsics.LJFF(cls, C2795016j.class)) {
                return false;
            }
            return true;
        }
    };
    public final VideoDescEventTrackAssem$descExpandModeProtocol$1 LLJJIJI = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescEventTrackAssem$descExpandModeProtocol$1
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoDescEventTrackAssem.class, "videoDescVM", "getVideoDescVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/VideoDescVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0S6s
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZLL;
            }
        }, C736820SvI.LJ(), new C715990S6r(), 4);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ETParamsProvider.class, C1697810uHb.LJIILJJIL(this.LLJJIII));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), DescExpandModeProtocol.class, C1697810uHb.LJIILJJIL(this.LLJJIJI));
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
