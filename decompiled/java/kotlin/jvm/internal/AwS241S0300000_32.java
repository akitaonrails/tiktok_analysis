package kotlin.jvm.internal;

import X.AbstractC214814194y;
import X.AbstractC855580XhM;
import X.AbstractC855920Xhu;
import X.C09AY;
import X.C0ET4;
import X.C1018703yb;
import X.C1104190eq9;
import X.C1512110pS5;
import X.C1741890vQh;
import X.C189L;
import X.C18NO;
import X.C18UJ;
import X.C18UP;
import X.C18VZ;
import X.C18XB;
import X.C190Y;
import X.C19A3;
import X.C19EG;
import X.C1DRF;
import X.C1DRG;
import X.C2097908Jt;
import X.C21186517vb;
import X.C21271918Mj;
import X.C21272618Mq;
import X.C21302318Yb;
import X.C21303718Yp;
import X.C21304118Yt;
import X.C21308518aB;
import X.C21355818ho;
import X.C21356918hz;
import X.C21363418j2;
import X.C214848196g;
import X.C2178401ANi;
import X.C2344009Gk;
import X.C294630Bgj;
import X.C522610KeZ;
import X.C559610Lx9;
import X.C598640Ndu;
import X.C856850XjP;
import X.C957403oi;
import X.InterfaceC1392640mLO;
import X.InterfaceC19511611Vi;
import X.InterfaceC21364718jF;
import X.InterfaceC524950KiL;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.n;
import com.ss.android.ugc.aweme.aiuikit.api.pages.preview.CameoPreviewScene;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.PanelBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommercelive.audience.us.lifecycle.UsEcommerceRoomLifecycleObserver;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishPageResourceLoadedEvent;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler;
import com.ss.android.ugc.tools.chat.room.scene.AiChatRoomRootScene;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jg5.AvS540S0100000_8;
import jg5.AvS541S0100000_22;
import jg5.AvS542S0100000_25;
import jg5.AvS544S0100000_32;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS241S0300000_32 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        ProductListModel productListModel = (ProductListModel) awS241S0300000_32.l0;
        PanelBannerInfo panelBannerInfo = (PanelBannerInfo) awS241S0300000_32.l1;
        Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c92278.d5371", PageFinder.via((View) awS241S0300000_32.l2), null, 4, null);
        c21271918Mj.getClass();
        C1018703yb.LIZLLL("tiktokec_banner_show", new AwS241S0300000_32(productListModel, (ProductListModel) panelBannerInfo, (PanelBannerInfo) mapCreateReportParams$default, (Map<String, ? extends Object>) 10));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        C1DRF c1drf = (C1DRF) obj;
        c1drf.LJFF(Context.class, null, new AvS540S0100000_8((VideoPublishContainerScene) awS241S0300000_32.l0, 80));
        c1drf.LJFF(Fragment.class, null, new AvS541S0100000_22((VideoPublishContainerScene) awS241S0300000_32.l0, 40));
        c1drf.LJFF(C19EG.class, null, new AvS540S0100000_8((VideoPublishContainerScene) awS241S0300000_32.l0, 83));
        C21308518aB c21308518aBLJFF = c1drf.LJFF(VideoPublishContainerScene.class, null, new AvS544S0100000_32((VideoPublishContainerScene) awS241S0300000_32.l1, 5));
        c21308518aBLJFF.LIZ(InterfaceC19511611Vi.class);
        c21308518aBLJFF.LIZ(AbstractC214814194y.class);
        c1drf.LJFF(VideoPublishEditModel.class, null, new AvS540S0100000_8((VideoPublishEditModel) awS241S0300000_32.l2, 86));
        c1drf.LJFF(List.class, null, new AvS544S0100000_32((VideoPublishContainerScene) awS241S0300000_32.l0, 6));
        c1drf.LJFF(ExtensionDataRepo.class, null, new AvS541S0100000_22((VideoPublishContainerScene) awS241S0300000_32.l1, 42));
        c1drf.LJFF(C214848196g.class, null, new AvS544S0100000_32((VideoPublishContainerScene) awS241S0300000_32.l0, 7));
        c1drf.LJFF(AbstractC855580XhM.class, null, new AvS541S0100000_22((VideoPublishContainerScene) awS241S0300000_32.l0, 43));
        c1drf.LJFF(AbstractC855920Xhu.class, null, new AvS544S0100000_32((VideoPublishContainerScene) awS241S0300000_32.l0, 2));
        c1drf.LJFF(VideoPublishViewModel.class, null, new AvS544S0100000_32((VideoPublishContainerScene) awS241S0300000_32.l0, 3));
        c1drf.LJFF(PublishPageResourceLoadedEvent.class, null, new AvS542S0100000_25((VideoPublishContainerScene) awS241S0300000_32.l0, 14));
        Bundle bundle = ((VideoPublishContainerScene) awS241S0300000_32.l0).LLLLIL;
        if (bundle != null) {
            c1drf.LJFF(Bundle.class, null, new AvS540S0100000_8(bundle, 95));
        }
        c1drf.LIZJ(C856850XjP.class, null, new AvS544S0100000_32((VideoPublishContainerScene) awS241S0300000_32.l0, 1));
        c1drf.LJFF(C190Y.class, null, new AvS544S0100000_32((VideoPublishContainerScene) awS241S0300000_32.l1, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        String str;
        n nVar;
        String string;
        HashMap<String, Object> mapLJIIJ;
        Object obj2;
        String str2;
        HashMap<String, Object> mapLJIIJ2;
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        ProductListModel productListModel = (ProductListModel) awS241S0300000_32.l0;
        if (productListModel == null || (str = productListModel.eventType) == null) {
            str = "";
        }
        c957403oi.LIZLLL("enter_from", str);
        c957403oi.LIZLLL("source_page_type", "video");
        c957403oi.LIZLLL("page_name", "video");
        c957403oi.LIZLLL("entrance_form", "video_multi_anchor");
        ProductListModel productListModel2 = (ProductListModel) awS241S0300000_32.l0;
        if (productListModel2 != null) {
            String str3 = productListModel2.authorUid;
            if (str3 == null) {
                str3 = "";
            }
            c957403oi.LIZLLL("author_id", str3);
            String str4 = productListModel2.groupId;
            if (str4 == null) {
                str4 = "";
            }
            c957403oi.LIZLLL("group_id", str4);
        }
        PanelBannerInfo panelBannerInfo = (PanelBannerInfo) awS241S0300000_32.l1;
        if (panelBannerInfo != null && (str2 = panelBannerInfo.daInfo) != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str2)) != null) {
            for (Map.Entry<String, Object> entry : mapLJIIJ2.entrySet()) {
                c957403oi.LIZLLL(entry.getKey(), entry.getValue());
            }
        }
        PanelBannerInfo panelBannerInfo2 = (PanelBannerInfo) awS241S0300000_32.l1;
        if (panelBannerInfo2 != null) {
            nVar = new n();
            String str5 = panelBannerInfo2.daInfo;
            if (str5 == null || (mapLJIIJ = C1741890vQh.LJIIJ(str5)) == null || (obj2 = mapLJIIJ.get("bcm_nova_delivery_id")) == null || (string = obj2.toString()) == null) {
                string = "";
            }
            nVar.LJJIIJ("bcm_nova_delivery_id", string);
        } else {
            nVar = new n();
        }
        c957403oi.LIZLLL("btm_unit_params", nVar);
        Map map = (Map) awS241S0300000_32.l2;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry2 : map.entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                if (value == null) {
                    value = "";
                }
                linkedHashMap.put(key, value);
            }
            c957403oi.LJ(linkedHashMap);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C18VZ c18vz = new C18VZ((AiChatRoomRootScene) awS241S0300000_32.l1, (C1DRG) obj);
        ((AiChatRoomRootScene) awS241S0300000_32.l2).LLJL = new AwS611S0100000_32(c18vz, 329);
        ((C559610Lx9) awS241S0300000_32.l0).getClass();
        c18vz.afterInit$als_release(jUptimeMillis);
        return c18vz;
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C18XB c18xb = new C18XB((C1DRG) obj, (AiChatRoomRootScene) awS241S0300000_32.l1);
        InterfaceC524950KiL interfaceC524950KiL = (InterfaceC524950KiL) ((AiChatRoomRootScene) awS241S0300000_32.l2).LLJJIJIL.getValue();
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.kF(c18xb);
        }
        ((AiChatRoomRootScene) awS241S0300000_32.l2).LLJJJIL.add(c18xb);
        ((C559610Lx9) awS241S0300000_32.l0).getClass();
        c18xb.afterInit$als_release(jUptimeMillis);
        return c18xb;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C2178401ANi c2178401ANi = new C2178401ANi((C19A3) awS241S0300000_32.l1, (C1DRG) obj, ((CameoPreviewScene) awS241S0300000_32.l2).LLLLLLL());
        ((C559610Lx9) awS241S0300000_32.l0).getClass();
        c2178401ANi.afterInit$als_release(jUptimeMillis);
        return c2178401ANi;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C21303718Yp c21303718Yp = new C21303718Yp((C19A3) awS241S0300000_32.l1, (C1DRG) obj, ((CameoPreviewScene) awS241S0300000_32.l2).LLLLLLLLL());
        ((C559610Lx9) awS241S0300000_32.l0).getClass();
        c21303718Yp.afterInit$als_release(jUptimeMillis);
        return c21303718Yp;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C21304118Yt c21304118Yt = new C21304118Yt((C19A3) awS241S0300000_32.l1, (C1DRG) obj, ((CameoPreviewScene) awS241S0300000_32.l2).LLLLLLLLLL());
        ((C559610Lx9) awS241S0300000_32.l0).getClass();
        c21304118Yt.afterInit$als_release(jUptimeMillis);
        return c21304118Yt;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C21302318Yb c21302318Yb = new C21302318Yb((C19A3) awS241S0300000_32.l1, (C1DRG) obj, ((CameoPreviewScene) awS241S0300000_32.l2).LLLLLLLLLL());
        ((C559610Lx9) awS241S0300000_32.l0).getClass();
        c21302318Yb.afterInit$als_release(jUptimeMillis);
        return c21302318Yb;
    }

    public static final Object invoke$17(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        String str = (String) obj;
        if (Intrinsics.LJFF(((Room) awS241S0300000_32.l0).getIdStr(), ((UsEcommerceRoomLifecycleObserver) awS241S0300000_32.l1).LIZLLL) && !C294630Bgj.LIZ()) {
            ((UsEcommerceRoomLifecycleObserver) awS241S0300000_32.l1).LIZLLL((Fragment) awS241S0300000_32.l2, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        String str = (String) obj;
        if (Intrinsics.LJFF(((Room) awS241S0300000_32.l0).getIdStr(), ((UsEcommerceRoomLifecycleObserver) awS241S0300000_32.l1).LIZLLL) && !C294630Bgj.LIZ()) {
            ((UsEcommerceRoomLifecycleObserver) awS241S0300000_32.l1).LIZLLL((Fragment) awS241S0300000_32.l2, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        Aweme awemeLJJLIIIJJIZ;
        Pair pair = (Pair) obj;
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        ((HashMap) awS241S0300000_32.l0).putAll(((C18NO) awS241S0300000_32.l1).LJI(((Number) pair.getSecond()).intValue(), zBooleanValue));
        C18NO c18no = (C18NO) awS241S0300000_32.l1;
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = c18no.LIZIZ;
        C2344009Gk c2344009Gk = (C2344009Gk) awS241S0300000_32.l2;
        c2344009Gk.LJII(C1104190eq9.LIZ(c18no.LIZ, "c5134.d0"));
        HashMap map = (HashMap) awS241S0300000_32.l0;
        C21272618Mq c21272618Mq = C21272618Mq.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = ((C18NO) awS241S0300000_32.l1).LIZIZ.LL;
        if (interfaceC1392640mLO != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        } else {
            awemeLJJLIIIJJIZ = null;
        }
        List<AnchorProductInfoModel> list = ((C18NO) awS241S0300000_32.l1).LIZIZ.LLILZIL;
        c21272618Mq.getClass();
        ECommerceAnchorPanelViewModel.xQ2(eCommerceAnchorPanelViewModel, c2344009Gk, map, Boolean.valueOf(C21272618Mq.LJIIIZ(awemeLJJLIIIJJIZ, list, false)), 14);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0c11  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS241S0300000_32 r28, java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 3484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS241S0300000_32.invoke$2(kotlin.jvm.internal.AwS241S0300000_32, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        InterfaceC21364718jF interfaceC21364718jF = (InterfaceC21364718jF) awS241S0300000_32.l0;
        if (interfaceC21364718jF != null) {
            interfaceC21364718jF.onSuccess();
        }
        C21356918hz c21356918hz = (C21356918hz) awS241S0300000_32.l1;
        String str = c21356918hz.LIZIZ;
        if (str != null) {
            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = (BackgroundVideoStickerPresenter) awS241S0300000_32.l2;
            backgroundVideoStickerPresenter.LLILZLL.get().LJIIJJI(str, new C21363418j2(backgroundVideoStickerPresenter, str, c21356918hz.LJFF));
            backgroundVideoStickerPresenter.LLLILZJ = 0;
            backgroundVideoStickerPresenter.LJJIJIIJI(true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        InterfaceC21364718jF interfaceC21364718jF = (InterfaceC21364718jF) awS241S0300000_32.l0;
        if (interfaceC21364718jF != null) {
            interfaceC21364718jF.onSuccess();
        }
        String str = ((C21356918hz) awS241S0300000_32.l1).LIZIZ;
        if (str != null) {
            DiyPropVideoStickerHandler diyPropVideoStickerHandler = (DiyPropVideoStickerHandler) awS241S0300000_32.l2;
            diyPropVideoStickerHandler.LLJ.LIZLLL(str, new AwS181S1100000_32(diyPropVideoStickerHandler, str, 7));
            C522610KeZ.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        Function0 function0 = (Function0) awS241S0300000_32.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C18UP c18up = C18UP.LIZ;
        C18UJ c18uj = (C18UJ) awS241S0300000_32.l1;
        AIChatGenNode aIChatGenNode = (AIChatGenNode) awS241S0300000_32.l2;
        c18up.getClass();
        C18UP.LJIILIIL(aIChatGenNode, c18uj, "stay");
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        String str = (String) obj;
        if (Intrinsics.LJFF(((Room) awS241S0300000_32.l0).getIdStr(), ((C21186517vb) awS241S0300000_32.l1).LIZLLL) && !C294630Bgj.LIZ()) {
            ((C21186517vb) awS241S0300000_32.l1).LIZIZ((Fragment) awS241S0300000_32.l2, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        String str = (String) obj;
        if (Intrinsics.LJFF(((Room) awS241S0300000_32.l0).getIdStr(), ((C21186517vb) awS241S0300000_32.l1).LIZLLL) && !C294630Bgj.LIZ()) {
            ((C21186517vb) awS241S0300000_32.l1).LIZIZ((Fragment) awS241S0300000_32.l2, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        C21186517vb c21186517vb;
        C598640Ndu c598640Ndu;
        C1512110pS5 c1512110pS5 = (C1512110pS5) obj;
        if ((!c1512110pS5.LIZ || c1512110pS5.LIZLLL) && (c598640Ndu = (c21186517vb = (C21186517vb) awS241S0300000_32.l0).LIZ) != null) {
            Room room = (Room) awS241S0300000_32.l1;
            c598640Ndu.LIZ(room, c21186517vb.LIZIZ, new AwS241S0300000_32((Fragment) awS241S0300000_32.l2, room, c21186517vb, 7));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS241S0300000_32 awS241S0300000_32, Object obj) {
        String str = (String) obj;
        if (Intrinsics.LJFF(((Room) awS241S0300000_32.l0).getIdStr(), ((C21186517vb) awS241S0300000_32.l1).LIZLLL) && !C294630Bgj.LIZ()) {
            ((C21186517vb) awS241S0300000_32.l1).LIZIZ((Fragment) awS241S0300000_32.l2, str);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS241S0300000_32(androidx.fragment.app.Fragment r3, com.bytedance.android.livesdkapi.depend.model.live.Room r4, X.C21186517vb r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 6: goto L11;
                case 7: goto L11;
                case 8: goto L5;
                case 9: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS241S0300000_32.<init>(androidx.fragment.app.Fragment, com.bytedance.android.livesdkapi.depend.model.live.Room, X.17vb, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS241S0300000_32(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3, com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene r4, com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 1 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS241S0300000_32.<init>(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene, com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS241S0300000_32(C21355818ho c21355818ho, C21356918hz c21356918hz, BackgroundVideoStickerPresenter backgroundVideoStickerPresenter, int i) {
        super(1);
        this.$t = i;
        this.l0 = c21355818ho;
        this.l1 = c21356918hz;
        this.l2 = backgroundVideoStickerPresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS241S0300000_32(Room room, UsEcommerceRoomLifecycleObserver usEcommerceRoomLifecycleObserver, Fragment fragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = room;
        this.l1 = usEcommerceRoomLifecycleObserver;
        this.l2 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS241S0300000_32(ProductListModel productListModel, PanelBannerInfo panelBannerInfo, C189L c189l, int i) {
        super(1);
        this.$t = i;
        this.l0 = productListModel;
        this.l1 = panelBannerInfo;
        this.l2 = c189l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS241S0300000_32(ProductListModel productListModel, ProductListModel productListModel2, PanelBannerInfo panelBannerInfo, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = productListModel;
        this.l1 = productListModel2;
        this.l2 = panelBannerInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS241S0300000_32(HashMap map, HashMap<String, Object> map2, C18NO c18no, C2344009Gk c2344009Gk) {
        super(1);
        this.$t = c2344009Gk;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = c18no;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS241S0300000_32(Function0 function0, Function0<Unit> function02, C18UJ c18uj, AIChatGenNode aIChatGenNode) {
        super(1);
        this.$t = aIChatGenNode;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = c18uj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS241S0300000_32(C0ET4 c0et4, C559610Lx9 c559610Lx9, C19A3 c19a3, CameoPreviewScene cameoPreviewScene, int i) {
        super(1);
        this.$t = i;
        this.l0 = c559610Lx9;
        this.l1 = c19a3;
        this.l2 = cameoPreviewScene;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS241S0300000_32(C0ET4 c0et4, C559610Lx9 c559610Lx9, AiChatRoomRootScene aiChatRoomRootScene, AiChatRoomRootScene aiChatRoomRootScene2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c559610Lx9;
        this.l1 = aiChatRoomRootScene;
        this.l2 = aiChatRoomRootScene2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS241S0300000_32(C21355818ho c21355818ho, C21356918hz c21356918hz, DiyPropVideoStickerHandler diyPropVideoStickerHandler, C21356918hz c21356918hz2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c21355818ho;
        this.l1 = c21356918hz;
        this.l2 = diyPropVideoStickerHandler;
    }
}
