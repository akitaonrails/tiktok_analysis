package kotlin.jvm.internal;

import X.AbstractC1484710ojt;
import X.AbstractC725620SdE;
import X.C03H5;
import X.C09AY;
import X.C0CNO;
import X.C0SIK;
import X.C0SIR;
import X.C0ST3;
import X.C0SX4;
import X.C1247120iYg;
import X.C1260960iv0;
import X.C1308910kAL;
import X.C1350340lFA;
import X.C13LE;
import X.C1697810uHb;
import X.C1720106oR;
import X.C20642515q3;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C238400w2;
import X.C697210RWl;
import X.C698680Ras;
import X.C699370Rbz;
import X.C699390Rc1;
import X.C699810Rch;
import X.C700100RdA;
import X.C700190RdJ;
import X.C700410Rdf;
import X.C700930ReV;
import X.C700950ReX;
import X.C700970ReZ;
import X.C701010Red;
import X.C701040Reg;
import X.C704180Rjk;
import X.C707400Row;
import X.C721770SSx;
import X.C725580SdA;
import X.C727350Sg1;
import X.C728910SiX;
import X.C729510SjV;
import X.C730090SkR;
import X.C730130SkV;
import X.C735510StB;
import X.C735840Sti;
import X.C737720Swk;
import X.C737730Swl;
import X.EnumC736440Sug;
import X.InterfaceC697120RWc;
import X.InterfaceC697230RWn;
import X.InterfaceC698070RZt;
import X.InterfaceC699970Rcx;
import X.InterfaceC707420Roy;
import X.InterfaceC725710SdN;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.content.res.Resources;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ComponentContainerData;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.aweme.feed.model.LivePhotoStruct;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerTracerInfoStruct;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerCell;
import com.ss.android.ugc.aweme.story.model.StoryInteraction;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpAwemeInfo;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public class AwS255S0300000_11 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS255S0300000_11 awS255S0300000_11) {
        String containerKey;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doModifyTreeStructure process: currentNodeKey: ");
        sbLIZ.append(((GlobalComponentData) awS255S0300000_11.l0).getComponentKey());
        sbLIZ.append(", fromContainerKey: ");
        ComponentContainerData componentContainerData = (ComponentContainerData) awS255S0300000_11.l1;
        String containerKey2 = null;
        if (componentContainerData != null) {
            containerKey = componentContainerData.getContainerKey();
        } else {
            containerKey = null;
        }
        sbLIZ.append(containerKey);
        sbLIZ.append(", toContainerKey: ");
        ComponentContainerData componentContainerData2 = (ComponentContainerData) awS255S0300000_11.l2;
        if (componentContainerData2 != null) {
            containerKey2 = componentContainerData2.getContainerKey();
        }
        sbLIZ.append(containerKey2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS255S0300000_11 awS255S0300000_11) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(((C238400w2) awS255S0300000_11.l0).element);
        sbLIZ.append(" --- ");
        C700970ReZ c700970ReZ = ((C701010Red) awS255S0300000_11.l1).node;
        if (c700970ReZ != null) {
            str = c700970ReZ.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" --- FcpReleaseTask#compute result: ");
        sbLIZ.append((C700950ReX) awS255S0300000_11.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS255S0300000_11 awS255S0300000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((LivePhotoViewHolder) awS255S0300000_11.l0).hashCode());
        sbLIZ.append(" onLivePhotoStructReady vid ");
        sbLIZ.append(((LivePhotoStruct) awS255S0300000_11.l1).livePhotoVid);
        sbLIZ.append(" has playUrl ");
        sbLIZ.append(C721770SSx.LIZ((LivePhotoStruct) awS255S0300000_11.l1));
        sbLIZ.append(" create type: ");
        sbLIZ.append(((LivePhotoStruct) awS255S0300000_11.l1).livePhotoType);
        sbLIZ.append(" consume type: ");
        sbLIZ.append(((AbstractC1484710ojt) awS255S0300000_11.l2).LIZIZ.LJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$11(AwS255S0300000_11 awS255S0300000_11) {
        String str;
        String str2 = ((C737730Swl) awS255S0300000_11.l0).LLILZ.feedEnterFrom;
        if (((Aweme) awS255S0300000_11.l1).getIsTikTokStory()) {
            str = "story";
        } else {
            str = "post";
        }
        return new C1260960iv0(str2, (User) awS255S0300000_11.l2, "follow_button", "interactive_sticker_result_list", (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "interactive_sticker_result_list", ((Aweme) awS255S0300000_11.l1).getAid(), str, (String) null, 0, 0, (Boolean) null, 0, (String) null, false, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, 0, (String) null, (Boolean) null, C2097908Jt.LIZJ(new Pair("FOLLOW_STATUS", "2")), (String) null, (Integer) null, (Integer) null, (String) null, (String) null, 0, (String) null, (Long) null, 0, (Integer) null, (String) null, (String) null, 0, 0, (Integer) null, (Map) null, (String) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (C1247120iYg) null, (Map) null, -106512, -2049, 16383);
    }

    public static final Object invoke$12(AwS255S0300000_11 awS255S0300000_11) {
        String str;
        String str2 = ((C737720Swk) awS255S0300000_11.l0).LLILZIL.feedEnterFrom;
        if (((Aweme) awS255S0300000_11.l1).getIsTikTokStory()) {
            str = "story";
        } else {
            str = "post";
        }
        return new C1260960iv0(str2, (User) awS255S0300000_11.l2, "follow_button", "interactive_sticker_result_list", (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "interactive_sticker_result_list", ((Aweme) awS255S0300000_11.l1).getAid(), str, (String) null, 0, 0, (Boolean) null, 0, (String) null, false, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, 0, (String) null, (Boolean) null, C2097908Jt.LIZJ(new Pair("FOLLOW_STATUS", "2")), (String) null, (Integer) null, (Integer) null, (String) null, (String) null, 0, (String) null, (Long) null, 0, (Integer) null, (String) null, (String) null, 0, 0, (Integer) null, (Map) null, (String) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (C1247120iYg) null, (Map) null, -106512, -2049, 16383);
    }

    public static final Object invoke$13(AwS255S0300000_11 awS255S0300000_11) {
        int iIntValue;
        String desc;
        int iIntValue2;
        PlayListInfo playListInfo;
        Integer index;
        String string = C20642515q3.LJFF().getString(2131848665);
        Resources resourcesLJFF = C20642515q3.LJFF();
        Object[] objArr = new Object[1];
        Aweme aweme = (Aweme) awS255S0300000_11.l0;
        if (aweme != null && (playListInfo = aweme.playlist_info) != null && (index = playListInfo.getIndex()) != null) {
            iIntValue = index.intValue();
        } else {
            iIntValue = 0;
        }
        objArr[0] = Integer.valueOf(iIntValue + 1);
        String string2 = resourcesLJFF.getString(2131839683, objArr);
        C0SIK c0sik = C0SIK.PLAYLIST;
        C0SIR c0sir = new C0SIR(string2, (List) null, c0sik, 10);
        Aweme aweme2 = (Aweme) awS255S0300000_11.l0;
        if (aweme2 != null && (desc = aweme2.getDesc()) != null && desc.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append('|');
            sbLIZ.append(string);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Object[] objArr2 = new Object[1];
            Integer numLIZJ = (Integer) awS255S0300000_11.l1;
            if (numLIZJ == null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ei, (Context) awS255S0300000_11.l2)) == null) {
                iIntValue2 = -1;
            } else {
                iIntValue2 = numLIZJ.intValue();
            }
            objArr2[0] = new ForegroundColorSpan(iIntValue2);
            return C1697810uHb.LJIIJJI(c0sir, new C0SIR(strLIZIZ, C1697810uHb.LJIILJJIL(objArr2), c0sik, 8));
        }
        return Collections.singletonList(c0sir);
    }

    public static final Object invoke$14(AwS255S0300000_11 awS255S0300000_11) {
        String aid;
        VideoItemParams videoItemParamsLIZJ;
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed VideoTag(");
        sbLIZ.append((String) ((Map.Entry) awS255S0300000_11.l0).getKey());
        sbLIZ.append(") Layer receive timing callback. signal#: ");
        sbLIZ.append((C698680Ras) awS255S0300000_11.l1);
        sbLIZ.append(". current_aid: ");
        InterfaceC697120RWc interfaceC697120RWc = ((C697210RWl) awS255S0300000_11.l2).LLIZ;
        if (interfaceC697120RWc != null && (videoItemParamsLIZJ = interfaceC697120RWc.LIZJ()) != null && (aweme = videoItemParamsLIZJ.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[PHI: r9
      0x006b: PHI (r9v1 android.view.View) = (r9v0 android.view.View), (r9v2 android.view.View) binds: [B:18:0x0066, B:16:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$15(kotlin.jvm.internal.AwS255S0300000_11 r13) {
        /*
            java.lang.Object r1 = r13.l0
            X.0SX4 r1 = (X.C0SX4) r1
            java.lang.Object r0 = r13.l1
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.LJJIIJZLJL(r0)
            java.lang.Object r1 = r13.l0
            X.0SX4 r1 = (X.C0SX4) r1
            java.lang.Object r0 = r13.l1
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.LJJIII(r0)
            java.lang.Object r0 = r13.l2
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3 = 0
            X.C786410Ut5.LJZL(r3, r0)
            java.lang.Object r12 = r13.l0
            X.0SX4 r12 = (X.C0SX4) r12
            r12.LJIJI()
            X.0P0T r0 = r12.LJIIIIZZ
            if (r0 == 0) goto L68
            X.0mJi r0 = r0.LJIILL()
            if (r0 == 0) goto L68
            android.view.ViewGroup r13 = r0.LIZJ
            if (r13 == 0) goto L68
            int r1 = r13.getId()
            r0 = 2131367838(0x7f0a179e, float:1.835561E38)
            r2 = -1
            if (r1 != r0) goto L5b
            int r0 = r13.getChildCount()
            if (r0 == 0) goto L5b
            int r0 = r13.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r1 = r13.getChildAt(r0)
            int r0 = r13.getChildCount()
        L51:
            if (r3 >= r0) goto L5b
            android.view.View r9 = r13.getChildAt(r3)
            if (r9 == r1) goto Lb0
            if (r9 != 0) goto L6b
        L5b:
            android.view.View r1 = r13.getRootView()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r9 = r1.findViewById(r0)
            if (r9 != 0) goto L6b
        L68:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6b:
            android.content.Context r0 = r12.LIZIZ
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r8 = r0.getScaledTouchSlop()
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            long r10 = (long) r0
            X.03Hg r3 = new X.03Hg
            r3.<init>()
            X.03Hg r4 = new X.03Hg
            r4.<init>()
            X.00w2 r5 = new X.00w2
            r5.<init>()
            X.013C r6 = new X.013C
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            android.view.View r1 = new android.view.View
            android.content.Context r0 = r12.LIZIZ
            r1.<init>(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r2, r2)
            X.C786410Ut5.W5(r1, r0)
            X.0SX3 r2 = new X.0SX3
            r2.<init>()
            r1.setOnTouchListener(r2)
            r13.addView(r1)
            r12.LJIIJ = r1
            goto L68
        Lb0:
            int r3 = r3 + 1
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS255S0300000_11.invoke$15(kotlin.jvm.internal.AwS255S0300000_11):java.lang.Object");
    }

    public static final Object invoke$16(AwS255S0300000_11 awS255S0300000_11) {
        String strEnterFrom;
        C735510StB c735510StB = (C735510StB) awS255S0300000_11.l0;
        Aweme aweme = (Aweme) awS255S0300000_11.l1;
        CommentContextSource commentContextSource = (CommentContextSource) awS255S0300000_11.l2;
        if (commentContextSource != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSource);
        } else {
            strEnterFrom = null;
        }
        c735510StB.getClass();
        C1350340lFA.LIZIZ(c735510StB, aweme, strEnterFrom);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS255S0300000_11 awS255S0300000_11) {
        FcpAwemeInfo fcpAwemeInfo;
        View.OnClickListener onClickListenerLIZ = ((InterfaceC698070RZt) awS255S0300000_11.l0).LIZ((VideoItemParams) awS255S0300000_11.l1);
        if (onClickListenerLIZ != null) {
            onClickListenerLIZ.onClick((View) awS255S0300000_11.l2);
        }
        View view = (View) awS255S0300000_11.l2;
        if ((view instanceof ViewGroup) && view != null) {
            C700410Rdf.LIZ.getClass();
            Object tag = view.getTag(C700100RdA.LJII);
            if (tag != null) {
                Object tag2 = view.getTag(C700100RdA.LJIIIIZZ);
                if ((tag2 instanceof FcpAwemeInfo) && (fcpAwemeInfo = (FcpAwemeInfo) tag2) != null) {
                    C700410Rdf.LJ(view, tag, fcpAwemeInfo, true);
                }
            }
            C704180Rjk.LIZ.getClass();
            HandlerHook.viewPostDelay(view, new ARunnableS111S0100000_11(view, 153), 100L);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS255S0300000_11 awS255S0300000_11) {
        ((Function2) awS255S0300000_11.l0).invoke((C03H5) awS255S0300000_11.l1, awS255S0300000_11.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS255S0300000_11 awS255S0300000_11) {
        Map<String, String> mapLIZJ;
        BannerTracerInfoStruct bannerTracerInfoStruct;
        String str;
        Map<String, String> mapLIZJ2;
        String string;
        BannerCommonStruct bannerCommonStruct = (BannerCommonStruct) ((Function0) awS255S0300000_11.l0).invoke();
        C707400Row.LIZ.getClass();
        if (bannerCommonStruct != null && (bannerTracerInfoStruct = bannerCommonStruct.tracerInfo) != null && (str = bannerTracerInfoStruct.tracerInfoValue) != null && str.length() != 0) {
            View viewLJJIJL = ((FeedCommonBannerTrigger) awS255S0300000_11.l2).LJJIJL();
            InterfaceC707420Roy interfaceC707420Roy = (InterfaceC707420Roy) awS255S0300000_11.l1;
            if (interfaceC707420Roy != null) {
                mapLIZJ2 = interfaceC707420Roy.LIZJ();
            } else {
                mapLIZJ2 = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : C707400Row.LIZ(bannerCommonStruct).entrySet()) {
                Object key = entry.getKey();
                String str2 = (String) entry.getValue();
                if (Intrinsics.LJFF(key, "btm")) {
                    BtmSDK btmSDK = BtmSDK.INSTANCE;
                    if (str2 == null) {
                        str2 = null;
                    }
                    for (Map.Entry entry2 : BtmSDK.createReportParams$default(btmSDK, String.valueOf(str2), PageFinder.via(viewLJJIJL), null, 4, null).entrySet()) {
                        Object value = entry2.getValue();
                        if (value != null && (string = value.toString()) != null && string.length() != 0) {
                            linkedHashMap.put(entry2.getKey(), string);
                        }
                    }
                } else if (str2 != null && str2.length() != 0) {
                    linkedHashMap.put(key, str2);
                }
            }
            if (mapLIZJ2 != null && !mapLIZJ2.isEmpty()) {
                linkedHashMap.putAll(mapLIZJ2);
                return linkedHashMap;
            }
            return linkedHashMap;
        }
        InterfaceC707420Roy interfaceC707420Roy2 = (InterfaceC707420Roy) awS255S0300000_11.l1;
        if (interfaceC707420Roy2 == null || (mapLIZJ = interfaceC707420Roy2.LIZJ()) == null) {
            return C2097608Jq.LJ();
        }
        return mapLIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS255S0300000_11 awS255S0300000_11) {
        ((ConditionData) awS255S0300000_11.l0).setCanApplySlot(false);
        ((ConditionData) awS255S0300000_11.l0).setCanApplyDisplay(false);
        ReusedAssem reusedAssem = (ReusedAssem) awS255S0300000_11.l1;
        C701040Reg c701040Reg = ((C700190RdJ) awS255S0300000_11.l2).LJFF;
        if ((reusedAssem instanceof PriorityProtocol) && (reusedAssem instanceof InterfaceC699970Rcx)) {
            ((InterfaceC699970Rcx) reusedAssem).l5(false);
        }
        C0CNO.LIZLLL(0L, new AwS94S0210000_11(reusedAssem, (ReusedAssem<?>) false, (boolean) c701040Reg, (C701040Reg) 0));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS255S0300000_11 awS255S0300000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(" --- doDispatchSignal --- component_clazz: ");
        sbLIZ.append(C13LE.LIZ(((C700930ReV) awS255S0300000_11.l0).getClass()).LJI());
        sbLIZ.append(" ---- component_key: ");
        sbLIZ.append(((FcpNodeProtocol) awS255S0300000_11.l1).LLLII());
        sbLIZ.append(" ---- signal: ");
        sbLIZ.append((C698680Ras) awS255S0300000_11.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS255S0300000_11 awS255S0300000_11) {
        ((C699370Rbz) awS255S0300000_11.l0).LIZJ(((C699810Rch) awS255S0300000_11.l1).LIZ, ((C699390Rc1) awS255S0300000_11.l2).LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS255S0300000_11 awS255S0300000_11) {
        C725580SdA c725580SdA = (C725580SdA) awS255S0300000_11.l0;
        String str = ((AbstractC725620SdE) awS255S0300000_11.l1).LL;
        c725580SdA.getClass();
        C20684815ws.LJIJ("story_gesture_education", c725580SdA.LIZ(new AwS62S1000000_11(str, 5)));
        ((InterfaceC725710SdN) awS255S0300000_11.l2).LIZ(C725580SdA.LJIIJ.getValue());
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((AbstractC725620SdE) awS255S0300000_11.l1).LL);
        sbLIZ.append(" shown");
        C1720106oR.LJI("StoryGestureEducation", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AwS255S0300000_11 awS255S0300000_11) {
        Aweme aweme;
        String strValueOf;
        String str;
        String str2;
        String str3;
        String str4;
        String strLJII;
        String aid;
        String str5;
        User author;
        C728910SiX c728910SiX = ((C730090SkR) ((StoryViewerCell) awS255S0300000_11.l0).L5().getState()).LLILLJJLI;
        String authorUid = null;
        if (c728910SiX != null) {
            aweme = c728910SiX.LIZ;
        } else {
            aweme = null;
        }
        Pair[] pairArr = new Pair[3];
        C735840Sti c735840Sti = C735840Sti.LIZ;
        User user = ((C730130SkV) awS255S0300000_11.l1).LL.user;
        c735840Sti.getClass();
        pairArr[0] = new Pair("follow_status", String.valueOf(C735840Sti.LJIIIIZZ(user)));
        if (aweme == null || (author = aweme.getAuthor()) == null || (strValueOf = Integer.valueOf(author.getFollowStatusRelation()).toString()) == null) {
            strValueOf = String.valueOf(EnumC736440Sug.ELSE.getValue());
        }
        pairArr[1] = new Pair("follow_status_relation", strValueOf);
        if (C729510SjV.LJJIIZI(aweme)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_note", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (((C730130SkV) awS255S0300000_11.l1).LLILLL) {
            StoryInteraction storyInteraction = (StoryInteraction) awS255S0300000_11.l2;
            if (storyInteraction != null && storyInteraction.isUnlockedReveal()) {
                str5 = "unlocked";
            } else {
                str5 = "locked";
            }
            mapLJIIJ.put("story_reveal_status", str5);
        }
        C727350Sg1 c727350Sg1 = ((StoryViewerCell) awS255S0300000_11.l0).L5().LLILLL;
        if (c727350Sg1 == null || (str2 = c727350Sg1.feedEnterFrom) == null) {
            str2 = "";
        }
        C730130SkV c730130SkV = (C730130SkV) awS255S0300000_11.l1;
        String str6 = "views_list_panel";
        if (c730130SkV.LLILZ) {
            str3 = "views_list_panel";
        } else {
            str6 = "follow_button";
            str3 = "story_views_list_panel";
        }
        User user2 = c730130SkV.LL.user;
        int iLJIIIZ = C735840Sti.LJIIIZ(aweme);
        if (C729510SjV.LJJ(aweme)) {
            str4 = "story";
        } else {
            str4 = "post";
        }
        if (aweme != null) {
            strLJII = C729510SjV.LJII(aweme);
            aid = aweme.getAid();
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            strLJII = null;
            aid = null;
        }
        return new C1260960iv0(str2, user2, str6, str3, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "story_views_list_panel", aid, str4, strLJII, iLJIIIZ, 0, (Boolean) null, 0, (String) null, false, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, 0, (String) null, (Boolean) null, mapLJIIJ, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, 0, (String) null, (Long) null, 0, (Integer) null, (String) null, authorUid, 0, 0, (Integer) null, (Map) null, (String) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (C1247120iYg) null, (Map) null, -499728, -8390657, 16383);
    }

    public static final Object invoke$9(AwS255S0300000_11 awS255S0300000_11) {
        ((StoryViewerCell) awS255S0300000_11.l0).L5().CQ2(((StoryViewerCell) awS255S0300000_11.l0).itemView.getContext(), (User) awS255S0300000_11.l1, (StoryInteraction) awS255S0300000_11.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(C238400w2 c238400w2, C701010Red c701010Red, C700950ReX c700950ReX, int i) {
        super(0);
        this.$t = i;
        this.l0 = c238400w2;
        this.l1 = c701010Red;
        this.l2 = c700950ReX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(InterfaceC698070RZt interfaceC698070RZt, VideoItemParams videoItemParams, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC698070RZt;
        this.l1 = videoItemParams;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(C699370Rbz c699370Rbz, C699810Rch c699810Rch, C699390Rc1 c699390Rc1, int i) {
        super(0);
        this.$t = i;
        this.l0 = c699370Rbz;
        this.l1 = c699810Rch;
        this.l2 = c699390Rc1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(C700930ReV c700930ReV, FcpNodeProtocol fcpNodeProtocol, C698680Ras c698680Ras, int i) {
        super(0);
        this.$t = i;
        this.l0 = c700930ReV;
        this.l1 = fcpNodeProtocol;
        this.l2 = c698680Ras;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(C0SX4 c0sx4, TextView textView, LinearLayout linearLayout, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0sx4;
        this.l1 = textView;
        this.l2 = linearLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(C725580SdA c725580SdA, AbstractC725620SdE abstractC725620SdE, InterfaceC725710SdN interfaceC725710SdN, int i) {
        super(0);
        this.$t = i;
        this.l0 = c725580SdA;
        this.l1 = abstractC725620SdE;
        this.l2 = interfaceC725710SdN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(C735510StB c735510StB, Aweme aweme, CommentContextSource commentContextSource, int i) {
        super(0);
        this.$t = i;
        this.l0 = c735510StB;
        this.l1 = aweme;
        this.l2 = commentContextSource;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(C737720Swk c737720Swk, Aweme aweme, User user, int i) {
        super(0);
        this.$t = i;
        this.l0 = c737720Swk;
        this.l1 = aweme;
        this.l2 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(C737730Swl c737730Swl, Aweme aweme, User user, int i) {
        super(0);
        this.$t = i;
        this.l0 = c737730Swl;
        this.l1 = aweme;
        this.l2 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(Context context, Aweme aweme, Integer num, int i) {
        super(0);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = num;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(GlobalComponentData globalComponentData, ComponentContainerData componentContainerData, ComponentContainerData componentContainerData2, int i) {
        super(0);
        this.$t = i;
        this.l0 = globalComponentData;
        this.l1 = componentContainerData;
        this.l2 = componentContainerData2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS255S0300000_11(ConditionData conditionData, ConditionData conditionData2, ReusedAssem<?> reusedAssem, C700190RdJ c700190RdJ) {
        super(0);
        this.$t = c700190RdJ;
        this.l0 = conditionData;
        this.l1 = conditionData2;
        this.l2 = reusedAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(LivePhotoViewHolder livePhotoViewHolder, LivePhotoStruct livePhotoStruct, C0ST3 c0st3, int i) {
        super(0);
        this.$t = i;
        this.l0 = livePhotoViewHolder;
        this.l1 = livePhotoStruct;
        this.l2 = c0st3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(StoryViewerCell storyViewerCell, C730130SkV c730130SkV, StoryInteraction storyInteraction, int i) {
        super(0);
        this.$t = i;
        this.l0 = storyViewerCell;
        this.l1 = c730130SkV;
        this.l2 = storyInteraction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(StoryViewerCell storyViewerCell, User user, StoryInteraction storyInteraction, int i) {
        super(0);
        this.$t = i;
        this.l0 = storyViewerCell;
        this.l1 = user;
        this.l2 = storyInteraction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS255S0300000_11(Map.Entry entry, Map.Entry<String, ? extends InterfaceC697230RWn> entry2, C698680Ras c698680Ras, C697210RWl c697210RWl) {
        super(0);
        this.$t = c697210RWl;
        this.l0 = entry;
        this.l1 = entry2;
        this.l2 = c698680Ras;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS255S0300000_11(Function2 function2, Function2<C03H5, Object, Unit> function22, C03H5 c03h5, Object obj) {
        super(0);
        this.$t = obj;
        this.l0 = function2;
        this.l1 = function22;
        this.l2 = c03h5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0300000_11(AwS555S0100000_11 awS555S0100000_11, InterfaceC707420Roy interfaceC707420Roy, FeedCommonBannerTrigger feedCommonBannerTrigger, int i) {
        super(0);
        this.$t = i;
        this.l0 = awS555S0100000_11;
        this.l1 = interfaceC707420Roy;
        this.l2 = feedCommonBannerTrigger;
    }
}
