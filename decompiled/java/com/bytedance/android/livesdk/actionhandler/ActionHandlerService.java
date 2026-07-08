package com.bytedance.android.livesdk.actionhandler;

import X.AbstractC1117190fB7;
import X.AbstractC1117310fBJ;
import X.AbstractC2436909gl;
import X.AbstractC2437009gm;
import X.C1117340fBM;
import X.C1161920gLG;
import X.C11S5;
import X.C1701940uOG;
import X.C20409114tV;
import X.C2436109gd;
import X.C2437109gn;
import X.C480460Ism;
import X.C490120JJy;
import X.C496640Jdm;
import X.C516901zr;
import X.InterfaceC1117210fB9;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.actionhandler.schema.handler.BroadcastSchemaHandler;
import com.bytedance.android.livesdk.actionhandler.schema.handler.LiveAiSummaryDescriptionDialogHandler;
import com.bytedance.android.livesdk.actionhandler.schema.handler.LiveOpenExtendedScreenHandler;
import com.bytedance.android.livesdk.actionhandler.schema.handler.LiveRankingListDialogSchemaHandler;
import com.bytedance.android.livesdk.actionhandler.schema.handler.LiveRankingStickerDialogSchemaHandler;
import com.bytedance.android.livesdk.actionhandler.schema.handler.SuperFanPaymentDialogSchemaHandler;
import com.bytedance.android.livesdk.actionhandler.schema.handler.SuperFanTreasureBoxSchemaHandler;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;
import com.bytedance.android.livesdk.api.revenue.guardian.IGuardianService;
import com.bytedance.android.livesdk.api.revenue.strategy.channel.IncentiveSendGiftChannel;
import com.bytedance.android.livesdk.api.revenue.strategy.channel.UgTaskSendGiftEvent;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.dataChannel.LiveClickWaveMessageChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewLiveSettingEvent;
import com.bytedance.android.livesdk.dataChannel.StarCommentPurchasePageEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal;
import com.bytedance.android.livesdk.goal.model.CommitV2RequestParams;
import com.bytedance.android.livesdk.goal.model.PinRequestParams;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMusicSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubJoinDialogStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenClickWaveSchemaSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableParsePushSlimRoomSettingV2;
import com.bytedance.android.livesdk.livesetting.watchlive.InnerPushStreamUrlExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdk.livesetting.watchlive.PushStreamUrlConfig;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.business.IAdLiveHelperService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.android.livesdkapi.host.IHostOffline;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.deeplink.DeepLinkData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS2S1200200_17;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes18.dex */
public class ActionHandlerService implements IActionHandlerService {
    public C496640Jdm LL;
    public final C2437109gn LLILLJJLI = new C2437109gn();
    public volatile boolean LLILLL = false;

    public final synchronized void LIZIZ() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        LIZJ();
        LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0IXc] */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0JBM] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0fD9] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Ub5] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0IXg] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09gm, X.0fBA] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZJ() {
        final ?? r0 = new InterfaceC1117210fB9() { // from class: X.0IXc
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(18));
            public final HashSet<Long> LIZIZ = C093Y.LIZJ(Long.valueOf(EnumC467200ITu.Subscription.getScene()), Long.valueOf(EnumC467200ITu.TaxInfoCollection.getScene()));
            public final C01GW LIZJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(17));

            public static void LIZJ(int i) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_outer_push_enter");
                c474500IjALIZ.LJJII(Integer.valueOf(i), "push_with_stream_enter_failure");
                c474500IjALIZ.LIZ();
            }

            @Override // X.InterfaceC1117210fB9
            public final boolean canHandle(Uri uri) {
                String host;
                String host2;
                String path;
                String path2 = null;
                if (uri != null) {
                    host = uri.getHost();
                } else {
                    host = null;
                }
                if (!TextUtils.equals("live", host)) {
                    if (uri != null) {
                        host2 = uri.getHost();
                    } else {
                        host2 = null;
                    }
                    if (TextUtils.equals("webcast_room", host2)) {
                        if (uri != null) {
                            path = uri.getPath();
                        } else {
                            path = null;
                        }
                        if (!TextUtils.equals("/", path)) {
                            if (uri != null) {
                                path2 = uri.getPath();
                            }
                            if (!TextUtils.equals("", path2)) {
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                }
                return true;
            }

            @Override // X.InterfaceC1117210fB9
            public final boolean handle(Context context, Uri uri) {
                Long lLJIILIIL;
                String strLJLLLLLL;
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                C0IVR.LJII(enterRoomConfig, uri, ((Boolean) this.LIZJ.getValue()).booleanValue());
                C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
                C468070IXd c468070IXdLIZ = C0IFC.LIZ();
                long j = enterRoomConfig.mRoomsData.roomId;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ec_template_id");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                } else {
                    lLJIILIIL = null;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "commerce_inner_source");
                c468070IXdLIZ.LIZ = null;
                c468070IXdLIZ.LJII = 0;
                c468070IXdLIZ.LJ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                c468070IXdLIZ.LJFF = lLJIILIIL;
                c468070IXdLIZ.LIZJ = true;
                c468070IXdLIZ.LIZIZ = Long.valueOf(j);
                c468070IXdLIZ.LJI = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                c468070IXdLIZ.LIZLLL = true;
                if (TextUtils.equals("webcast_room", uri.getHost()) && TextUtils.equals("webapp", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from"))) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_question_scan");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "live_room_mode");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null) {
                        strLJLLLLLL = C500260Jjc.LJLLLLLL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                    } else {
                        strLJLLLLLL = "null";
                    }
                    c474500IjALIZ.LJJII(strLJLLLLLL, "live_type");
                    c474500IjALIZ.LIZ();
                }
                return LIZIZ(context, uri, enterRoomConfig);
            }

            @Override // X.InterfaceC1117210fB9
            public final boolean LIZ(Context context, Uri uri, Map<String, String> map) {
                Long lLJIILIIL;
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                C0IVR.LJII(enterRoomConfig, uri, ((Boolean) this.LIZJ.getValue()).booleanValue());
                C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
                C468070IXd c468070IXdLIZ = C0IFC.LIZ();
                long j = enterRoomConfig.mRoomsData.roomId;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ec_template_id");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id");
                Boolean boolValueOf = null;
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                } else {
                    lLJIILIIL = null;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "commerce_inner_source");
                c468070IXdLIZ.LIZ = null;
                c468070IXdLIZ.LJII = 0;
                c468070IXdLIZ.LJ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                c468070IXdLIZ.LJFF = lLJIILIIL;
                c468070IXdLIZ.LIZJ = true;
                c468070IXdLIZ.LIZIZ = Long.valueOf(j);
                c468070IXdLIZ.LJI = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                c468070IXdLIZ.LIZLLL = true;
                String str = map.get("from_notification");
                if (str != null) {
                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(str));
                }
                if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge") == null && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    enterRoomConfig.mRoomsData.enterFromMerge = "push";
                }
                if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method") == null && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    enterRoomConfig.mRoomsData.enterMethod = "push";
                }
                if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "open_url_link") != null) {
                    enterRoomConfig.mRoomsData.openUrlLink = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "open_url_link");
                }
                enterRoomConfig.mLogData.openFromSchema = map.get("open_from_schema");
                return LIZIZ(context, uri, enterRoomConfig);
            }

            public final boolean LIZIZ(Context context, Uri uri, EnterRoomConfig enterRoomConfig) {
                long jLongValue;
                Long lValueOf;
                Long lLJIILIIL;
                String str;
                EnterRoomConfig.RoomsData roomsData;
                long jLongValue2;
                String string;
                int i;
                boolean z;
                C0IXW c0ixw = C0IXW.LIZ;
                ((IAdLiveHelperService) C1161920gLG.LIZJ(IAdLiveHelperService.class)).Gw2(uri, enterRoomConfig);
                HashMap map = new HashMap();
                map.put("schema_uri", uri.toString());
                C1CC2.LJII(0, "ttlive_push_event_schema", map);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "slim_room_v1");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                if (Intrinsics.LJFF(enterRoomConfig.mRoomsData.enterFromMerge, "push")) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_outer_push_enter");
                    c474500IjALIZ.LJJII(Boolean.valueOf(C500260Jjc.LJJIIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)), "push_has_stream_url");
                    c474500IjALIZ.LIZ();
                }
                if (EnableParsePushSlimRoomSettingV2.INSTANCE.enable() && !TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    try {
                        byte[] bArrDecode = Base64.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, 0);
                        Inflater inflater = new Inflater();
                        inflater.setInput(bArrDecode);
                        byte[] bArr = new byte[1024];
                        StringBuilder sb = new StringBuilder();
                        while (!inflater.finished()) {
                            sb.append(new String(bArr, 0, inflater.inflate(bArr), Charsets.UTF_8));
                        }
                        inflater.end();
                        string = sb.toString();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        LIZJ(1);
                        string = "";
                    }
                    int length = string.length() - 1;
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 <= length) {
                        if (!z2) {
                            i = i2;
                        } else {
                            i = length;
                        }
                        if (string.charAt(i) == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2) {
                            if (!z) {
                                z2 = true;
                            } else {
                                i2++;
                            }
                        } else {
                            if (!z) {
                                break;
                            }
                            length--;
                        }
                    }
                    try {
                        SlimRoom slimRoom = (SlimRoom) C2348809Ig.LJII(SlimRoom.class, string.subSequence(i2, length + 1).toString());
                        C0IVR.LIZ(slimRoom, enterRoomConfig);
                        if (slimRoom.multiStreamScene == 1 && LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup() && slimRoom.getExtraStreamData() != null && slimRoom.getExtraStreamDefaultQualitySdkKey() != null) {
                            C0IVR.LIZIZ(slimRoom, enterRoomConfig);
                        }
                        LIZJ(0);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        if (C20441214yg.LIZJ()) {
                            C20441214yg.LIZIZ("RoomActionHandler2", "parseObject error");
                        }
                        LIZJ(2);
                    }
                }
                for (InterfaceC468080IXe interfaceC468080IXe : (List) this.LIZ.getValue()) {
                    if (interfaceC468080IXe.LIZ(uri)) {
                        return interfaceC468080IXe.LIZIZ(context, uri, enterRoomConfig);
                    }
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id");
                InterfaceC464000IHm livePreloadService = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getLivePreloadService();
                if (TextUtils.equals("push", enterRoomConfig.mRoomsData.enterFromMerge)) {
                    C468150IXl c468150IXl = (C468150IXl) livePreloadService;
                    Map<String, Room> map2 = c468150IXl.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                    sbLIZ.append('-');
                    sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    Room roomRemove = map2.remove(C2188811AlT.LIZIZ(sbLIZ));
                    ConcurrentHashMap<String, Long> concurrentHashMap = c468150IXl.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                    sbLIZ2.append('-');
                    sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    Long lRemove = concurrentHashMap.remove(C2188811AlT.LIZIZ(sbLIZ2));
                    if (lRemove != null) {
                        jLongValue2 = lRemove.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    String strLIZIZ = c468150IXl.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    if (roomRemove != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("with stream data, server request, roomId: ");
                        sbLIZ3.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                        C20441214yg.LJIIIZ("RoomActionHandler2", C2188811AlT.LIZIZ(sbLIZ3));
                        if (System.currentTimeMillis() - jLongValue2 < PushStreamUrlConfig.INSTANCE.getExpireTime() * LSPassThroughRecordSizeConfig.DEFAULT) {
                            C0IVR.LIZLLL(roomRemove, enterRoomConfig);
                            enterRoomConfig.mLogData.pushStreamUrlStatus = strLIZIZ;
                        } else {
                            enterRoomConfig.mLogData.pushStreamUrlStatus = "expire";
                        }
                    } else {
                        enterRoomConfig.mLogData.pushStreamUrlStatus = strLIZIZ;
                    }
                }
                if (TextUtils.equals("inner_push", enterRoomConfig.mRoomsData.enterFromMerge) && InnerPushStreamUrlExp.INSTANCE.getValue()) {
                    C468150IXl c468150IXl2 = (C468150IXl) livePreloadService;
                    String strLIZIZ2 = c468150IXl2.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    Map<String, Room> map3 = c468150IXl2.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                    sbLIZ4.append('-');
                    sbLIZ4.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    Room roomRemove2 = map3.remove(C2188811AlT.LIZIZ(sbLIZ4));
                    if (roomRemove2 != null) {
                        C0IVR.LIZLLL(roomRemove2, enterRoomConfig);
                    }
                    enterRoomConfig.mLogData.pushStreamUrlStatus = strLIZIZ2;
                }
                enterRoomConfig.mRoomsData.openUrlLink = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "open_url_link");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "first_show_rank_type");
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4) && (roomsData = enterRoomConfig.mRoomsData) != null) {
                    roomsData.firstShowRankType = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "business_extra");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null) {
                    JSONObject jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
                    String strOptString = jSONObject.optString("back_router_schema");
                    if ((!TextUtils.isEmpty(strOptString)) && strOptString != null) {
                        enterRoomConfig.mRoomsData.setBackRouterSchema(strOptString);
                    }
                    if (Intrinsics.LJFF(jSONObject.optString("business_from"), "ecommerce")) {
                        C474500IjA c474500IjALIZJ = C0IJT.LIZJ("tiktokec_deeplink_enter_page");
                        if (((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).hitTopTabExpExperiment()) {
                            str = "homepage_mall";
                        } else {
                            str = "mall";
                        }
                        c474500IjALIZJ.LJJII(str, "enter_from_merge");
                        c474500IjALIZJ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ec_track_params");
                        if (jSONObjectOptJSONObject != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                c474500IjALIZJ.LJJII(jSONObjectOptJSONObject.get(next), next);
                            }
                        }
                        c474500IjALIZJ.LIZ();
                    }
                }
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                String str2 = roomsData2.enterFromMerge;
                String str3 = roomsData2.enterMethod;
                LiveFeedDraw.Companion.getClass();
                if (!Intrinsics.LJFF(C0ISY.LIZLLL(str2, str3).enable, "1")) {
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_schema_enter_room");
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(str2);
                    sbLIZ5.append('-');
                    sbLIZ5.append(str3);
                    c474500IjALIZ2.LJJII(C2188811AlT.LIZIZ(sbLIZ5), "single_room_entrance");
                    c474500IjALIZ2.LJJII(uri.toString(), "single_room_origin_uri");
                    c474500IjALIZ2.LIZ();
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "unique_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = "";
                }
                String strLJJLIL = a0.LJJLIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6, e3.g, "");
                String str4 = enterRoomConfig.mRoomsData.userId;
                if (str4 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str4)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = -1;
                }
                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                if (roomsData3.roomId <= 0) {
                    HashSet<Long> hashSet = this.LIZIZ;
                    DeepLinkData deepLinkData = roomsData3.deepLinkData;
                    if (deepLinkData != null) {
                        lValueOf = Long.valueOf(deepLinkData.bizType);
                    } else {
                        lValueOf = null;
                    }
                    if (C13LP.LJJJJ(lValueOf, hashSet) && !UserService.getInstance().user().isLogin()) {
                        ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLiveFromSchemaNoLogin(context, enterRoomConfig, strLJJLIL);
                        return true;
                    }
                    if (!TextUtils.isEmpty(strLJJLIL)) {
                        ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLive(context, enterRoomConfig, strLJJLIL);
                        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_schema_enter_room");
                        c474500IjALIZ3.LJJII("uniqueId", "enter_style");
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append(str2);
                        sbLIZ6.append('-');
                        sbLIZ6.append(str3);
                        c474500IjALIZ3.LJJII(C2188811AlT.LIZIZ(sbLIZ6), "enterance");
                        c474500IjALIZ3.LIZ();
                        return true;
                    }
                    if (jLongValue > 0) {
                        ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLive(context, enterRoomConfig, jLongValue);
                        C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_schema_enter_room");
                        c474500IjALIZ4.LJJII("userId", "enter_style");
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append(str2);
                        sbLIZ7.append('-');
                        sbLIZ7.append(str3);
                        c474500IjALIZ4.LJJII(C2188811AlT.LIZIZ(sbLIZ7), "enterance");
                        c474500IjALIZ4.LIZ();
                        return true;
                    }
                }
                if (enterRoomConfig.mRoomsData.roomId > 0) {
                    C474500IjA c474500IjALIZ5 = C0IJT.LIZ("livesdk_schema_enter_room");
                    c474500IjALIZ5.LJJII("roomId", "enter_style");
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append(str2);
                    sbLIZ8.append('-');
                    sbLIZ8.append(str3);
                    c474500IjALIZ5.LJJII(C2188811AlT.LIZIZ(sbLIZ8), "enterance");
                    c474500IjALIZ5.LIZ();
                    return ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLiveFromSchema(context, enterRoomConfig);
                }
                if (C500260Jjc.LJJIIZ(enterRoomConfig.mLogData.openFromSchema)) {
                    C474500IjA c474500IjALIZ6 = C0IJT.LIZ("livesdk_schema_enter_room");
                    c474500IjALIZ6.LJJII("without_valid_param", "failed_reason");
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append(str2);
                    sbLIZ9.append('-');
                    sbLIZ9.append(str3);
                    sbLIZ9.append('-');
                    sbLIZ9.append(uri);
                    c474500IjALIZ6.LJJII(C2188811AlT.LIZIZ(sbLIZ9), "failed_entrance");
                    if (Intrinsics.LJFF(str2, "push")) {
                        c474500IjALIZ6.LJJII("push_without_valid_param", "push_process_status");
                    }
                    c474500IjALIZ6.LIZ();
                    return false;
                }
                return false;
            }
        };
        this.LLILLJJLI.LIZIZ(new AbstractC1117190fB7(r0) { // from class: X.0fB8
            public final List<String> LIZJ = C1697810uHb.LJIIJJI("live", "webcast_room");

            @Override // X.AbstractC1117190fB7
            public final List<String> LIZLLL() {
                return this.LIZJ;
            }
        });
        final C496640Jdm c496640Jdm = new C496640Jdm();
        this.LL = c496640Jdm;
        this.LLILLJJLI.LIZIZ(new AbstractC1117190fB7(c496640Jdm) { // from class: X.0fBD
            public final List<String> LIZJ = Collections.singletonList("webcast_profile");

            @Override // X.AbstractC1117190fB7
            public final List<String> LIZLLL() {
                return this.LIZJ;
            }
        });
        final ?? r02 = new InterfaceC1117210fB9() { // from class: X.0fD9
            @Override // X.InterfaceC1117210fB9
            public final boolean canHandle(Uri uri) {
                String host;
                String host2 = null;
                if (uri != null) {
                    host = uri.getHost();
                } else {
                    host = null;
                }
                if (!TextUtils.equals("webcast_gift_dialog", host)) {
                    if (uri != null) {
                        host2 = uri.getHost();
                    }
                    if (!TextUtils.equals("webcast_inroom_giftpanel", host2)) {
                        return false;
                    }
                    return true;
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[PHI: r1
              0x001d: PHI (r1v3 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:11:0x001b, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1117210fB9
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean handle(android.content.Context r7, android.net.Uri r8) {
                /*
                    r6 = this;
                    if (r8 == 0) goto L44
                    java.lang.String r0 = "gift_id"
                    java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r8, r0)
                    if (r0 == 0) goto L44
                    long r3 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
                Le:
                    java.lang.String r5 = ""
                    if (r8 == 0) goto L1a
                    java.lang.String r0 = "gift_enter_from"
                    java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r8, r0)
                    if (r1 != 0) goto L1d
                L1a:
                    r1 = r5
                    if (r8 == 0) goto L26
                L1d:
                    java.lang.String r0 = "panel_type"
                    java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r8, r0)
                    if (r0 == 0) goto L26
                    r5 = r0
                L26:
                    X.0fGg r2 = new X.0fGg
                    r2.<init>()
                    r2.LIZIZ = r3
                    X.0fGc r0 = X.C1120570fGZ.LIZ(r5)
                    r2.LIZ = r0
                    r2.LIZJ = r1
                    r1 = 1
                    r2.LJI = r1
                    java.lang.Class<com.bytedance.android.live.gift.IGiftService> r0 = com.bytedance.android.live.gift.IGiftService.class
                    X.006A r0 = X.C1161920gLG.LIZJ(r0)
                    com.bytedance.android.live.gift.IGiftService r0 = (com.bytedance.android.live.gift.IGiftService) r0
                    r0.openGiftDialogFromJSB(r2)
                    return r1
                L44:
                    r3 = 0
                    goto Le
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1118450fD9.handle(android.content.Context, android.net.Uri):boolean");
            }

            @Override // X.InterfaceC1117210fB9
            public final boolean LIZ(Context context, Uri uri, Map<String, String> map) {
                handle(context, uri);
                return true;
            }
        };
        this.LLILLJJLI.LIZIZ(new AbstractC1117190fB7(r02) { // from class: X.0fB6
            public final List<String> LIZJ = C1697810uHb.LJIIJJI("webcast_gift_dialog", "webcast_inroom_giftpanel");

            @Override // X.AbstractC1117190fB7
            public final List<String> LIZLLL() {
                return this.LIZJ;
            }
        });
        final ?? r2 = new AbstractC1117190fB7(new InterfaceC1117210fB9() { // from class: X.0Ub5
            @Override // X.InterfaceC1117210fB9
            public final boolean canHandle(Uri uri) {
                String host;
                if (uri != null) {
                    host = uri.getHost();
                } else {
                    host = null;
                }
                return TextUtils.equals("one_tap_go_live", host);
            }

            @Override // X.InterfaceC1117210fB9
            public final boolean handle(Context context, Uri uri) {
                return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).oneTapGoLive(context, uri);
            }

            @Override // X.InterfaceC1117210fB9
            public final boolean LIZ(Context context, Uri uri, Map<String, String> map) {
                return handle(context, uri);
            }
        }) { // from class: X.0fBA
            public final List<String> LIZJ = Collections.singletonList("one_tap_go_live");

            @Override // X.AbstractC1117190fB7
            public final List<String> LIZLLL() {
                return this.LIZJ;
            }
        };
        this.LLILLJJLI.LIZIZ(r2);
        final ?? r03 = new InterfaceC1117210fB9() { // from class: X.0IXg
            @Override // X.InterfaceC1117210fB9
            public final boolean canHandle(Uri uri) {
                return TextUtils.equals("live_square", uri.getHost());
            }

            @Override // X.InterfaceC1117210fB9
            public final boolean handle(Context context, Uri uri) {
                final HashMap map = new HashMap();
                map.put("intercept", "new_style");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_square_source");
                if (C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    map.put("live.intent.extra.FROM_NEW_STYLE_SOURCE", "referral_task");
                } else {
                    map.put("live.intent.extra.FROM_NEW_STYLE_SOURCE", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
                map.put("enter_from_merge", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge"));
                map.put("enter_method", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method"));
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                C0IVR.LJIIJJI(uri, enterRoomConfig);
                C0IVR.LJIIJ(enterRoomConfig, map);
                EnterRoomLinkSession.LJ(enterRoomConfig).LIZIZ(new Event("live_square_handler", 4608, C0IIR.BussinessApiCall));
                IHostUser iHostUser = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                iHostUser.jumpLiveSquareWithLogin(context, roomsData.enterFromMerge, roomsData.enterMethod, new InterfaceC20311214di() { // from class: X.0IXi
                    @Override // X.InterfaceC20311214di
                    public final void LIZ() {
                        Map<String, String> map2 = map;
                        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                        if (iInteractService != null) {
                            iInteractService.LJIILIIL();
                        }
                        if (C1161920gLG.LIZJ(ILiveFeedApiService.class) != null) {
                            ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).U91().LIZ(map2);
                        }
                    }
                });
                return true;
            }

            @Override // X.InterfaceC1117210fB9
            public final boolean LIZ(Context context, Uri uri, Map<String, String> map) {
                handle(context, uri);
                return true;
            }
        };
        this.LLILLJJLI.LIZIZ(new AbstractC1117190fB7(r03) { // from class: X.0fBC
            public final List<String> LIZJ = Collections.singletonList("live_square");

            @Override // X.AbstractC1117190fB7
            public final List<String> LIZLLL() {
                return this.LIZJ;
            }
        });
        final ?? r04 = new InterfaceC1117210fB9() { // from class: X.0JBM
            @Override // X.InterfaceC1117210fB9
            public final boolean canHandle(Uri uri) {
                return TextUtils.equals("sign", uri.getHost());
            }

            @Override // X.InterfaceC1117210fB9
            public final boolean handle(Context context, Uri uri) {
                new Intent().putExtra("url", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url"));
                return true;
            }

            @Override // X.InterfaceC1117210fB9
            public final boolean LIZ(Context context, Uri uri, Map<String, String> map) {
                handle(context, uri);
                return true;
            }
        };
        this.LLILLJJLI.LIZIZ(new AbstractC1117190fB7(r04) { // from class: X.0fBB
            public final List<String> LIZJ = Collections.singletonList("sign");

            @Override // X.AbstractC1117190fB7
            public final List<String> LIZLLL() {
                return this.LIZJ;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0UNh
            public final List<String> LIZIZ = Collections.singletonList("webcast_rank_setting");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                IHostAction iHostAction;
                FragmentManager topFragmentManager;
                if (C500260Jjc.LJJIJLIJ()) {
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    dataChannelGlobal.JQ2(C1148180fz6.class, "pop_window");
                    dataChannelGlobal.GQ2(PreviewLiveSettingEvent.class);
                    return true;
                }
                DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
                Room room = (Room) dataChannelGlobal2.gg0(C930940aKi.class);
                if (room == null || UserService.getInstance().user().getCurrentUserId() != room.getOwnerUserId() || (iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class)) == null || (topFragmentManager = iHostAction.getTopFragmentManager()) == null) {
                    return false;
                }
                dataChannelGlobal2.JQ2(C1148180fz6.class, "pop_window");
                LiveAdminSettingDialog liveAdminSettingDialogXu2 = ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).xu2(true);
                if (liveAdminSettingDialogXu2 != null) {
                    liveAdminSettingDialogXu2.show(topFragmentManager, "LiveAdminSettingDialog");
                }
                return true;
            }
        });
        this.LLILLJJLI.LIZIZ(C490120JJy.LIZIZ);
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0JJF
            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return Collections.singletonList("webcast_pcs");
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).w2().LIZLLL();
                InterfaceC490020JJo interfaceC490020JJoLIZIZ = C0JJD.LIZIZ(uri);
                if (interfaceC490020JJoLIZIZ == null) {
                    return false;
                }
                return interfaceC490020JJoLIZIZ.nd(context, c2436109gd, map);
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0JOJ
            public final List<String> LIZIZ = Collections.singletonList("webcast_user_level_setting_panel");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if (room == null || UserService.getInstance().user().getCurrentUserId() != room.getOwnerUserId()) {
                    Uri uri = c2436109gd.LIZ;
                    if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "entrance")) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > 0) {
                        dataChannelGlobal.JQ2(C1148200fz8.class, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    }
                    C784440Upu.LIZ().LIZIZ(new C0JOK());
                    FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context, true);
                    if (fragmentManagerLJIL != null) {
                        ((IShareService) C1161920gLG.LIZJ(IShareService.class)).hy1(fragmentManagerLJIL);
                        return true;
                    }
                }
                return false;
            }
        });
        this.LLILLJJLI.LIZIZ(new LiveAiSummaryDescriptionDialogHandler());
        this.LLILLJJLI.LIZIZ(new AbstractC2437009gm<C2436109gd>() { // from class: X.09gj
            @Override // X.AbstractC2437009gm
            public final List<String> LIZIZ() {
                return Collections.singletonList("live_ai_analysis");
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZ(Uri uri) {
                if (Intrinsics.LJFF(uri.getHost(), "live_ai_analysis") && Intrinsics.LJFF(uri.getPath(), "/allow_ai_analysis")) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                C766270U4b.LIZLLL(2131853352);
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C317801Lc(null), 2);
                return true;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC1117310fBJ(r2) { // from class: X.0fBN
            public int LJIIL;
            public final List<String> LJFF = Collections.singletonList(EnumC921560a5a.PLAYBOOK_MANAGE_SCHEMA.getStr());
            public int LJI = 1;
            public int LJII = 1;
            public boolean LJIIIIZZ = true;
            public String LJIIIZ = "";
            public String LJIIJ = "";
            public String LJIIJJI = "";
            public String LJIILIIL = "";
            public String LJIILJJIL = "";

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LJFF;
            }

            @Override // X.AbstractC1117310fBJ
            public final boolean LJII(C2436109gd c2436109gd) {
                EnumC20429314wl enumC20429314wl;
                DataChannel dataChannel;
                LJIIJJI(c2436109gd);
                if (this.LJI == 1) {
                    enumC20429314wl = EnumC20429314wl.INTERACT;
                } else {
                    enumC20429314wl = EnumC20429314wl.MULTI_GUEST;
                }
                IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                WeakReference<DataChannel> weakReference = AbstractC1117310fBJ.LJ;
                if (weakReference != null) {
                    dataChannel = weakReference.get();
                } else {
                    dataChannel = null;
                }
                C0UTJ c0utjPl1 = iInteractService.Pl1(dataChannel);
                if (c0utjPl1 != null) {
                    c0utjPl1.LJJI(true, this.LJIIJ, new C915190ZvJ(this.LJIIIZ, this.LJIIIIZZ, 4), enumC20429314wl, Integer.valueOf(this.LJII));
                }
                return true;
            }

            @Override // X.AbstractC1117310fBJ
            public final boolean LJIIIZ(C2436109gd c2436109gd) {
                EnumC20429314wl enumC20429314wl;
                LJIIJJI(c2436109gd);
                if (this.LJI == 1) {
                    enumC20429314wl = EnumC20429314wl.INTERACT;
                } else {
                    enumC20429314wl = EnumC20429314wl.MULTI_GUEST;
                }
                C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(null);
                if (c0utjPl1 != null) {
                    c0utjPl1.LJJI(true, this.LJIIJ, new C915190ZvJ(this.LJIIIZ, this.LJIIIIZZ, 4), enumC20429314wl, Integer.valueOf(this.LJII));
                }
                return true;
            }

            public final void LJIIJJI(C2436109gd c2436109gd) {
                int iIntValue;
                int iIntValue2;
                String strLIZ;
                String strLIZ2;
                String strLIZ3;
                String strLIZ4;
                int iIntValue3;
                String strLIZ5;
                Integer numLJJLIIJ;
                String strLIZ6;
                String strLIZ7;
                String strLIZ8;
                Integer numLJJLIIJ2;
                String strLIZ9;
                Integer numLJJLIIJ3;
                Uri uri = c2436109gd.LIZ;
                boolean zLJFF = true;
                if (uri != null && (strLIZ9 = C1946707jt.LIZ(uri, "playbook_manage_panel_type")) != null && (numLJJLIIJ3 = C500260Jjc.LJJLIIJ(strLIZ9)) != null) {
                    iIntValue = numLJJLIIJ3.intValue();
                } else {
                    iIntValue = 1;
                }
                this.LJI = iIntValue;
                Uri uri2 = c2436109gd.LIZ;
                if (uri2 != null && (strLIZ8 = C1946707jt.LIZ(uri2, "playbook_manage_first_level_tag_type")) != null && (numLJJLIIJ2 = C500260Jjc.LJJLIIJ(strLIZ8)) != null) {
                    iIntValue2 = numLJJLIIJ2.intValue();
                } else {
                    iIntValue2 = 1;
                }
                this.LJII = iIntValue2;
                Uri uri3 = c2436109gd.LIZ;
                if (uri3 == null || (strLIZ = C1946707jt.LIZ(uri3, "panel_entrance")) == null) {
                    strLIZ = "activity";
                }
                this.LJIIJ = strLIZ;
                Uri uri4 = c2436109gd.LIZ;
                if (uri4 == null || (strLIZ2 = C1946707jt.LIZ(uri4, "from")) == null) {
                    strLIZ2 = "schema";
                }
                this.LJIIIZ = strLIZ2;
                Uri uri5 = c2436109gd.LIZ;
                if (uri5 != null && (strLIZ7 = C1946707jt.LIZ(uri5, "is_activity")) != null) {
                    zLJFF = Intrinsics.LJFF(strLIZ7, "1");
                }
                this.LJIIIIZZ = zLJFF;
                Uri uri6 = c2436109gd.LIZ;
                String str = "";
                if (uri6 == null || (strLIZ3 = C1946707jt.LIZ(uri6, "live_title")) == null) {
                    strLIZ3 = "";
                }
                this.LJIIJJI = strLIZ3;
                Uri uri7 = c2436109gd.LIZ;
                if (uri7 == null || (strLIZ4 = C1946707jt.LIZ(uri7, "cover_url")) == null) {
                    strLIZ4 = "";
                }
                this.LJIILIIL = strLIZ4;
                Uri uri8 = c2436109gd.LIZ;
                if (uri8 != null && (strLIZ6 = C1946707jt.LIZ(uri8, "cover_uri")) != null) {
                    str = strLIZ6;
                }
                this.LJIILJJIL = str;
                Uri uri9 = c2436109gd.LIZ;
                if (uri9 != null && (strLIZ5 = C1946707jt.LIZ(uri9, "panel_type")) != null && (numLJJLIIJ = C500260Jjc.LJJLIIJ(strLIZ5)) != null) {
                    iIntValue3 = numLJJLIIJ.intValue();
                } else {
                    iIntValue3 = 0;
                }
                this.LJIIL = iIntValue3;
            }

            @Override // X.AbstractC1117310fBJ
            public final boolean LJFF(Context context, C2436109gd c2436109gd) throws JSONException {
                String str;
                LJIIJJI(c2436109gd);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("target_open", "2");
                jSONObject.put("playbook_manage_panel_type", this.LJI);
                jSONObject.put("playbook_manage_first_level_tag_type", this.LJII);
                if (this.LJIIIIZZ) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("is_activity", str);
                jSONObject.put("panel_entrance", this.LJIIJ);
                jSONObject.put("from", this.LJIIIZ);
                jSONObject.put("panel_type", this.LJIIL);
                jSONObject.put("live_title", this.LJIIJJI);
                jSONObject.put("cover_url", this.LJIILIIL);
                jSONObject.put("cover_uri", this.LJIILJJIL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params=");
                sbLIZ.append(jSONObject);
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, C2188811AlT.LIZIZ(sbLIZ), new Bundle());
                return true;
            }

            @Override // X.AbstractC1117310fBJ
            public final void LJI(Context context, C2436109gd c2436109gd, Map map) {
                LJIIJJI(c2436109gd);
                Uri uri = c2436109gd.LIZ;
                if (uri != null) {
                    Uri uriBuild = uri.buildUpon().appendQueryParameter("title", this.LJIIJJI).build();
                    C1117220fBA c1117220fBA = this.LIZIZ;
                    C2436109gd c2436109gd2 = new C2436109gd();
                    c2436109gd2.LIZ = LJIIJ(uriBuild);
                    c1117220fBA.LIZJ(context, c2436109gd2, map);
                }
            }
        });
        this.LLILLJJLI.LIZIZ(new C20409114tV(r2));
        this.LLILLJJLI.LIZIZ(new AbstractC1117310fBJ(r2) { // from class: X.0fBL
            public final List<String> LJFF = Collections.singletonList(EnumC921560a5a.PLAYBOOK_ENTITY_SCHEMA.getStr());

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LJFF;
            }

            @Override // X.AbstractC1117310fBJ
            public final boolean LJII(C2436109gd c2436109gd) {
                Uri uri;
                DataChannel dataChannel;
                if (!AbstractC1117310fBJ.LIZLLL || C500260Jjc.LJJIJLIJ() || (uri = c2436109gd.LIZ) == null) {
                    return false;
                }
                IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                WeakReference<DataChannel> weakReference = AbstractC1117310fBJ.LJ;
                if (weakReference != null) {
                    dataChannel = weakReference.get();
                } else {
                    dataChannel = null;
                }
                C0UTJ c0utjPl1 = iInteractService.Pl1(dataChannel);
                if (c0utjPl1 != null) {
                    c0utjPl1.LJIIJJI(new AwS418S0200000_17(c0utjPl1, uri, 135));
                    return true;
                }
                return true;
            }

            @Override // X.AbstractC1117310fBJ
            public final boolean LJIIIZ(C2436109gd c2436109gd) {
                C0UTJ c0utjPl1;
                Uri uri = c2436109gd.LIZ;
                if (uri != null && (c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(null)) != null) {
                    c0utjPl1.LJJIIJZLJL(uri);
                    return false;
                }
                return false;
            }

            @Override // X.AbstractC1117310fBJ
            public final boolean LJFF(Context context, C2436109gd c2436109gd) throws JSONException {
                Uri uri = c2436109gd.LIZ;
                if (uri != null) {
                    String strLIZ = C1946707jt.LIZ(uri, "live_title");
                    String str = "";
                    if (strLIZ == null) {
                        strLIZ = "";
                    }
                    String strLIZ2 = C1946707jt.LIZ(uri, "cover_url");
                    if (strLIZ2 == null) {
                        strLIZ2 = "";
                    }
                    String strLIZ3 = C1946707jt.LIZ(uri, "cover_uri");
                    if (strLIZ3 != null) {
                        str = strLIZ3;
                    }
                    String string = uri.toString();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("target_open", "4");
                    jSONObject.put("entity_uri", string);
                    jSONObject.put("live_title", strLIZ);
                    jSONObject.put("cover_url", strLIZ2);
                    jSONObject.put("cover_uri", str);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params=");
                    sbLIZ.append(jSONObject);
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, C2188811AlT.LIZIZ(sbLIZ), new Bundle());
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC1117310fBJ
            public final void LJI(Context context, C2436109gd c2436109gd, Map map) {
                Uri uri = c2436109gd.LIZ;
                if (uri != null) {
                    C1117220fBA c1117220fBA = this.LIZIZ;
                    C2436109gd c2436109gd2 = new C2436109gd();
                    c2436109gd2.LIZ = LJIIJ(uri);
                    c1117220fBA.LIZJ(context, c2436109gd2, map);
                }
            }
        });
        this.LLILLJJLI.LIZIZ(new C1117340fBM(r2));
    }

    public final void LIZLLL() {
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0fBE
            public static final List<String> LIZJ = C1697810uHb.LJIIJJI("webcast_webview", "webcast_lynxview", "webcast_webview_popup", "webcast_lynxview_popup");
            public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(382));

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return LIZJ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                Object next;
                String strLIZIZ;
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                Iterator it2 = ((List) LIZLLL.getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((InterfaceC1944407jW) next).LIZ(context, uri, map)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next != null) {
                    return true;
                }
                ILiveSparkService iLiveSparkService = (ILiveSparkService) C1161920gLG.LIZJ(ILiveSparkService.class);
                if (iLiveSparkService != null) {
                    iLiveSparkService.UT0();
                }
                String strLIZ = C1547760qNa.LIZ(uri);
                if (strLIZ == null) {
                    return false;
                }
                try {
                    strLIZIZ = C1107580evc.LIZIZ(UriProtector.parse(strLIZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                if (strLIZIZ != null && strLIZIZ.length() != 0 && (u.LJJIIJZLJL(strLIZIZ, "https://tiktok.tiltify.com/", false) || u.LJJIIJZLJL(strLIZIZ, "https://donate.poweredbypercent.com/", false))) {
                    ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).ID1(context, strLIZ);
                    return true;
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, strLIZ, null);
                return true;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0esd
            public final List<String> LIZIZ = Collections.singletonList("webcast_ranking_setting");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                FragmentManager topFragmentManager;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                boolean z;
                int i;
                int i2;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                Unit unit;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6;
                IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                if (iHostAction == null || (topFragmentManager = iHostAction.getTopFragmentManager()) == null) {
                    return false;
                }
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Uri uri = c2436109gd.LIZ;
                if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "top_active_user_rank";
                }
                dataChannelGlobal.JQ2(C1148180fz6.class, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                try {
                    Uri uri2 = c2436109gd.LIZ;
                    if (uri2 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "use_compound_page")) != null && CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    IRankService iRankService = (IRankService) C1161920gLG.LIZJ(IRankService.class);
                    Uri uri3 = c2436109gd.LIZ;
                    if (uri3 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "select_rank_type")) != null) {
                        i = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
                    } else {
                        i = RankTypeV2.LJJIJIIJI.type;
                    }
                    Uri uri4 = c2436109gd.LIZ;
                    if (uri4 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri4, "select_sub_rank_type")) != null) {
                        i2 = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                    } else {
                        i2 = RankTypeV2.LJJIJIIJI.type;
                    }
                    Uri uri5 = c2436109gd.LIZ;
                    if (uri5 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri5, "height")) == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                    }
                    Uri uri6 = c2436109gd.LIZ;
                    if (uri6 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri6, "schema")) == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                    }
                    LiveDialogFragment liveDialogFragmentDC = iRankService.dC(i, i2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, z);
                    if (liveDialogFragmentDC != null) {
                        liveDialogFragmentDC.show(topFragmentManager, "LiveNewRankSettingDialog");
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return true;
                }
            }
        });
        this.LLILLJJLI.LIZIZ(new LiveRankingListDialogSchemaHandler());
        this.LLILLJJLI.LIZIZ(new LiveRankingStickerDialogSchemaHandler());
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0eeB
            public final List<String> LIZIZ = Collections.singletonList("webcast_gallery_opt_out_setting");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context, true);
                if (fragmentManagerLJIL != null) {
                    ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).openGiftSetting(fragmentManagerLJIL, new C1096780eeC(c2436109gd, map));
                    return true;
                }
                return false;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.09ge
            public final List<String> LIZIZ = Collections.singletonList("webcast_open_host_safety_tools");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) throws Throwable {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopActivity());
                if (c19egLIZIZ != null) {
                    Intent intentCreateBroadcastEndSafetyToolsIntent = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).createBroadcastEndSafetyToolsIntent(c19egLIZIZ, c2436109gd.LIZ);
                    if (intentCreateBroadcastEndSafetyToolsIntent != null) {
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egLIZIZ, intentCreateBroadcastEndSafetyToolsIntent, "Context_startActivity_1");
                        C1701330uNH.LIZ(intentCreateBroadcastEndSafetyToolsIntent, c19egLIZIZ);
                        C2204961BRm.LLJJJJ(c19egLIZIZ, intentCreateBroadcastEndSafetyToolsIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6imsx5yiaWkJVzBuF64C5r2VbkYao0D/OMpYHm+WSlHB9OfX33JsckjipeZUMTB+YBiLVctG1us=", null));
                        return true;
                    }
                    return true;
                }
                return false;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0ecd
            public final List<String> LIZIZ = Collections.singletonList("webcast_fans_club_guide");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6;
                ImageModel imageModel;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7;
                Uri uri = c2436109gd.LIZ;
                String str = "";
                if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                Uri uri2 = c2436109gd.LIZ;
                if (uri2 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "tab_id")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                Uri uri3 = c2436109gd.LIZ;
                if (uri3 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "show_dim")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                Uri uri4 = c2436109gd.LIZ;
                if (uri4 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri4, "dialog_type")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "1";
                }
                Uri uri5 = c2436109gd.LIZ;
                if (uri5 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri5, "from_badge_status")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = "";
                }
                Uri uri6 = c2436109gd.LIZ;
                C1126800fQc.LIZ.Wy0();
                if (C1143980fsK.LJII(context, uri6)) {
                    return true;
                }
                if (!C504670Jqj.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5)) {
                    DataChannelGlobal.LLILZ.JQ2(C1148210fz9.class, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
                }
                if ((!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "gift_banner") || !FansClubJoinDialogStyleSetting.INSTANCE.isExperimentalGroup()) && !Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, CardStruct.IStatusCode.DEFAULT)) {
                    if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "sticker") && !Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, "2")) {
                        return ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Bo1(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    }
                    Uri uri7 = c2436109gd.LIZ;
                    if (uri7 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri7, "sticker_id")) == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = "";
                    }
                    Uri uri8 = c2436109gd.LIZ;
                    if (uri8 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri8, "sticker_image")) != null) {
                        str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7;
                    }
                    if (!C504670Jqj.LIZIZ(str)) {
                        imageModel = (ImageModel) GsonProtectorUtils.fromJson(new Gson(), str, ImageModel.class);
                    } else {
                        imageModel = null;
                    }
                    return ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).z90(imageModel, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
                }
                return ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).HO(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0JfR
            public static final List<String> LIZJ = Collections.singletonList("webcast_banner_panel");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return LIZJ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                IBannerService iBannerService = (IBannerService) C1161920gLG.LIZJ(IBannerService.class);
                if (iBannerService != null) {
                    iBannerService.FG(uri);
                    return true;
                }
                return true;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0f9k
            public final List<String> LIZIZ = Collections.singletonList("webcast_star_comment_purchase_page");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                Uri uri = c2436109gd.LIZ;
                String str = "";
                if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                Uri uri2 = c2436109gd.LIZ;
                if (uri2 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "content")) != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                }
                DataChannelGlobal.LLILZ.FQ2(StarCommentPurchasePageEvent.class, new C1116330f9j(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, str, null));
                return true;
            }
        });
        this.LLILLJJLI.LIZIZ(new BroadcastSchemaHandler());
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0fB5
            public final List<String> LIZIZ = Collections.singletonList("webcast_game_detail");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) throws Throwable {
                C1884390z8X c1884390z8XV01 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).V01();
                if (c1884390z8XV01 != null) {
                    c1884390z8XV01.LIZJ(context, String.valueOf(c2436109gd.LIZ), map, null);
                    return true;
                }
                return true;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0J8W
            public final List<String> LIZIZ = Collections.singletonList("webcast_task_auto_send_gift_popup");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                Long lLJIILIIL;
                Uri uri = c2436109gd.LIZ;
                if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                Uri uri2 = c2436109gd.LIZ;
                if (uri2 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "gift_id")) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) == null) {
                    return false;
                }
                DataChannelGlobal.LLILZ.FQ2(UgTaskSendGiftEvent.class, new C1124770fNL(lLJIILIIL.longValue(), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, false));
                return true;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2437009gm<C2436109gd>() { // from class: X.0UY0
            @Override // X.AbstractC2437009gm
            public final List<String> LIZIZ() {
                return Collections.singletonList("webcast_viewers_wishes_entrance");
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZ(Uri uri) {
                return C13LP.LJJJJ(uri.getHost(), LIZIZ());
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                C500260Jjc.LJJLIIIJJIZ(new AwS413S0200000_12(context, c2436109gd, 76));
                return true;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2437009gm<C2436109gd>() { // from class: X.0UY1
            @Override // X.AbstractC2437009gm
            public final List<String> LIZIZ() {
                return Collections.singletonList("webcast_guardian_autograph");
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZ(Uri uri) {
                return C13LP.LJJJJ(uri.getHost(), LIZIZ());
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                DataChannel dataChannelProvideDataChannel;
                String strLIZIZ;
                C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(C1388190mED.LIZIZ(context));
                if (c0ip3LIZIZ != null) {
                    dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel();
                } else {
                    dataChannelProvideDataChannel = null;
                }
                Uri uri = c2436109gd.LIZ;
                if (uri == null || (strLIZIZ = C1942307jB.LIZIZ(uri, "enter_from")) == null) {
                    strLIZIZ = "";
                }
                IGuardianService iGuardianService = (IGuardianService) C1161920gLG.LIZJ(IGuardianService.class);
                if (iGuardianService != null) {
                    iGuardianService.yt0(dataChannelProvideDataChannel, strLIZIZ);
                    return true;
                }
                return true;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2437009gm<C2436109gd>() { // from class: X.0Unn
            @Override // X.AbstractC2437009gm
            public final List<String> LIZIZ() {
                return Collections.singletonList("webcast_music_gift_detail");
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZ(Uri uri) {
                if (LiveGiftMusicSetting.INSTANCE.isEnable()) {
                    if (C13LP.LJJJJ(uri.getHost(), LIZIZ())) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            public static long LIZLLL(Uri uri, String... strArr) {
                Long lLJIILIIL;
                if (uri == null) {
                    return 0L;
                }
                for (String str : strArr) {
                    String strLIZIZ = C1942307jB.LIZIZ(uri, str);
                    if (strLIZIZ != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZIZ)) != null) {
                        return lLJIILIIL.longValue();
                    }
                }
                return 0L;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String strLIZIZ;
                DataChannel dataChannelProvideDataChannel;
                if (!LiveGiftMusicSetting.INSTANCE.isEnable()) {
                    return false;
                }
                long jLIZLLL = LIZLLL(c2436109gd.LIZ, "moodId", "mood_id");
                long jLIZLLL2 = LIZLLL(c2436109gd.LIZ, "giftId", "gift_id");
                Uri uri = c2436109gd.LIZ;
                String[] strArr = {"enterFrom", "enter_from"};
                if (uri == null || (strLIZIZ = C1942307jB.LIZIZ(uri, strArr[0])) == null) {
                    strLIZIZ = "";
                }
                if (jLIZLLL <= 0 && jLIZLLL2 <= 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Invalid music gift detail schema moodId=");
                    sbLIZ.append(jLIZLLL);
                    sbLIZ.append(", giftId=");
                    sbLIZ.append(jLIZLLL2);
                    C20441214yg.LJ("MusicGiftDetailSchema", C2188811AlT.LIZIZ(sbLIZ));
                    return false;
                }
                IMusicGiftService iMusicGiftService = (IMusicGiftService) C1161920gLG.LIZJ(IMusicGiftService.class);
                if (iMusicGiftService == null) {
                    return false;
                }
                C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(C1388190mED.LIZIZ(context));
                if (c0ip3LIZIZ != null && (dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel()) != null) {
                    C500260Jjc.LJJLIIIJJIZ(new AwS2S1200200_17(iMusicGiftService, dataChannelProvideDataChannel, jLIZLLL2, jLIZLLL, strLIZIZ, 1));
                    return true;
                }
                C20441214yg.LJ("MusicGiftDetailSchema", "Open music gift detail failed: dataChannel is null");
                return false;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2437009gm<C2436109gd>() { // from class: X.0f9B
            @Override // X.AbstractC2437009gm
            public final List<String> LIZIZ() {
                return Collections.singletonList("webcast_pin_live_goal");
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZ(Uri uri) {
                return C13LP.LJJJJ(uri.getHost(), LIZIZ());
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                DataChannel dataChannelProvideDataChannel;
                String strLIZIZ;
                long jLongValue;
                Boolean bool;
                String strLIZIZ2;
                C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(C1388190mED.LIZIZ(context));
                if (c0ip3LIZIZ != null) {
                    dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel();
                } else {
                    dataChannelProvideDataChannel = null;
                }
                if (dataChannelProvideDataChannel == null) {
                    return true;
                }
                PinRequestParams pinRequestParams = new PinRequestParams();
                Uri uri = c2436109gd.LIZ;
                String str = "";
                if (uri == null || (strLIZIZ = C1942307jB.LIZIZ(uri, "goal_id")) == null) {
                    strLIZIZ = "";
                }
                Uri uri2 = c2436109gd.LIZ;
                if (uri2 != null && (strLIZIZ2 = C1942307jB.LIZIZ(uri2, "subgoal_id")) != null) {
                    str = strLIZIZ2;
                }
                try {
                    if (strLIZIZ.length() > 0) {
                        pinRequestParams.goalId = CastLongProtector.parseLong(strLIZIZ);
                    }
                    if (pinRequestParams.goalId <= 0) {
                        return false;
                    }
                    if (str.length() > 0) {
                        pinRequestParams.subGoalId = CastLongProtector.parseLong(str);
                    }
                    pinRequestParams.type = 1;
                    Long l = (Long) dataChannelProvideDataChannel.gg0(C751340Tdc.class);
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    pinRequestParams.roomId = jLongValue;
                    if (jLongValue == 0 || (bool = (Boolean) dataChannelProvideDataChannel.gg0(UserIsAnchorChannel.class)) == null || !bool.booleanValue()) {
                        return false;
                    }
                    GiftService.LLILLJJLI.pinGoal(pinRequestParams);
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return false;
                }
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2437009gm<C2436109gd>() { // from class: X.0f9C
            @Override // X.AbstractC2437009gm
            public final List<String> LIZIZ() {
                return Collections.singletonList("webcast_set_live_goal");
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZ(Uri uri) {
                return C13LP.LJJJJ(uri.getHost(), LIZIZ());
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                DataChannel dataChannelProvideDataChannel;
                long jLongValue;
                long jLongValue2;
                Boolean bool;
                String strLIZIZ;
                String strLIZIZ2;
                String strLIZIZ3;
                Long lLJIILIIL;
                String strLIZIZ4;
                Long lLJIILIIL2;
                C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(C1388190mED.LIZIZ(context));
                boolean z = false;
                if (c0ip3LIZIZ != null && (dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel()) != null) {
                    Uri uri = c2436109gd.LIZ;
                    if (uri != null && (strLIZIZ4 = C1942307jB.LIZIZ(uri, "gift_id")) != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(strLIZIZ4)) != null) {
                        jLongValue = lLJIILIIL2.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    Uri uri2 = c2436109gd.LIZ;
                    if (uri2 != null && (strLIZIZ3 = C1942307jB.LIZIZ(uri2, "gift_count")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZIZ3)) != null) {
                        jLongValue2 = lLJIILIIL.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    if (jLongValue > 0 && jLongValue2 > 0) {
                        Long l = (Long) dataChannelProvideDataChannel.gg0(C751340Tdc.class);
                        if (l != null) {
                            long jLongValue3 = l.longValue();
                            if (jLongValue3 == 0 || (bool = (Boolean) dataChannelProvideDataChannel.gg0(UserIsAnchorChannel.class)) == null || !bool.booleanValue()) {
                                return false;
                            }
                            Uri uri3 = c2436109gd.LIZ;
                            if (uri3 != null && (strLIZIZ2 = C1942307jB.LIZIZ(uri3, "need_pin")) != null) {
                                z = Boolean.parseBoolean(strLIZIZ2);
                            }
                            Uri uri4 = c2436109gd.LIZ;
                            if (uri4 == null || (strLIZIZ = C1942307jB.LIZIZ(uri4, "tip_or_tag_id")) == null) {
                                strLIZIZ = "";
                            }
                            LiveStreamSubGoal liveStreamSubGoal = new LiveStreamSubGoal();
                            liveStreamSubGoal.type = 1;
                            liveStreamSubGoal.target = jLongValue2;
                            liveStreamSubGoal.id = jLongValue;
                            liveStreamSubGoal.idStr = String.valueOf(jLongValue);
                            CommitV2RequestParams.CommitV2GoalParams commitV2GoalParams = new CommitV2RequestParams.CommitV2GoalParams();
                            commitV2GoalParams.type = 1;
                            commitV2GoalParams.autoCreate = 1;
                            commitV2GoalParams.subgoals = Collections.singletonList(liveStreamSubGoal);
                            commitV2GoalParams.recommendedGiftIds = Collections.singletonList(Long.valueOf(jLongValue));
                            commitV2GoalParams.recommendedGiftTargets = Collections.singletonList(Long.valueOf(jLongValue2));
                            commitV2GoalParams.status = EnumC2636010g.ONGOING.getCode();
                            CommitV2RequestParams commitV2RequestParams = new CommitV2RequestParams();
                            commitV2RequestParams.roomId = jLongValue3;
                            commitV2RequestParams.roomIdStr = String.valueOf(jLongValue3);
                            commitV2RequestParams.goals = Collections.singletonList(commitV2GoalParams);
                            commitV2RequestParams.commitSource = 2;
                            commitV2RequestParams.tabStatus = C2097908Jt.LIZJ(new Pair(1L, 2));
                            GiftService.LLILLJJLI.commitV2Goal(commitV2RequestParams, new C1116010f9D(z, this, jLongValue3, context, strLIZIZ), AFwS254S0000000_17.get$arr$(459));
                            return true;
                        }
                        return false;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Invalid set_live_goal params: gift_id=");
                    sbLIZ.append(jLongValue);
                    sbLIZ.append(", gift_count=");
                    sbLIZ.append(jLongValue2);
                    C20441214yg.LJ("SetGoalSchemaHandler", C2188811AlT.LIZIZ(sbLIZ));
                }
                return false;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0J8V
            public final List<String> LIZIZ = Collections.singletonList("webcast_super_fan_viewer_goal");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                Uri uri = c2436109gd.LIZ;
                if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source_page")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                return ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).VV0(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0ecf
            public final List<String> LIZIZ = Collections.singletonList("webcast_revenue_task");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                return C1126800fQc.LIZ.Wy0().LIZLLL(context, c2436109gd);
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0eeK
            public final List<String> LIZIZ = Collections.singletonList("webcast_strategy");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String path;
                Uri uri;
                LinkedHashMap<String, String> linkedHashMapLIZ;
                String strRemove;
                Long lLJIILIIL;
                int iIntValue;
                Integer numLJIIJJI;
                Uri uri2 = c2436109gd.LIZ;
                Map map2 = null;
                if (uri2 != null && (path = uri2.getPath()) != null) {
                    int iHashCode = path.hashCode();
                    if (iHashCode != -619869128) {
                        if (iHashCode == 2033664350 && path.equals("/open_share_panel")) {
                            C1126800fQc.LIZ.Wy0();
                            return C1143980fsK.LJFF(c2436109gd);
                        }
                        return false;
                    }
                    if (path.equals("/send_gift") && (uri = c2436109gd.LIZ) != null && (strRemove = (linkedHashMapLIZ = C1945807jk.LIZ(uri)).remove("gift_id")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strRemove)) != null) {
                        long jLongValue = lLJIILIIL.longValue();
                        String strRemove2 = linkedHashMapLIZ.remove("count");
                        if (strRemove2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strRemove2)) != null) {
                            iIntValue = numLJIIJJI.intValue();
                        } else {
                            iIntValue = 1;
                        }
                        String strRemove3 = linkedHashMapLIZ.remove("gift_enter_from");
                        if (strRemove3 == null) {
                            strRemove3 = "";
                        }
                        String strRemove4 = linkedHashMapLIZ.remove("tracking_params");
                        if (strRemove4 != null) {
                            Object objFromJson = GsonProtectorUtils.fromJson(C293501Bt.LIZ(), strRemove4, (Class<Object>) Map.class);
                            if (objFromJson instanceof Map) {
                                map2 = (Map) objFromJson;
                            }
                        }
                        DataChannelGlobal.LLILZ.HQ2(IncentiveSendGiftChannel.class, new C1096870eeL(iIntValue, strRemove3, map2, jLongValue));
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0fEb
            public final List<String> LIZIZ = Collections.singletonList("webcast_open_backpack");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LIZIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x0060 A[Catch: all -> 0x00d6, TryCatch #0 {all -> 0x00d6, blocks: (B:3:0x0003, B:6:0x0009, B:9:0x0012, B:11:0x0018, B:13:0x0029, B:14:0x0031, B:16:0x0036, B:18:0x003e, B:20:0x0044, B:24:0x004e, B:25:0x0051, B:32:0x0065, B:34:0x006b, B:36:0x0073, B:38:0x0079, B:39:0x007d, B:41:0x0081, B:43:0x0089, B:45:0x008f, B:46:0x0093, B:48:0x0097, B:50:0x009f, B:52:0x00a5, B:53:0x00a9, B:26:0x0054, B:27:0x0057, B:31:0x0063, B:28:0x005a, B:29:0x005d, B:30:0x0060), top: B:61:0x0003 }] */
            @Override // X.AbstractC2437009gm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZJ(android.content.Context r12, X.C2436109gd r13, java.util.Map<java.lang.String, java.lang.String> r14) {
                /*
                    Method dump skipped, instruction units count: 238
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1119350fEb.LIZJ(android.content.Context, X.09gd, java.util.Map):boolean");
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0fB4
            public final List<String> LIZIZ = Collections.singletonList("webcast_game_universal_link");

            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                if (((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).V01() != null) {
                    C1884390z8X.LIZIZ(context, String.valueOf(c2436109gd.LIZ), map);
                    return true;
                }
                return true;
            }
        });
        this.LLILLJJLI.LIZIZ(new SuperFanPaymentDialogSchemaHandler());
        this.LLILLJJLI.LIZIZ(new LiveOpenExtendedScreenHandler());
        this.LLILLJJLI.LIZIZ(new SuperFanTreasureBoxSchemaHandler());
        this.LLILLJJLI.LIZIZ(new AbstractC2437009gm<C2436109gd>() { // from class: X.0UY4
            @Override // X.AbstractC2437009gm
            public final List<String> LIZIZ() {
                return Collections.singletonList("webcast_comment_panel_popup");
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZ(Uri uri) {
                return C13LP.LJJJJ(uri.getHost(), LIZIZ());
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
                Uri uri = c2436109gd.LIZ;
                if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "content")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                Uri uri2 = c2436109gd.LIZ;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = null;
                if (uri2 != null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "dismiss_gift_panel");
                } else {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
                }
                boolean zLJFF = Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "1");
                Uri uri3 = c2436109gd.LIZ;
                if (uri3 != null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "enter_from");
                }
                if (zLJFF) {
                    C784440Upu.LIZ().LIZIZ(new C0JOK());
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 != null) {
                    linkedHashMap.put("enter_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
                }
                Uri uri4 = c2436109gd.LIZ;
                if (uri4 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri4, "enter_from_page")) != null) {
                    linkedHashMap.put("enter_from_page", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
                }
                Uri uri5 = c2436109gd.LIZ;
                if (uri5 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri5, "enter_method")) != null) {
                    linkedHashMap.put("enter_method", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                }
                Uri uri6 = c2436109gd.LIZ;
                if (uri6 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri6, "request_page")) != null) {
                    linkedHashMap.put("request_page", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                }
                C784440Upu.LIZ().LIZIZ(new C1110530f0N(3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6, "", new JSONObject(linkedHashMap)));
                return true;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2437009gm<C2436109gd>() { // from class: X.0UY2
            @Override // X.AbstractC2437009gm
            public final List<String> LIZIZ() {
                return Collections.singletonList("webcast_emote_panel");
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZ(Uri uri) {
                return C13LP.LJJJJ(uri.getHost(), LIZIZ());
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                int i;
                Uri uri = c2436109gd.LIZ;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
                if (uri != null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tab");
                } else {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                }
                if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "super_fan")) {
                    i = 3;
                } else {
                    i = 2;
                }
                Uri uri2 = c2436109gd.LIZ;
                if (uri2 != null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "show_entrance");
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                DataChannelGlobal.LLILZ.JQ2(C1148290fzH.class, Integer.valueOf(i));
                C784440Upu.LIZ().LIZIZ(new C1110530f0N(5, "", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, false));
                return true;
            }
        });
        if (LivePublicScreenClickWaveSchemaSetting.INSTANCE.enable()) {
            this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0J8U
                @Override // X.AbstractC2436909gl
                public final List<String> LIZLLL() {
                    return Collections.singletonList("webcast_wave");
                }

                @Override // X.AbstractC2437009gm
                public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                    DataChannel dataChannelProvideDataChannel;
                    long jLongValue;
                    LiveMode liveMode;
                    C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(C1388190mED.LIZIZ(context));
                    String str = null;
                    if (c0ip3LIZIZ != null) {
                        dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel();
                    } else {
                        dataChannelProvideDataChannel = null;
                    }
                    Uri uri = c2436109gd.LIZ;
                    if (uri != null) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "msg_id");
                        String str2 = "";
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                        }
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                        }
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "track_params");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                            str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                        }
                        Map linkedHashMap = new LinkedHashMap();
                        if (str2.length() > 0) {
                            linkedHashMap = C2348809Ig.LIZJ(new JSONObject(str2));
                        }
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_wave");
                        c474500IjALIZ.LJIJJLI(dataChannelProvideDataChannel);
                        c474500IjALIZ.LJJII(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "to_user_id");
                        c474500IjALIZ.LJJII(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "msg_id");
                        c474500IjALIZ.LJJII("wave", Scene.SCENE_SERVICE);
                        c474500IjALIZ.LJJII("anchor", "admin_type");
                        if (dataChannelProvideDataChannel != null && (liveMode = (LiveMode) dataChannelProvideDataChannel.gg0(LiveModeChannel.class)) != null) {
                            str = liveMode.logStreamingType;
                        }
                        c474500IjALIZ.LJJ(str);
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            c474500IjALIZ.LJJII(entry.getValue().toString(), (String) entry.getKey());
                        }
                        c474500IjALIZ.LIZ();
                        Long lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                        long jLongValue2 = 0;
                        if (lLJIILIIL != null) {
                            jLongValue = lLJIILIIL.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        Long lLJIILIIL2 = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        if (lLJIILIIL2 != null) {
                            jLongValue2 = lLJIILIIL2.longValue();
                        }
                        Pair pair = new Pair(Long.valueOf(jLongValue), Long.valueOf(jLongValue2));
                        if (dataChannelProvideDataChannel != null) {
                            dataChannelProvideDataChannel.zW(LiveClickWaveMessageChannel.class, pair);
                        }
                    }
                    return true;
                }
            });
        }
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0JAf
            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return C1697810uHb.LJIIJJI("webcast_group_chat_create", "webcast_group_chat_invite", "webcast_group_chat_open");
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String host;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                Uri uri = c2436109gd.LIZ;
                if (uri != null) {
                    host = uri.getHost();
                } else {
                    host = null;
                }
                if (host == null) {
                    return false;
                }
                int iHashCode = host.hashCode();
                if (iHashCode != -236704425) {
                    if (iHashCode != -68109468) {
                        if (iHashCode != 1242565989 || !host.equals("webcast_group_chat_open")) {
                            return false;
                        }
                        Uri uri2 = c2436109gd.LIZ;
                        if (uri2 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "conversation_id")) != null) {
                            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openGroupChat(context, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        }
                    } else {
                        if (!host.equals("webcast_group_chat_invite")) {
                            return false;
                        }
                        Uri uri3 = c2436109gd.LIZ;
                        if (uri3 != null) {
                            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openEndPageCreateOrInviteGroupChatPanel(context, uri3, false);
                        }
                    }
                } else {
                    if (!host.equals("webcast_group_chat_create")) {
                        return false;
                    }
                    Uri uri4 = c2436109gd.LIZ;
                    if (uri4 != null) {
                        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openEndPageCreateOrInviteGroupChatPanel(context, uri4, true);
                    }
                }
                return true;
            }
        });
        this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.09gf
            @Override // X.AbstractC2436909gl
            public final List<String> LIZLLL() {
                return Collections.singletonList("webcast_fan_group_create_choose_invite");
            }

            @Override // X.AbstractC2437009gm
            public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String host;
                Uri uri = c2436109gd.LIZ;
                if (uri != null && (host = uri.getHost()) != null && host.hashCode() == -184296506 && host.equals("webcast_fan_group_create_choose_invite")) {
                    Uri uri2 = c2436109gd.LIZ;
                    if (uri2 != null) {
                        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openFanGroupCreateChooseInvitePanel(context, uri2);
                        return true;
                    }
                    return true;
                }
                return false;
            }
        });
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOfflineOrIsRegressionTest()) {
            this.LLILLJJLI.LIZIZ(new AbstractC2436909gl<C2436109gd>() { // from class: X.0J8S
                public final List<String> LIZIZ = Collections.singletonList("localtest_survey_preview");

                @Override // X.AbstractC2436909gl
                public final List<String> LIZLLL() {
                    return this.LIZIZ;
                }

                @Override // X.AbstractC2437009gm
                public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                    if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOfflineOrIsRegressionTest()) {
                        return false;
                    }
                    Uri uri = c2436109gd.LIZ;
                    if (uri != null) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "referral_task";
                        }
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "H5";
                        }
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "survey_id");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "lan");
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "entrance");
                            if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, "fyp")) {
                                C766270U4b.LJIIJJI("handle fyp");
                                IHostOffline iHostOffline = (IHostOffline) C1161920gLG.LIZJ(IHostOffline.class);
                                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                                }
                                iHostOffline.handleSurveyPreview(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                                return true;
                            }
                            if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, "inner")) {
                                C766270U4b.LJIIJJI("handle inner");
                                HashMap map2 = new HashMap();
                                map2.put("intercept", "new_style");
                                map2.put("live.intent.extra.FROM_NEW_STYLE_SOURCE", "referral_task");
                                map2.put("enter_from_merge", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                                map2.put("enter_method", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                                map2.put("debug_survey_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                                }
                                map2.put("debug_survey_lan", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                                ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).U91().LIZ(map2);
                                return true;
                            }
                            C766270U4b.LJIIJJI("entrance is null");
                            return true;
                        }
                        C766270U4b.LJIIJJI("survey_id is null");
                        return true;
                    }
                    C766270U4b.LJIIJJI("jump error");
                    return true;
                }
            });
        }
    }

    public ActionHandlerService() {
        if (LiveServiceManagerOptSetting.enable()) {
            return;
        }
        LIZIZ();
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final boolean canHandle(Uri uri) {
        LIZIZ();
        C2437109gn c2437109gn = this.LLILLJJLI;
        c2437109gn.getClass();
        AbstractC2437009gm abstractC2437009gm = (AbstractC2437009gm) ((HashMap) c2437109gn.LIZ).get(uri.getHost());
        if (abstractC2437009gm != null && abstractC2437009gm.LIZ(uri)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final void setAnchorChannel(WeakReference<DataChannel> weakReference) {
        AbstractC1117310fBJ.LJ = weakReference;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final void setIsAnchor(boolean z) {
        AbstractC1117310fBJ.LIZLLL = z;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final boolean showUserProfile(long j) {
        LIZIZ();
        this.LL.getClass();
        C496640Jdm.LIZIZ(j, null, null);
        throw null;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final boolean handle(Context context, String str) {
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            uri = UriProtector.parse(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            uri = null;
        }
        return LIZ(context, uri, true);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final boolean handleWithoutHost(Context context, String str) {
        return LIZ(context, UriProtector.parse(str), false);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final boolean handle(Context context, Uri uri) {
        return LIZ(context, uri, true);
    }

    public final boolean LIZ(Context context, Uri uri, boolean z) {
        boolean zLJI = MethodIDManager.LJI(72107);
        LIZIZ();
        boolean zLIZ = this.LLILLJJLI.LIZ(context, uri, z, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zLIZ;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final boolean handleWithoutHost(Context context, Uri uri, Map<String, String> map) {
        boolean zLJI = MethodIDManager.LJI(72107);
        LIZIZ();
        boolean zLIZ = this.LLILLJJLI.LIZ(context, uri, false, map);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zLIZ;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final boolean showUserProfile(long j, String str, Map<String, String> map) {
        LIZIZ();
        this.LL.getClass();
        C496640Jdm.LIZIZ(j, str, map);
        return true;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final void postReportReason(long j, long j2, long j3, String str) {
        C480460Ism.LIZ().getClass();
        ((ActionHandlerApi) C480460Ism.LIZLLL(ActionHandlerApi.class)).postReportReasons(j, j2, j3, str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516901zr(3), new C516901zr(4));
    }
}
