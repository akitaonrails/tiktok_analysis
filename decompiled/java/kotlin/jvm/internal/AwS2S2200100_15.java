package kotlin.jvm.internal;

import X.AbstractC19484711Kz;
import X.C09AY;
import X.C11HU;
import X.C11QI;
import X.C1701940uOG;
import X.C191300oR;
import X.C19482011Jy;
import X.C20441214yg;
import X.C2188811AlT;
import X.C916750Zxp;
import X.C953100auS;
import X.C953130auV;
import X.C953230auf;
import X.C953610avH;
import X.C953770avX;
import X.C969920bLa;
import X.C969930bLb;
import X.EnumC952890au7;
import X.InterfaceC1487280oo2;
import X.InterfaceC915550Zvt;
import X.InterfaceC970140bLw;
import Y.AfS3S0000100_15;
import Y.AkS3S2100100_15;
import Y.AkS42S1000000_15;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.HideNoticeBoardWhenUseTemplate;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.TemplateFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo;

/* JADX INFO: loaded from: classes16.dex */
public class AwS2S2200100_15 extends C09AY implements Function0 {
    public final int $t;
    public long j4;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S2200100_15 awS2S2200100_15) {
        C969930bLb c969930bLb = (C969930bLb) awS2S2200100_15.l2;
        Context context = c969930bLb.LLILZIL;
        DataChannel dataChannel = c969930bLb.LLILZLL;
        EnumC952890au7 enumC952890au7 = c969930bLb.LLIZ;
        C953610avH.LJJI.getClass();
        String str = C953610avH.LJJII;
        if (str == null) {
            str = "";
        }
        C953100auS c953100auS = new C953100auS(context, dataChannel, enumC952890au7, new C916750Zxp(2, 0L, str), AFwS250S0000000_15.get$arr$(16), new C953130auV(), AFwS250S0000000_15.get$arr$(17), AFwS203S0000000_15.get$arr$(19), null, 768);
        C953230auf c953230auf = C953230auf.LIZ;
        long j = awS2S2200100_15.j4;
        String str2 = awS2S2200100_15.s0;
        String str3 = awS2S2200100_15.s1;
        ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo = (ConvertNoticeboardMaterialInfo) awS2S2200100_15.l3;
        c953230auf.getClass();
        C953230auf.LJIL(j, str2, str3, convertNoticeboardMaterialInfo, c953100auS);
        DataChannel dataChannel2 = ((C969930bLb) awS2S2200100_15.l2).LLILZLL;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(HideNoticeBoardWhenUseTemplate.class);
        }
        ((C969930bLb) awS2S2200100_15.l2).LLIZLLLIL.invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S2200100_15 awS2S2200100_15) {
        TemplateFragment templateFragment = (TemplateFragment) awS2S2200100_15.l2;
        C969920bLa c969920bLa = templateFragment.LL;
        if (c969920bLa != null) {
            long j = awS2S2200100_15.j4;
            String str = awS2S2200100_15.s0;
            String str2 = awS2S2200100_15.s1;
            ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo = (ConvertNoticeboardMaterialInfo) awS2S2200100_15.l3;
            InterfaceC970140bLw interfaceC970140bLw = c969920bLa.LIZIZ;
            if (interfaceC970140bLw != null) {
                interfaceC970140bLw.LIZIZ();
            }
            C953230auf c953230auf = C953230auf.LIZ;
            C953100auS c953100auS = c969920bLa.LIZLLL;
            c953230auf.getClass();
            C953230auf.LJIL(j, str, str2, convertNoticeboardMaterialInfo, c953100auS);
            DataChannel dataChannel = c969920bLa.LIZJ;
            if (dataChannel != null) {
                dataChannel.FQ2(HideNoticeBoardWhenUseTemplate.class);
            }
            Function0<Unit> function0 = templateFragment.LLJILJIL;
            if (function0 != null) {
                function0.invoke();
                return Unit.LIZ;
            }
            return null;
        }
        return null;
    }

    public static final Object invoke$2(AwS2S2200100_15 awS2S2200100_15) {
        ConcurrentHashMap<Long, C953770avX> concurrentHashMap = CloudDraftItemManager.LJFF;
        if (concurrentHashMap.get(Long.valueOf(awS2S2200100_15.j4)) != null) {
            C953770avX c953770avX = concurrentHashMap.get(Long.valueOf(awS2S2200100_15.j4));
            if (c953770avX != null) {
                ((InterfaceC915550Zvt) awS2S2200100_15.l2).LIZIZ(c953770avX);
            }
        } else {
            ConcurrentHashMap<Long, List<InterfaceC915550Zvt>> concurrentHashMap2 = CloudDraftItemManager.LJ;
            if (concurrentHashMap2.get(Long.valueOf(awS2S2200100_15.j4)) == null) {
                concurrentHashMap2.put(Long.valueOf(awS2S2200100_15.j4), new ArrayList());
                List<InterfaceC915550Zvt> list = concurrentHashMap2.get(Long.valueOf(awS2S2200100_15.j4));
                if (list != null) {
                    list.add((InterfaceC915550Zvt) awS2S2200100_15.l2);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("add templateCallback, callback: ");
                sbLIZ.append((InterfaceC915550Zvt) awS2S2200100_15.l2);
                C20441214yg.LIZIZ("CloudDraftItemManager_Noticeboard", C2188811AlT.LIZIZ(sbLIZ));
                C11HU c11huLJJ = AbstractC19484711Kz.LJIJJLI(0).LJJ(C1701940uOG.LIZ(CloudDraftItemManager.LIZ.getLooper()));
                final long j = awS2S2200100_15.j4;
                final ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo = (ConvertNoticeboardMaterialInfo) awS2S2200100_15.l3;
                final String str = awS2S2200100_15.s0;
                C19482011Jy c19482011JyLJIL = c11huLJJ.LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.0auD
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
                        return AbstractC19484711Kz.LJJIZ(CloudDraftItemManager.LIZIZ(String.valueOf(j), convertNoticeboardMaterialInfo.backgroundImageUrl, "background", "Template"), CloudDraftItemManager.LIZIZ(String.valueOf(j), convertNoticeboardMaterialInfo.coverImageUrl, "cover", "Template"), CloudDraftItemManager.LIZIZ(String.valueOf(j), convertNoticeboardMaterialInfo.configJsonUrl, "config", "Template").LJIIZILJ(new AkS42S1000000_15(str, 2)), C952990auH.LIZ);
                    }
                }).LJIL(new InterfaceC1487280oo2() { // from class: X.0ZzY
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        C443120HZe c443120HZe = (C443120HZe) obj;
                        String str2 = (String) c443120HZe.getFirst();
                        String str3 = (String) c443120HZe.getSecond();
                        String str4 = (String) ((C443120HZe) c443120HZe.getThird()).getFirst();
                        CloudDraftItemManager.CloudDraftConfig cloudDraftConfig = (CloudDraftItemManager.CloudDraftConfig) ((C443120HZe) c443120HZe.getThird()).getSecond();
                        BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
                        return new C917840Zza(str2, str3, str4, cloudDraftConfig, CloudDraftItemManager.LIZLLL((String) c443120HZe.getSecond()), (String) ((C443120HZe) c443120HZe.getThird()).getThird());
                    }
                });
                String str2 = awS2S2200100_15.s0;
                new C11QI(C191300oR.LIZIZ(c19482011JyLJIL.LJIIZILJ(new AkS3S2100100_15(awS2S2200100_15.j4, str2, awS2S2200100_15.s1, (ConvertNoticeboardMaterialInfo) awS2S2200100_15.l3, 2)).LJJ(C1701940uOG.LIZIZ()).LJIILL(new AfS3S0000100_15(awS2S2200100_15.j4, 5)).LJIIL(new AfS3S0000100_15(awS2S2200100_15.j4, 6)), "CloudDraftItemManager_Noticeboard", "templateToDraftItem")).LJIILL().LJIIZILJ();
            } else {
                List<InterfaceC915550Zvt> list2 = concurrentHashMap2.get(Long.valueOf(awS2S2200100_15.j4));
                if (list2 != null) {
                    list2.add((InterfaceC915550Zvt) awS2S2200100_15.l2);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("add templateCallback, callback: ");
                sbLIZ2.append((InterfaceC915550Zvt) awS2S2200100_15.l2);
                C20441214yg.LIZIZ("CloudDraftItemManager_Noticeboard", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S2200100_15(long j, InterfaceC915550Zvt interfaceC915550Zvt, String str, String str2, ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo, int i) {
        super(0);
        this.$t = i;
        this.j4 = j;
        this.l2 = interfaceC915550Zvt;
        this.l3 = convertNoticeboardMaterialInfo;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S2200100_15(C969930bLb c969930bLb, long j, String str, String str2, ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo, int i) {
        super(0);
        this.$t = i;
        this.l2 = c969930bLb;
        this.j4 = j;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = convertNoticeboardMaterialInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S2200100_15(TemplateFragment templateFragment, long j, String str, String str2, ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo, int i) {
        super(0);
        this.$t = i;
        this.l2 = templateFragment;
        this.j4 = j;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = convertNoticeboardMaterialInfo;
    }
}
