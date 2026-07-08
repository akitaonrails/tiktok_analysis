package com.ss.android.ugc.aweme.music.assem.list.cell.compose;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C1576570r83;
import X.C1669670tYD;
import X.C19719212De;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C452080Ho6;
import X.C452501pT;
import X.C631160OpG;
import X.C631640Oq2;
import X.C632090Oql;
import X.C633020OsG;
import X.C639100P4y;
import X.C737910Sx3;
import X.EnumC1427810nG7;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.DspSheetType;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.vm.MusicHighlightBackgroundViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS445S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellCompose extends PowerCell<C632090Oql> {
    public static final C631160OpG LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public final AssemVMLazy LLILZIL;
    public final AssemVMLazy LLILZLL;
    public ComposeView LLIZ;
    public final C19719212De LLIZLLLIL;
    public C632090Oql LLJ;
    public C631640Oq2 LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCellCompose.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(MusicCellCompose.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0), new C2217381BqS(MusicCellCompose.class, "highlightBackgroundViewModel", "getHighlightBackgroundViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicHighlightBackgroundViewModel;", 0), new C2217381BqS(MusicCellCompose.class, "featuredVideosIconViewModel", "getFeaturedVideosIconViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/cell/compose/MusicCellFeaturedVideosIconViewModelCompose;", 0), new C2217381BqS(MusicCellCompose.class, "collectIconViewModel", "getCollectIconViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/cell/compose/MusicCellCollectIconViewModelCompose;", 0), new C2217381BqS(MusicCellCompose.class, "musicCellAdd2DspViewModelCompose", "getMusicCellAdd2DspViewModelCompose()Lcom/ss/android/ugc/aweme/music/assem/list/cell/compose/MusicCellAdd2DspViewModelCompose;", 0)};
        LLJIJIL = new C631160OpG();
    }

    public MusicCellCompose() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        AssemVMLazy assemVMLazy3;
        AssemVMLazy assemVMLazy4;
        AssemVMLazy assemVMLazy5;
        AssemVMLazy assemVMLazy6;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 1080);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(439);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 1057), awS553S0100000_9, AFwS195S0000000_9.get$arr$(219), new AwS553S0100000_9((C03K6) this, 1034), new AwS553S0100000_9((C03K6) this, 1099), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1012), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 1076), null, new AwS553S0100000_9((C03K6) this, 989));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((C03K6) this, 1029);
            AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1096);
            AwS553S0100000_9 awS553S0100000_94 = new AwS553S0100000_9(c19719912DlLIZ, 1001);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_92, 46));
            AwS553S0100000_9 awS553S0100000_95 = new AwS553S0100000_9(c01gwLIZIZ, 978);
            AwS553S0100000_9 awS553S0100000_96 = new AwS553S0100000_9(c01gwLIZIZ, 1043);
            AwS553S0100000_9 awS553S0100000_97 = new AwS553S0100000_9(c01gwLIZIZ, 954);
            AwS553S0100000_9 awS553S0100000_98 = new AwS553S0100000_9(c01gwLIZIZ, 1022);
            AwS553S0100000_9 awS553S0100000_99 = new AwS553S0100000_9(c01gwLIZIZ, 1068);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS553S0100000_94, awS553S0100000_9, new C452080Ho6(), awS553S0100000_95, awS553S0100000_96, awS553S0100000_93, aFwS240S0000000_9, awS553S0100000_97, awS553S0100000_98, awS553S0100000_99);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 1074), awS553S0100000_9, AFwS195S0000000_9.get$arr$(234), new AwS553S0100000_9((C03K6) this, 1092), new AwS553S0100000_9((C03K6) this, 1097), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 948), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 955), null, new AwS553S0100000_9((C03K6) this, 961));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 968), awS553S0100000_9, AFwS195S0000000_9.get$arr$(221), new AwS553S0100000_9((C03K6) this, 980), new AwS553S0100000_9((C03K6) this, 986), new AwS553S0100000_9((C03K6) this, 997), aFwS240S0000000_9, null, null, new AwS553S0100000_9((C03K6) this, 1004));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicPlayViewModel.class);
        AwS553S0100000_9 awS553S0100000_910 = new AwS553S0100000_9(c19719912DlLIZ2, 1010);
        AFwS240S0000000_9 aFwS240S0000000_92 = AFwS240S0000000_9.get$arr$(440);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ2, 1023), awS553S0100000_910, AFwS195S0000000_9.get$arr$(227), new AwS553S0100000_9((C03K6) this, 1033), new AwS553S0100000_9((C03K6) this, 1038), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1045), aFwS240S0000000_92, new AwS553S0100000_9((C03K6) this, 1051), null, new AwS553S0100000_9((C03K6) this, 1064));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_911 = new AwS553S0100000_9((C03K6) this, 1069);
            AwS553S0100000_9 awS553S0100000_912 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1075);
            AwS553S0100000_9 awS553S0100000_913 = new AwS553S0100000_9(c19719912DlLIZ2, 1081);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_911, 47));
            AwS553S0100000_9 awS553S0100000_914 = new AwS553S0100000_9(c01gwLIZIZ2, 1093);
            AwS553S0100000_9 awS553S0100000_915 = new AwS553S0100000_9(c01gwLIZIZ2, 1098);
            AwS553S0100000_9 awS553S0100000_916 = new AwS553S0100000_9(c01gwLIZIZ2, 949);
            AwS553S0100000_9 awS553S0100000_917 = new AwS553S0100000_9(c01gwLIZIZ2, 956);
            AwS553S0100000_9 awS553S0100000_918 = new AwS553S0100000_9(c01gwLIZIZ2, 962);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS553S0100000_913, awS553S0100000_910, new C452080Ho6(), awS553S0100000_914, awS553S0100000_915, awS553S0100000_912, aFwS240S0000000_92, awS553S0100000_916, awS553S0100000_917, awS553S0100000_918);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ2, 974), awS553S0100000_910, AFwS195S0000000_9.get$arr$(222), new AwS553S0100000_9((C03K6) this, 987), new AwS553S0100000_9((C03K6) this, 991), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 998), aFwS240S0000000_92, new AwS553S0100000_9((C03K6) this, 1005), null, new AwS553S0100000_9((C03K6) this, 1011));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ2, 1017), awS553S0100000_910, AFwS195S0000000_9.get$arr$(226), new AwS553S0100000_9((C03K6) this, 1028), new AwS553S0100000_9((C03K6) this, 1039), new AwS553S0100000_9((C03K6) this, 1046), aFwS240S0000000_92, null, null, new AwS553S0100000_9((C03K6) this, 1052));
        }
        this.LLILLJJLI = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MusicHighlightBackgroundViewModel.class);
        AwS553S0100000_9 awS553S0100000_919 = new AwS553S0100000_9(c19719912DlLIZ3, 1058);
        AFwS240S0000000_9 aFwS240S0000000_93 = AFwS240S0000000_9.get$arr$(442);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy3 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ3, 1070), awS553S0100000_919, AFwS195S0000000_9.get$arr$(233), new AwS553S0100000_9((C03K6) this, 1082), new AwS553S0100000_9((C03K6) this, 1087), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1094), aFwS240S0000000_93, new AwS553S0100000_9((C03K6) this, 950), null, new AwS553S0100000_9((C03K6) this, 957));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_920 = new AwS553S0100000_9((C03K6) this, 963);
            AwS553S0100000_9 awS553S0100000_921 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 969);
            AwS553S0100000_9 awS553S0100000_922 = new AwS553S0100000_9(c19719912DlLIZ3, 975);
            C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_920, 43));
            AwS553S0100000_9 awS553S0100000_923 = new AwS553S0100000_9(c01gwLIZIZ3, 988);
            AwS553S0100000_9 awS553S0100000_924 = new AwS553S0100000_9(c01gwLIZIZ3, 992);
            AwS553S0100000_9 awS553S0100000_925 = new AwS553S0100000_9(c01gwLIZIZ3, 999);
            AwS553S0100000_9 awS553S0100000_926 = new AwS553S0100000_9(c01gwLIZIZ3, 1006);
            AwS553S0100000_9 awS553S0100000_927 = new AwS553S0100000_9(c01gwLIZIZ3, 1018);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = C737910Sx3.LIZ;
            assemVMLazy3 = new AssemVMLazy(awS553S0100000_922, awS553S0100000_919, new C452080Ho6(), awS553S0100000_923, awS553S0100000_924, awS553S0100000_921, aFwS240S0000000_93, awS553S0100000_925, awS553S0100000_926, awS553S0100000_927);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy3 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ3, 1024), awS553S0100000_919, AFwS195S0000000_9.get$arr$(228), new AwS553S0100000_9((C03K6) this, 1035), new AwS553S0100000_9((C03K6) this, 1040), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1047), aFwS240S0000000_93, new AwS553S0100000_9((C03K6) this, 1053), null, new AwS553S0100000_9((C03K6) this, 1059));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Don't support this VMScope: ");
                sbLIZ3.append(obj);
                sbLIZ3.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            assemVMLazy3 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ3, 1065), awS553S0100000_919, AFwS195S0000000_9.get$arr$(232), new AwS553S0100000_9((C03K6) this, 1083), new AwS553S0100000_9((C03K6) this, 1088), new AwS553S0100000_9((C03K6) this, 1095), aFwS240S0000000_93, null, null, new AwS553S0100000_9((C03K6) this, 1100));
        }
        this.LLILLL = assemVMLazy3;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(MusicCellFeaturedVideosIconViewModelCompose.class);
        AwS553S0100000_9 awS553S0100000_928 = new AwS553S0100000_9(c19719912DlLIZ4, 951);
        AFwS240S0000000_9 aFwS240S0000000_94 = AFwS240S0000000_9.get$arr$(437);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy4 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ4, 964), awS553S0100000_928, AFwS195S0000000_9.get$arr$(220), new AwS553S0100000_9((C03K6) this, 976), new AwS553S0100000_9((C03K6) this, 981), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 970), aFwS240S0000000_94, new AwS553S0100000_9((C03K6) this, 977), null, new AwS553S0100000_9((C03K6) this, 982));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_929 = new AwS553S0100000_9((C03K6) this, 990);
            AwS553S0100000_9 awS553S0100000_930 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 993);
            AwS553S0100000_9 awS553S0100000_931 = new AwS553S0100000_9(c19719912DlLIZ4, LSPassThroughRecordSizeConfig.DEFAULT);
            C01GW c01gwLIZIZ4 = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_929, 44));
            AwS553S0100000_9 awS553S0100000_932 = new AwS553S0100000_9(c01gwLIZIZ4, 1013);
            AwS553S0100000_9 awS553S0100000_933 = new AwS553S0100000_9(c01gwLIZIZ4, 1019);
            AwS553S0100000_9 awS553S0100000_934 = new AwS553S0100000_9(c01gwLIZIZ4, 1025);
            AwS553S0100000_9 awS553S0100000_935 = new AwS553S0100000_9(c01gwLIZIZ4, 1036);
            AwS553S0100000_9 awS553S0100000_936 = new AwS553S0100000_9(c01gwLIZIZ4, 1041);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr4 = C737910Sx3.LIZ;
            assemVMLazy4 = new AssemVMLazy(awS553S0100000_931, awS553S0100000_928, new C452080Ho6(), awS553S0100000_932, awS553S0100000_933, awS553S0100000_930, aFwS240S0000000_94, awS553S0100000_934, awS553S0100000_935, awS553S0100000_936);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy4 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ4, 1048), awS553S0100000_928, AFwS195S0000000_9.get$arr$(231), new AwS553S0100000_9((C03K6) this, 1060), new AwS553S0100000_9((C03K6) this, 1066), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1071), aFwS240S0000000_94, new AwS553S0100000_9((C03K6) this, 1077), null, new AwS553S0100000_9((C03K6) this, 1084));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Don't support this VMScope: ");
                sbLIZ4.append(obj);
                sbLIZ4.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
            }
            assemVMLazy4 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ4, 1089), awS553S0100000_928, AFwS195S0000000_9.get$arr$(236), new AwS553S0100000_9((C03K6) this, 945), new AwS553S0100000_9((C03K6) this, 952), new AwS553S0100000_9((C03K6) this, 958), aFwS240S0000000_94, null, null, new AwS553S0100000_9((C03K6) this, 965));
        }
        this.LLILZ = assemVMLazy4;
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(MusicCellCollectIconViewModelCompose.class);
        AwS553S0100000_9 awS553S0100000_937 = new AwS553S0100000_9(c19719912DlLIZ5, 971);
        AFwS240S0000000_9 aFwS240S0000000_95 = AFwS240S0000000_9.get$arr$(438);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy5 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ5, 983), awS553S0100000_937, AFwS195S0000000_9.get$arr$(223), new AwS553S0100000_9((C03K6) this, 994), new AwS553S0100000_9((C03K6) this, 1007), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1014), aFwS240S0000000_95, new AwS553S0100000_9((C03K6) this, 1020), null, new AwS553S0100000_9((C03K6) this, 1026));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_938 = new AwS553S0100000_9((C03K6) this, 1030);
            AwS553S0100000_9 awS553S0100000_939 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1037);
            AwS553S0100000_9 awS553S0100000_940 = new AwS553S0100000_9(c19719912DlLIZ5, 1042);
            C01GW c01gwLIZIZ5 = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_938, 45));
            AwS553S0100000_9 awS553S0100000_941 = new AwS553S0100000_9(c01gwLIZIZ5, 1054);
            AwS553S0100000_9 awS553S0100000_942 = new AwS553S0100000_9(c01gwLIZIZ5, 1061);
            AwS553S0100000_9 awS553S0100000_943 = new AwS553S0100000_9(c01gwLIZIZ5, 1072);
            AwS553S0100000_9 awS553S0100000_944 = new AwS553S0100000_9(c01gwLIZIZ5, 1078);
            AwS553S0100000_9 awS553S0100000_945 = new AwS553S0100000_9(c01gwLIZIZ5, 1085);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr5 = C737910Sx3.LIZ;
            assemVMLazy5 = new AssemVMLazy(awS553S0100000_940, awS553S0100000_937, new C452080Ho6(), awS553S0100000_941, awS553S0100000_942, awS553S0100000_939, aFwS240S0000000_95, awS553S0100000_943, awS553S0100000_944, awS553S0100000_945);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy5 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ5, 1090), awS553S0100000_937, AFwS195S0000000_9.get$arr$(235), new AwS553S0100000_9((C03K6) this, 946), new AwS553S0100000_9((C03K6) this, 953), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 959), aFwS240S0000000_95, new AwS553S0100000_9((C03K6) this, 966), null, new AwS553S0100000_9((C03K6) this, 972));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Don't support this VMScope: ");
                sbLIZ5.append(obj);
                sbLIZ5.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ5));
            }
            assemVMLazy5 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ5, 984), awS553S0100000_937, AFwS195S0000000_9.get$arr$(224), new AwS553S0100000_9((C03K6) this, 995), new AwS553S0100000_9((C03K6) this, 1002), new AwS553S0100000_9((C03K6) this, 1008), aFwS240S0000000_95, null, null, new AwS553S0100000_9((C03K6) this, 1015));
        }
        this.LLILZIL = assemVMLazy5;
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(MusicCellAdd2DspViewModelCompose.class);
        AwS553S0100000_9 awS553S0100000_946 = new AwS553S0100000_9(c19719912DlLIZ6, 1021);
        AFwS240S0000000_9 aFwS240S0000000_96 = AFwS240S0000000_9.get$arr$(441);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy6 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ6, 1031), awS553S0100000_946, AFwS195S0000000_9.get$arr$(229), new AwS553S0100000_9((C03K6) this, 1049), new AwS553S0100000_9((C03K6) this, 1055), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1062), aFwS240S0000000_96, new AwS553S0100000_9((C03K6) this, 1067), null, new AwS553S0100000_9((C03K6) this, 1073));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_947 = new AwS553S0100000_9((C03K6) this, 1079);
            AwS553S0100000_9 awS553S0100000_948 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1086);
            AwS553S0100000_9 awS553S0100000_949 = new AwS553S0100000_9(c19719912DlLIZ6, 1091);
            C01GW c01gwLIZIZ6 = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_947, 48));
            AwS553S0100000_9 awS553S0100000_950 = new AwS553S0100000_9(c01gwLIZIZ6, 947);
            AwS553S0100000_9 awS553S0100000_951 = new AwS553S0100000_9(c01gwLIZIZ6, 960);
            AwS553S0100000_9 awS553S0100000_952 = new AwS553S0100000_9(c01gwLIZIZ6, 967);
            AwS553S0100000_9 awS553S0100000_953 = new AwS553S0100000_9(c01gwLIZIZ6, 973);
            AwS553S0100000_9 awS553S0100000_954 = new AwS553S0100000_9(c01gwLIZIZ6, 979);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr6 = C737910Sx3.LIZ;
            assemVMLazy6 = new AssemVMLazy(awS553S0100000_949, awS553S0100000_946, new C452080Ho6(), awS553S0100000_950, awS553S0100000_951, awS553S0100000_948, aFwS240S0000000_96, awS553S0100000_952, awS553S0100000_953, awS553S0100000_954);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy6 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ6, 985), awS553S0100000_946, AFwS195S0000000_9.get$arr$(225), new AwS553S0100000_9((C03K6) this, 996), new AwS553S0100000_9((C03K6) this, 1003), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1009), aFwS240S0000000_96, new AwS553S0100000_9((C03K6) this, 1016), null, new AwS553S0100000_9((C03K6) this, 1027));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("Don't support this VMScope: ");
                sbLIZ6.append(obj);
                sbLIZ6.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ6));
            }
            assemVMLazy6 = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ6, 1032), awS553S0100000_946, AFwS195S0000000_9.get$arr$(230), new AwS553S0100000_9((C03K6) this, 1044), new AwS553S0100000_9((C03K6) this, 1050), new AwS553S0100000_9((C03K6) this, 1056), aFwS240S0000000_96, null, null, new AwS553S0100000_9((C03K6) this, 1063));
        }
        this.LLILZLL = assemVMLazy6;
        this.LLIZLLLIL = new C19719212De(-415644380, new C639100P4y(this, 1), true);
    }

    public final OriginMusicListViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (OriginMusicListViewModel) assemVMLazy.getValue();
    }

    public final MusicPlayViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (MusicPlayViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        C632090Oql c632090Oql = (C632090Oql) interfaceC1891350zJl;
        C631640Oq2 c631640Oq2 = I5().LLILLJJLI;
        if (c631640Oq2 == null) {
            c631640Oq2 = new C631640Oq2(null, null, false, null, null, false, null, null, null, 4095);
        }
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        ((MusicCellFeaturedVideosIconViewModelCompose) assemVMLazy.getValue()).LL.put(c632090Oql.getMusicModel().getMusicId(), C1576570r83.LIZ(c632090Oql.getMusicModel().getPinnedVideoStatus()));
        MusicCellCollectIconViewModelCompose musicCellCollectIconViewModelCompose = (MusicCellCollectIconViewModelCompose) this.LLILZIL.getValue();
        HashMap<String, Boolean> map = musicCellCollectIconViewModelCompose.LL;
        String musicId = c632090Oql.getMusicModel().getMusicId();
        if (c632090Oql.getMusicModel().getCollectionType() == MusicModel.CollectionType.COLLECTED) {
            z = true;
        } else {
            z = false;
        }
        map.put(musicId, Boolean.valueOf(z));
        musicCellCollectIconViewModelCompose.LLILLJJLI = c631640Oq2;
        ComposeView composeView = this.LLIZ;
        if (composeView != null) {
            C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(16886810, new AwS445S0200000_9(this, c632090Oql, 31), true));
        }
        super.onBindItemView(c632090Oql);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (context == null) {
            return super.onCreateItemView(viewGroup);
        }
        ComposeView composeView = new ComposeView(context, null, 6);
        this.LLIZ = composeView;
        return composeView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C632090Oql c632090Oql = (C632090Oql) interfaceC1891350zJl;
        ComposeView composeView = this.LLIZ;
        if (composeView != null) {
            C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-1597053824, new AwS445S0200000_9(this, c632090Oql, 30), true));
        }
    }

    public static void P5(C631640Oq2 c631640Oq2, C632090Oql c632090Oql, String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (c631640Oq2.LIZJ) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("button_name", str);
        String str3 = c631640Oq2.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        c2344009Gk.LJIIIIZZ("to_user_id", str3);
        c2344009Gk.LIZJ(c632090Oql.getMusicItemModel().isHighlighted() ? 1 : 0, "highlight");
        C20684815ws.LJIILLIIL("new_song_click", c2344009Gk.LIZ);
    }

    public final void N5(Fragment fragment, AddSongContextData addSongContextData, List<TT2DSPSongInfo> list) {
        C633020OsG.LIZIZ.LJJZ(fragment, addSongContextData, DspSheetType.SELECT_DSP, list, null, null);
    }
}
