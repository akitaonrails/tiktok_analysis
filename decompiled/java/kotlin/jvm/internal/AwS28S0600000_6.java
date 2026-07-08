package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.AnonymousClass0951;
import X.C01GW;
import X.C05YD;
import X.C05YW;
import X.C09AY;
import X.C09IC;
import X.C0HOB;
import X.C0HOM;
import X.C0HPS;
import X.C0HPZ;
import X.C0HQ0;
import X.C0HQC;
import X.C0HV1;
import X.C0HV9;
import X.C0SZ4;
import X.C1163440gNi;
import X.C1220000hqw;
import X.C1370905Yd;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1910890zpH;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C342950DcT;
import X.C343000DcY;
import X.C434100H0m;
import X.C434130H0p;
import X.C440440HOw;
import X.C441780HUa;
import X.C441830HUf;
import X.C441880HUk;
import X.C442020HUy;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C457400Hwg;
import X.C457780HxI;
import X.C463000IDq;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.EnumC1910860zpE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC440090HNn;
import X.InterfaceC441960HUs;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.misc.IMImageBtnViewAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.misc.LoadingAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.misc.MixStudioViewAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerFeatureIconAbility;
import com.ss.android.ugc.aweme.im.sticker.api.assem.IStickerRecommendBannerStateAbility;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS28S0600000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS28S0600000_6 awS28S0600000_6, Object obj) {
        C0HQ0 c0hq0 = C0HQ0.LIZ;
        List list = (List) awS28S0600000_6.l0;
        C05YD<C0HOM<? extends List<? extends C440440HOw>>> state = ((IdAndElementViewModel) awS28S0600000_6.l1).yQ2().getState();
        LinkedHashMap linkedHashMap = (LinkedHashMap) awS28S0600000_6.l2;
        Map map = (Map) awS28S0600000_6.l3;
        C05YD c05yd = (C05YD) awS28S0600000_6.l4;
        InterfaceC440090HNn interfaceC440090HNn = (InterfaceC440090HNn) awS28S0600000_6.l5;
        obj.getClass();
        return new C0HPZ(c0hq0, list, state, linkedHashMap, map, c05yd, interfaceC440090HNn);
    }

    public static final Object invoke$1(AwS28S0600000_6 awS28S0600000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        UIAssem uIAssem = (UIAssem) awS28S0600000_6.l0;
        IEmojiBtnAbility iEmojiBtnAbility = (IEmojiBtnAbility) awS28S0600000_6.l1;
        InterfaceC441960HUs interfaceC441960HUs = (InterfaceC441960HUs) awS28S0600000_6.l2;
        IInputFieldAbility iInputFieldAbility = (IInputFieldAbility) awS28S0600000_6.l3;
        IStickerFeatureIconAbility iStickerFeatureIconAbility = (IStickerFeatureIconAbility) awS28S0600000_6.l4;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C457400Hwg.LIZ;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C434100H0m(0));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem), null, null, new C441880HUk(iEmojiBtnAbility, c2252321DDqLIZ, iStickerFeatureIconAbility, null), 3);
        new AwS0S0700000_6(C13LE.LIZ(IMImageBtnViewAssem.class), uIAssem, C1163440gNi.LIZ, c2252321DDqLIZ, new C343000DcY(new AwS215S0300000_6(interfaceC441960HUs, iStickerFeatureIconAbility, iInputFieldAbility, 26), null), C0HV9.EMOJI_BTN, (Function2) null, 15).invoke(c0sz4);
        c0sz4.LLIZLLLIL = ((FrameLayout) awS28S0600000_6.l5).getId();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS28S0600000_6 awS28S0600000_6, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        UIAssem uIAssem = (UIAssem) awS28S0600000_6.l0;
        IEmojiBtnAbility iEmojiBtnAbility = (IEmojiBtnAbility) awS28S0600000_6.l1;
        IInputFieldAbility iInputFieldAbility = (IInputFieldAbility) awS28S0600000_6.l2;
        InterfaceC441960HUs interfaceC441960HUs = (InterfaceC441960HUs) awS28S0600000_6.l3;
        MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) awS28S0600000_6.l4;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C457400Hwg.LIZ;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C342950DcT(3));
        MixStudioEntranceControl mixStudioEntranceControl = (MixStudioEntranceControl) PluggableExtentionKt.pluggableSpiForReal(MixStudioEntranceControl.class);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem), null, null, new C441830HUf(iEmojiBtnAbility, mixStudioStatusRepository, mixStudioEntranceControl, c2252321DDqLIZ, null), 3);
        new AwS0S0700000_6(C13LE.LIZ(LoadingAssem.class), uIAssem, C1163440gNi.LIZ, c2252321DDqLIZ, new C343000DcY(new AwS104S0400000_6(interfaceC441960HUs, c2252321DDqLIZ, mixStudioEntranceControl, iInputFieldAbility, 9), null), (C0HV9) null, AFwS287S0000000_4.get$arr$(27), 13).invoke(c0sz4);
        c0sz4.LLIZLLLIL = ((FrameLayout) awS28S0600000_6.l5).getId();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.099V, kotlin.coroutines.CoroutineContext, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.05Vn] */
    public static final Object invoke$3(AwS28S0600000_6 awS28S0600000_6, Object obj) {
        int i;
        IEmojiBtnAbility iEmojiBtnAbility;
        UIAssem uIAssem;
        C05YD c05ydLIZ;
        C0SZ4 c0sz4 = (C0SZ4) obj;
        UIAssem uIAssem2 = (UIAssem) awS28S0600000_6.l0;
        IEmojiBtnAbility iEmojiBtnAbility2 = (IEmojiBtnAbility) awS28S0600000_6.l1;
        IInputFieldAbility iInputFieldAbility = (IInputFieldAbility) awS28S0600000_6.l2;
        SessionInfo sessionInfo = (SessionInfo) awS28S0600000_6.l3;
        MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) awS28S0600000_6.l4;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C457400Hwg.LIZ;
        ?? r0 = 0;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C434130H0p(false, null));
        MixStudioLauncher mixStudioLauncher = (MixStudioLauncher) PluggableExtentionKt.pluggableSpiForReal(MixStudioLauncher.class);
        MixStudioEntranceControl mixStudioEntranceControl = (MixStudioEntranceControl) PluggableExtentionKt.pluggableSpiForReal(MixStudioEntranceControl.class);
        View viewLJJIJL = uIAssem2.LJJIJL();
        String conversationId = sessionInfo.getConversationId();
        if (mixStudioEntranceControl != null && mixStudioEntranceControl.LJIIJJI()) {
            IStickerRecommendBannerStateAbility iStickerRecommendBannerStateAbility = (IStickerRecommendBannerStateAbility) C1558520qew.LIZ(C1558520qew.LJIIL(uIAssem2), IStickerRecommendBannerStateAbility.class, null);
            if (iStickerRecommendBannerStateAbility == null || (c05ydLIZ = iStickerRecommendBannerStateAbility.b11()) == null) {
                c05ydLIZ = C1BNE.LIZ(Boolean.FALSE);
            }
            C736950SvV c736950SvV = new C736950SvV(C13LE.LIZ(IMStickerPanelEventViewModel.class), new AwS91S1000000_6(conversationId, 2), new C452070Ho5(), C724750Sbp.LJII(uIAssem2), C1220000hqw.LIZ(uIAssem2), AFwS236S0000000_6.get$arr$(501), new AwS550S0100000_6((AbstractC738140SxQ) uIAssem2, 1435), new C451610HnL(uIAssem2, true, true), new C723700Sa8(uIAssem2));
            C1559260qg8 c1559260qg8 = new C1559260qg8(new C723580SZw(uIAssem2, C457780HxI.class, null), uIAssem2.checkSupervisorPrepared());
            C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.SOCIAL_AVATAR);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(549));
            C463000IDq c463000IDq = new C463000IDq(iEmojiBtnAbility2.W90(), 44);
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(uIAssem2);
            C05YW.LIZ.getClass();
            AnonymousClass0951 anonymousClass0951LJJIJIL = C09IC.LJJIJIL(c463000IDq, lifecycleScope, C1370905Yd.LIZIZ, Boolean.TRUE);
            AtomicReference atomicReference = new AtomicReference(null);
            iEmojiBtnAbility = iEmojiBtnAbility2;
            uIAssem = uIAssem2;
            i = 3;
            r0 = 0;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem2), null, null, new C0HV1(mixStudioStatusRepository, c1910890zpHLIZ, "ChatroomInputButton", c05ydLIZ, anonymousClass0951LJJIJIL, iEmojiBtnAbility2, uIAssem2, viewLJJIJL, atomicReference, c01gwLIZIZ, c1559260qg8, c736950SvV, null), 3);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem2), null, null, new C442020HUy(c05ydLIZ, anonymousClass0951LJJIJIL, c1910890zpHLIZ, "ChatroomInputButton", atomicReference, null), 3);
        } else {
            i = 3;
            iEmojiBtnAbility = iEmojiBtnAbility2;
            uIAssem = uIAssem2;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem), r0, r0, new C441780HUa(mixStudioLauncher, sessionInfo, c2252321DDqLIZ, iEmojiBtnAbility, r0), i);
        new AwS0S0700000_6(C13LE.LIZ(MixStudioViewAssem.class), uIAssem, C1163440gNi.LIZ, c2252321DDqLIZ, new C343000DcY(new AwS0S0700000_6(uIAssem, iEmojiBtnAbility, mixStudioEntranceControl, mixStudioLauncher, sessionInfo, iInputFieldAbility, c2252321DDqLIZ, 12), r0), (C0HV9) null, AFwS287S0000000_4.get$arr$(26), 10).invoke(c0sz4);
        c0sz4.LLIZLLLIL = ((FrameLayout) awS28S0600000_6.l5).getId();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0600000_6(UIAssem uIAssem, IEmojiBtnAbility iEmojiBtnAbility, InterfaceC441960HUs interfaceC441960HUs, IInputFieldAbility iInputFieldAbility, IStickerFeatureIconAbility iStickerFeatureIconAbility, FrameLayout frameLayout, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = iEmojiBtnAbility;
        this.l2 = interfaceC441960HUs;
        this.l3 = iInputFieldAbility;
        this.l4 = iStickerFeatureIconAbility;
        this.l5 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0600000_6(UIAssem uIAssem, IEmojiBtnAbility iEmojiBtnAbility, IInputFieldAbility iInputFieldAbility, InterfaceC441960HUs interfaceC441960HUs, MixStudioStatusRepository mixStudioStatusRepository, FrameLayout frameLayout, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = iEmojiBtnAbility;
        this.l2 = iInputFieldAbility;
        this.l3 = interfaceC441960HUs;
        this.l4 = mixStudioStatusRepository;
        this.l5 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0600000_6(UIAssem uIAssem, IEmojiBtnAbility iEmojiBtnAbility, IInputFieldAbility iInputFieldAbility, SessionInfo sessionInfo, MixStudioStatusRepository mixStudioStatusRepository, FrameLayout frameLayout, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = iEmojiBtnAbility;
        this.l2 = iInputFieldAbility;
        this.l3 = sessionInfo;
        this.l4 = mixStudioStatusRepository;
        this.l5 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS28S0600000_6(List list, List<C0HQC> list2, IdAndElementViewModel idAndElementViewModel, LinkedHashMap<Integer, C0HPS> linkedHashMap, Map<Integer, C0HOB> map, C05YD<? extends C0HOM<? extends List<C440440HOw>>> c05yd, InterfaceC440090HNn interfaceC440090HNn) {
        super(1);
        this.$t = interfaceC440090HNn;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = idAndElementViewModel;
        this.l3 = linkedHashMap;
        this.l4 = map;
        this.l5 = c05yd;
    }
}
