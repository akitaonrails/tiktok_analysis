package kotlin.jvm.internal;

import X.C03H5;
import X.C09AY;
import X.C09R7;
import X.C0P0T;
import X.C0R60;
import X.C0RPA;
import X.C0RTY;
import X.C0SUA;
import X.C0T5M;
import X.C0T6L;
import X.C13IQ;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C19EG;
import X.C20684815ws;
import X.C211200re;
import X.C2188811AlT;
import X.C259800zU;
import X.C266090Abn;
import X.C698680Ras;
import X.C700310RdV;
import X.C700970ReZ;
import X.C701240Rf0;
import X.C701360RfC;
import X.C701480RfO;
import X.C703900RjI;
import X.C703910RjJ;
import X.C704830Rkn;
import X.C705930RmZ;
import X.C707810Rpb;
import X.C723710Sa9;
import X.C723830SaL;
import X.C725080ScM;
import X.C730120SkU;
import X.C844470XAv;
import X.EnumC705650Rm7;
import X.InterfaceC111300bX;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import X.InterfaceC701660Rfg;
import X.InterfaceC702840Rha;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeTextInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import com.ss.android.ugc.aweme.feed.model.banner.StandardUiTypeEnum;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.template.button.ui.FcpStandardLogicAssem;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.template.button.ui.FcpStandardTemplateAssem;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public class AwS127S1200000_11 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS127S1200000_11 awS127S1200000_11) {
        Integer num;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(" --- find occupied node: ");
        sbLIZ.append(awS127S1200000_11.s0);
        sbLIZ.append(", origin origin_priority: ");
        C701240Rf0 c701240Rf0 = ((C700970ReZ) awS127S1200000_11.l1).LJIIIIZZ;
        if (c701240Rf0 != null) {
            num = c701240Rf0.LIZIZ;
        } else {
            num = null;
        }
        sbLIZ.append(num);
        sbLIZ.append(", occupied_priority: ");
        sbLIZ.append(((Map) awS127S1200000_11.l2).get(awS127S1200000_11.s0));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS127S1200000_11 awS127S1200000_11) {
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        C20684815ws.LJIIJ(0L, "click_share_button", awS127S1200000_11.s0, ((Aweme) awS127S1200000_11.l1).getAid(), ((VideoShareViewModel) awS127S1200000_11.l2).AQ2((Aweme) awS127S1200000_11.l1));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS127S1200000_11 awS127S1200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executePendingTasks drop_stale aid=");
        sbLIZ.append(((C703900RjI) awS127S1200000_11.l1).LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(awS127S1200000_11.s0);
        sbLIZ.append(" taskGeneration=");
        sbLIZ.append(((C703910RjJ) awS127S1200000_11.l2).LIZ);
        sbLIZ.append(" currentGeneration=");
        sbLIZ.append(((C703900RjI) awS127S1200000_11.l1).LIZJ);
        sbLIZ.append(" pendingTotal=");
        sbLIZ.append(((C703900RjI) awS127S1200000_11.l1).LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$11(AwS127S1200000_11 awS127S1200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executePendingTasks drop_ttl aid=");
        sbLIZ.append(((C703900RjI) awS127S1200000_11.l1).LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(awS127S1200000_11.s0);
        sbLIZ.append(" taskGeneration=");
        sbLIZ.append(((C703910RjJ) awS127S1200000_11.l2).LIZ);
        sbLIZ.append(" ageMs=");
        sbLIZ.append(System.currentTimeMillis() - ((C703910RjJ) awS127S1200000_11.l2).LIZIZ);
        sbLIZ.append(" pendingTotal=");
        sbLIZ.append(((C703900RjI) awS127S1200000_11.l1).LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$12(AwS127S1200000_11 awS127S1200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executePendingTasks run aid=");
        sbLIZ.append(((C703900RjI) awS127S1200000_11.l1).LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(awS127S1200000_11.s0);
        sbLIZ.append(" dedupeKey=");
        sbLIZ.append(((C703910RjJ) awS127S1200000_11.l2).LIZJ);
        sbLIZ.append(" taskGeneration=");
        sbLIZ.append(((C703910RjJ) awS127S1200000_11.l2).LIZ);
        sbLIZ.append(" pendingTotal=");
        sbLIZ.append(((C703900RjI) awS127S1200000_11.l1).LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$13(AwS127S1200000_11 awS127S1200000_11) {
        InterfaceC665370Q7z interfaceC665370Q7zInvoke;
        C723710Sa9 c723710Sa9;
        InterfaceC111300bX interfaceC111300bX;
        if (C725080ScM.LJIIJ) {
            Function0<InterfaceC665370Q7z> hierarchyDataVScopeProducer = ((AssemViewModel) awS127S1200000_11.l1).getHierarchyDataVScopeProducer();
            InterfaceC111300bX interfaceC111300bX2 = null;
            if (hierarchyDataVScopeProducer != null && (interfaceC665370Q7zInvoke = hierarchyDataVScopeProducer.invoke()) != null) {
                String strLIZ = C211200re.LIZ((Class) awS127S1200000_11.l2, awS127S1200000_11.s0);
                if (strLIZ == null) {
                    strLIZ = "source_default_key";
                }
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zInvoke, strLIZ, C723710Sa9.class, null);
                if (interfaceC1555100qZQLIZIZ != null && (c723710Sa9 = (C723710Sa9) interfaceC1555100qZQLIZIZ.getSource()) != null && (interfaceC111300bX = c723710Sa9.LL) != null) {
                    interfaceC111300bX2 = interfaceC111300bX;
                }
            }
            AssemViewModel assemViewModel = (AssemViewModel) awS127S1200000_11.l1;
            if (interfaceC111300bX2 == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("No such hierarchyData on ");
                sbLIZ.append(assemViewModel);
                sbLIZ.append(" or any of its parents");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
            return interfaceC111300bX2;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) awS127S1200000_11.l1;
        C0RTY c0rty = assemViewModel2.hierarchyDataStore;
        if (c0rty != null) {
            return c0rty.LIZIZ((Class) awS127S1200000_11.l2, awS127S1200000_11.s0);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("HierarchyData has not inject to ");
        sbLIZ2.append(assemViewModel2);
        sbLIZ2.append(", you can't get hierarchyData");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalArgumentException(strLIZIZ2);
    }

    public static final Object invoke$14(AwS127S1200000_11 awS127S1200000_11) {
        C723710Sa9 c723710Sa9;
        InterfaceC111300bX interfaceC111300bX;
        if (C725080ScM.LJIIJ) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF((Fragment) awS127S1200000_11.l1, null);
            String strLIZ = C211200re.LIZ((Class) awS127S1200000_11.l2, awS127S1200000_11.s0);
            if (strLIZ == null) {
                strLIZ = "source_default_key";
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLJFF, strLIZ, C723710Sa9.class, null);
            if (interfaceC1555100qZQLIZIZ != null && (c723710Sa9 = (C723710Sa9) interfaceC1555100qZQLIZIZ.getSource()) != null && (interfaceC111300bX = c723710Sa9.LL) != null) {
                return interfaceC111300bX;
            }
        } else {
            C19EG activity = ((Fragment) awS127S1200000_11.l1).getActivity();
            if (activity != null) {
                Fragment fragment = (Fragment) awS127S1200000_11.l1;
                Class cls = (Class) awS127S1200000_11.l2;
                String str = awS127S1200000_11.s0;
                C0RTY c0rtyZQ2 = C0RPA.LIZ(activity).zQ2(fragment);
                if (c0rtyZQ2 != null) {
                    return c0rtyZQ2.LIZJ(cls, str);
                }
            }
        }
        return null;
    }

    public static final Object invoke$15(AwS127S1200000_11 awS127S1200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Show toast: ");
        sbLIZ.append(((EnumC705650Rm7) awS127S1200000_11.l1).getValue());
        sbLIZ.append(", key: ");
        sbLIZ.append(awS127S1200000_11.s0);
        sbLIZ.append(", anchorId: ");
        sbLIZ.append(((AnchorCommonStruct) awS127S1200000_11.l2).getId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$16(AwS127S1200000_11 awS127S1200000_11) {
        CardInsertInfo cardInsertInfo;
        CopyOnWriteArrayList<Aweme> copyOnWriteArrayList = (CopyOnWriteArrayList) awS127S1200000_11.l1;
        if (copyOnWriteArrayList != null) {
            final String str = awS127S1200000_11.s0;
            final Integer num = (Integer) awS127S1200000_11.l2;
            for (final Aweme aweme : copyOnWriteArrayList) {
                if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null) {
                    final int cardType = cardInsertInfo.getCardType();
                    if (aweme.getAwemeType() == 105) {
                        C0T5M c0t5m = C0T5M.LIZ;
                        Callable callable = new Callable() { // from class: X.0Ro1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Unit unit;
                                String aid;
                                C1C7U.LIZ("FeedLynxInserCardMobUtils@b4b2.recordLynxCardNetworkLoadProcess$1$1$1$1");
                                Aweme aweme2 = aweme;
                                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                                    unit = null;
                                } else {
                                    int i = cardType;
                                    String str2 = str;
                                    Integer num2 = num;
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    c2344009Gk.LIZJ(i, "card_type");
                                    Pair<Integer, Integer> pair = C706870Ro5.LIZ.get(aid);
                                    if (pair != null) {
                                        c2344009Gk.LIZJ(pair.getFirst().intValue(), "feed_count");
                                        c2344009Gk.LIZJ(pair.getSecond().intValue(), "insert_index");
                                    }
                                    c2344009Gk.LJFF("key_point", str2);
                                    if (num2 != null) {
                                        num2.intValue();
                                        c2344009Gk.LIZJ(num2.intValue(), "query_type");
                                    }
                                    C20684815ws.LJIILLIIL("tiktokec_rd_special_shaped_card_network_load_process", c2344009Gk.LIZ);
                                    unit = Unit.LIZ;
                                }
                                C1C7U.LIZIZ("FeedLynxInserCardMobUtils@b4b2.recordLynxCardNetworkLoadProcess$1$1$1$1");
                                return unit;
                            }
                        };
                        c0t5m.getClass();
                        C0T5M.LIZIZ(callable);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS127S1200000_11 awS127S1200000_11) {
        Long originalItemId;
        String str;
        Long commentId;
        PhotoModeTextInfo photoModeTextInfo;
        C0R60 c0r60;
        PhotoModeTextInfo photoModeTextInfo2;
        String str2;
        PhotoModeTextInfo photoModeTextInfo3;
        C0R60 c0r602;
        C0P0T c0p0t = (C0P0T) ((C259800zU) awS127S1200000_11.l1).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        Long originalItemId2 = null;
        ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        String aid = null;
        if (iTextToImageService != null) {
            C0SUA c0sua = (C0SUA) awS127S1200000_11.l2;
            C705930RmZ c705930RmZ = c0sua.LLILLJJLI;
            if (c705930RmZ != null && (c0r602 = c705930RmZ.LJIIZILJ) != null) {
                str2 = c0r602.LIZ;
            } else {
                str2 = null;
            }
            Aweme aweme = c0sua.LLILLL;
            if (aweme != null && (photoModeTextInfo3 = aweme.getPhotoModeTextInfo()) != null) {
                originalItemId2 = photoModeTextInfo3.getOriginalItemId();
            }
            iTextToImageService.LJIJ(aweme, str2, String.valueOf(originalItemId2), awS127S1200000_11.s0, "original_video_hotzone");
        }
        Intent intent = ((C0SUA) awS127S1200000_11.l2).LL.getIntent();
        boolean z = false;
        if (intent != null && intent.getBooleanExtra("from_view_post_entry", false)) {
            z = true;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C0SUA) awS127S1200000_11.l2).LL, "//aweme/detail");
        Aweme aweme2 = ((C0SUA) awS127S1200000_11.l2).LLILLL;
        if (aweme2 != null && (photoModeTextInfo2 = aweme2.getPhotoModeTextInfo()) != null) {
            originalItemId = photoModeTextInfo2.getOriginalItemId();
        } else {
            originalItemId = null;
        }
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, String.valueOf(originalItemId));
        C705930RmZ c705930RmZ2 = ((C0SUA) awS127S1200000_11.l2).LLILLJJLI;
        if (c705930RmZ2 != null && (c0r60 = c705930RmZ2.LJIIZILJ) != null) {
            str = c0r60.LIZ;
        } else {
            str = null;
        }
        smartRouteBuildRoute.withParam("refer", str);
        smartRouteBuildRoute.withParam("isChain", true);
        Aweme aweme3 = ((C0SUA) awS127S1200000_11.l2).LLILLL;
        if (aweme3 != null && (photoModeTextInfo = aweme3.getPhotoModeTextInfo()) != null) {
            commentId = photoModeTextInfo.getCommentId();
        } else {
            commentId = null;
        }
        smartRouteBuildRoute.withParam("cid", String.valueOf(commentId));
        smartRouteBuildRoute.withParam("comment_enter_method", "click_view_text_image_comment_post");
        Aweme aweme4 = ((C0SUA) awS127S1200000_11.l2).LLILLL;
        if (aweme4 != null) {
            aid = aweme4.getAid();
        }
        smartRouteBuildRoute.withParam("cmt_to_post_source_group_id", String.valueOf(aid));
        smartRouteBuildRoute.withParam("cmt_to_post_source_link_position", "original_video_hotzone");
        smartRouteBuildRoute.withParam("from_view_post_entry", z);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS127S1200000_11 awS127S1200000_11) {
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        C20684815ws.LJIIJ(0L, "click_share_button", awS127S1200000_11.s0, ((Aweme) awS127S1200000_11.l1).getAid(), ((VideoShareViewModel) awS127S1200000_11.l2).AQ2((Aweme) awS127S1200000_11.l1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS127S1200000_11 awS127S1200000_11) {
        ((StoryViewerListViewModel) awS127S1200000_11.l1).setState(new AwS125S1100000_11(awS127S1200000_11.s0, (C730120SkU) awS127S1200000_11.l2, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS127S1200000_11 awS127S1200000_11) {
        if (((AtomicInteger) awS127S1200000_11.l1).decrementAndGet() == 0) {
            ((PaidContentVideoHotSwapServiceImpl) awS127S1200000_11.l2).LJ.remove(awS127S1200000_11.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS127S1200000_11 awS127S1200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed FcpNode(");
        sbLIZ.append(awS127S1200000_11.s0);
        sbLIZ.append(") receive timing callback. signal#: ");
        sbLIZ.append((C698680Ras) awS127S1200000_11.l1);
        sbLIZ.append(". current_aid: ");
        sbLIZ.append(((C701360RfC) awS127S1200000_11.l2).LLJJ.LJLI());
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS127S1200000_11 awS127S1200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed FcpNode(");
        sbLIZ.append(awS127S1200000_11.s0);
        sbLIZ.append(") handleOutReachTimingAction. signal#: ");
        sbLIZ.append((C698680Ras) awS127S1200000_11.l1);
        sbLIZ.append(". current_aid: ");
        sbLIZ.append(((C701360RfC) awS127S1200000_11.l2).LLJJ.LJLI());
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS127S1200000_11 awS127S1200000_11) {
        int iIntValue;
        C13IQ c13iq;
        ReusedAssem fcpStandardTemplateAssem;
        InterfaceC701660Rfg interfaceC701660Rfg;
        Map<String, Integer> map;
        Integer num;
        Function1<WeakReference<C704830Rkn>, Function2<Map<String, Object>, Function0<Unit>, Unit>> function1Ca;
        Object next;
        Function1<WeakReference<C704830Rkn>, Function2<Map<String, Object>, Function0<Unit>, Unit>> function1Ca2;
        C701480RfO c701480RfO = (C701480RfO) awS127S1200000_11.l1;
        String str = awS127S1200000_11.s0;
        FcpUiTemplate fcpUiTemplate = (FcpUiTemplate) awS127S1200000_11.l2;
        ReusedAssem<?> reusedAssemLJFF = c701480RfO.LJFF(str);
        Set services = ServiceManager.get().getServices(IStandardConfigProvider.class);
        if (services != null) {
            Iterator it2 = services.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((IStandardConfigProvider) next).o7(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            IStandardConfigProvider iStandardConfigProvider = (IStandardConfigProvider) next;
            if (iStandardConfigProvider != null && (function1Ca2 = iStandardConfigProvider.Ca()) != null) {
                C704830Rkn c704830RknLIZIZ = c701480RfO.LJI.LIZIZ(str);
                Function2<Map<String, Object>, Function0<Unit>, Unit> function2Invoke = function1Ca2.invoke(new WeakReference<>(c704830RknLIZIZ));
                if (function2Invoke != null) {
                    c704830RknLIZIZ.LJ.LIZJ = function2Invoke;
                }
            }
        }
        List<IStandardConfigProvider> list = (List) c701480RfO.LJII.getValue();
        if (list != null) {
            for (IStandardConfigProvider iStandardConfigProvider2 : list) {
                if (Intrinsics.LJFF(iStandardConfigProvider2.o7(), str) && (function1Ca = iStandardConfigProvider2.Ca()) != null) {
                    C704830Rkn c704830RknLIZIZ2 = c701480RfO.LJI.LIZIZ(str);
                    Function2<Map<String, Object>, Function0<Unit>, Unit> function2Invoke2 = function1Ca.invoke(new WeakReference<>(c704830RknLIZIZ2));
                    if (function2Invoke2 != null) {
                        c704830RknLIZIZ2.LJ.LIZJ = function2Invoke2;
                    }
                }
            }
        }
        if (reusedAssemLJFF == null) {
            StandardUiTypeEnum.Companion companion = StandardUiTypeEnum.Companion;
            ClientStandardModel clientStandardModelKn = c701480RfO.LJ.kn(c701480RfO.LIZ);
            if (clientStandardModelKn != null && (map = clientStandardModelKn.componentsUiTypeMap) != null && (num = map.get(str)) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            if (companion.fromValue(iIntValue) == StandardUiTypeEnum.STANDARD && fcpUiTemplate != null) {
                if (c701480RfO.LIZIZ instanceof InterfaceC702840Rha) {
                    fcpStandardTemplateAssem = new FcpStandardLogicAssem(c701480RfO.LJI.LIZIZ(str));
                } else {
                    if (((Boolean) C266090Abn.LIZ.getValue()).booleanValue()) {
                        fcpStandardTemplateAssem = new FcpStandardTemplateAssem(c701480RfO.LJI.LIZIZ(str));
                    }
                    fcpStandardTemplateAssem = null;
                    c701480RfO.LIZLLL.LJLI();
                    new AwS96S1000000_11(str, 7);
                    C0T6L.LIZLLL();
                }
            } else {
                C707810Rpb c707810Rpb = C707810Rpb.LIZ;
                ((VideoItemParams) c701480RfO.LIZIZ.bo()).getAweme();
                c707810Rpb.getClass();
                Function0 function0 = (Function0) ((LinkedHashMap) C707810Rpb.LIZIZ).get(str);
                if (function0 != null && (c13iq = (C13IQ) function0.invoke()) != null) {
                    fcpStandardTemplateAssem = (ReusedUISlotAssem) C09R7.LIZ(c13iq).newInstance();
                    if (fcpStandardTemplateAssem == null) {
                    }
                } else {
                    fcpStandardTemplateAssem = null;
                }
                c701480RfO.LIZLLL.LJLI();
                new AwS96S1000000_11(str, 7);
                C0T6L.LIZLLL();
            }
            if ((fcpStandardTemplateAssem instanceof InterfaceC701660Rfg) && (interfaceC701660Rfg = (InterfaceC701660Rfg) fcpStandardTemplateAssem) != null) {
                interfaceC701660Rfg.Ka(str);
                interfaceC701660Rfg.l4(new C700310RdV(c701480RfO, str));
                interfaceC701660Rfg.Bl(new AwS160S1100000_11(c701480RfO, str, 7));
                interfaceC701660Rfg.il();
                interfaceC701660Rfg.ga(c701480RfO.LIZJ.OS(c701480RfO.LJI.LIZIZ(str), str));
                interfaceC701660Rfg.F0();
                interfaceC701660Rfg.Jk(fcpUiTemplate);
                c701480RfO.LIZLLL.LJLI();
                new AwS546S0100000_2(fcpStandardTemplateAssem, (ReusedAssem<? extends C03H5>) 1005);
                C0T6L.LIZLLL();
                ReusedUIAssem<? extends C03H5> reusedUIAssem = c701480RfO.LIZIZ;
                C723830SaL.LIZ(reusedUIAssem, null, new AwS51S1300000_11((ReusedUIAssem) reusedUIAssem, (ReusedUIAssem<? extends C03H5>) fcpStandardTemplateAssem, (ReusedAssem<? extends C03H5>) c701480RfO, (C701480RfO) str, (String) 1));
            }
        } else {
            c701480RfO.LJI(str, reusedAssemLJFF, true, fcpUiTemplate);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS127S1200000_11 awS127S1200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pruneExpiredTasks drop aid=");
        sbLIZ.append(((C703900RjI) awS127S1200000_11.l1).LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(awS127S1200000_11.s0);
        sbLIZ.append(" dedupeKey=");
        sbLIZ.append(((C703910RjJ) awS127S1200000_11.l2).LIZJ);
        sbLIZ.append(" taskGeneration=");
        sbLIZ.append(((C703910RjJ) awS127S1200000_11.l2).LIZ);
        sbLIZ.append(" ageMs=");
        sbLIZ.append(System.currentTimeMillis() - ((C703910RjJ) awS127S1200000_11.l2).LIZIZ);
        sbLIZ.append(" pendingTotal=");
        sbLIZ.append(((C703900RjI) awS127S1200000_11.l1).LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS127S1200000_11 awS127S1200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executePendingTasks start aid=");
        sbLIZ.append(((C703900RjI) awS127S1200000_11.l1).LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(awS127S1200000_11.s0);
        sbLIZ.append(" generation=");
        sbLIZ.append(((C703900RjI) awS127S1200000_11.l1).LIZJ);
        sbLIZ.append(" taskCount=");
        sbLIZ.append(((ArrayDeque) awS127S1200000_11.l2).size());
        sbLIZ.append(" pendingTotal=");
        sbLIZ.append(((C703900RjI) awS127S1200000_11.l1).LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS127S1200000_11(C259800zU c259800zU, C259800zU<C0P0T> c259800zU2, C0SUA c0sua, String str) {
        super(0);
        this.$t = str;
        this.l1 = c259800zU;
        this.l2 = c259800zU2;
        this.s0 = c0sua;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S1200000_11(C701480RfO c701480RfO, String str, FcpUiTemplate fcpUiTemplate, int i) {
        super(0);
        this.$t = i;
        this.l1 = c701480RfO;
        this.s0 = str;
        this.l2 = fcpUiTemplate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S1200000_11(C703900RjI c703900RjI, String str, C703910RjJ c703910RjJ, int i) {
        super(0);
        this.$t = i;
        this.l1 = c703900RjI;
        this.s0 = str;
        this.l2 = c703910RjJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS127S1200000_11(C703900RjI c703900RjI, C703900RjI c703900RjI2, String str, ArrayDeque<C703910RjJ> arrayDeque) {
        super(0);
        this.$t = arrayDeque;
        this.l1 = c703900RjI;
        this.s0 = c703900RjI2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S1200000_11(EnumC705650Rm7 enumC705650Rm7, String str, AnchorCommonStruct anchorCommonStruct, int i) {
        super(0);
        this.$t = i;
        this.l1 = enumC705650Rm7;
        this.s0 = str;
        this.l2 = anchorCommonStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS127S1200000_11(Fragment fragment, Fragment fragment2, Class<Object> cls, String str) {
        super(0);
        this.$t = str;
        this.l1 = fragment;
        this.l2 = fragment2;
        this.s0 = cls;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS127S1200000_11(AssemViewModel assemViewModel, AssemViewModel<Object> assemViewModel2, Class<Object> cls, String str) {
        super(0);
        this.$t = str;
        this.l1 = assemViewModel;
        this.l2 = assemViewModel2;
        this.s0 = cls;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S1200000_11(StoryViewerListViewModel storyViewerListViewModel, String str, C730120SkU c730120SkU, int i) {
        super(0);
        this.$t = i;
        this.l1 = storyViewerListViewModel;
        this.s0 = str;
        this.l2 = c730120SkU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S1200000_11(String str, C698680Ras c698680Ras, C701360RfC c701360RfC, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c698680Ras;
        this.l2 = c701360RfC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS127S1200000_11(String str, String str2, C700970ReZ c700970ReZ, Map<String, Integer> map) {
        super(0);
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c700970ReZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S1200000_11(String str, Aweme aweme, VideoShareViewModel videoShareViewModel, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = aweme;
        this.l2 = videoShareViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS127S1200000_11(CopyOnWriteArrayList copyOnWriteArrayList, CopyOnWriteArrayList<Aweme> copyOnWriteArrayList2, String str, Integer num) {
        super(0);
        this.$t = num;
        this.l1 = copyOnWriteArrayList;
        this.s0 = copyOnWriteArrayList2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S1200000_11(AtomicInteger atomicInteger, PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = atomicInteger;
        this.l2 = paidContentVideoHotSwapServiceImpl;
        this.s0 = str;
    }
}
