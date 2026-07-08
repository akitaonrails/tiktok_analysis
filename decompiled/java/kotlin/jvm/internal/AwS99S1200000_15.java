package kotlin.jvm.internal;

import X.C01IF;
import X.C020F;
import X.C020R;
import X.C05P0;
import X.C09AY;
import X.C0KX4;
import X.C1143680frq;
import X.C11NJ;
import X.C11QI;
import X.C11S5;
import X.C1295960jpS;
import X.C1701940uOG;
import X.C19489311Mt;
import X.C20441214yg;
import X.C2188811AlT;
import X.C334801Rq;
import X.C480460Ism;
import X.C919310a1x;
import X.C919770a2h;
import X.C931450aLX;
import X.C935480aS2;
import X.C935540aS8;
import X.C942270acz;
import X.C942390adB;
import X.C942410adD;
import X.C948300ami;
import X.C952930auB;
import X.C953600avG;
import X.C953610avH;
import X.C953620avI;
import X.C953660avM;
import X.C954140aw8;
import X.C973280bR0;
import X.EnumC937290aUx;
import X.EnumC952890au7;
import X.EnumC952940auC;
import X.EnumC953330aup;
import X.EnumC953380auu;
import X.InterfaceC1296230jpt;
import X.InterfaceC1631620sYq;
import X.InterfaceC1692950u9l;
import X.InterfaceC917550Zz7;
import X.InterfaceC937900aVw;
import Y.AfS109S0300000_15;
import Y.AfS184S0100000_15;
import android.animation.Animator;
import android.graphics.Bitmap;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.INoticeboardApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardCreateParams;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.model.PreviewEffect;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import tikcast.linkmic.common.MgTraceInfo;

/* JADX INFO: loaded from: classes16.dex */
public class AwS99S1200000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS99S1200000_15 awS99S1200000_15, Object obj) {
        String str;
        final Bitmap bitmap = (Bitmap) obj;
        final C931450aLX c931450aLX = (C931450aLX) awS99S1200000_15.l1;
        final C1295960jpS c1295960jpS = (C1295960jpS) awS99S1200000_15.l2;
        final String str2 = awS99S1200000_15.s0;
        c931450aLX.getClass();
        final boolean z = !Intrinsics.LJFF(str2, "IDEL");
        final boolean zLJFF = Intrinsics.LJFF(str2, "LOADING");
        if (c1295960jpS != null) {
            c1295960jpS.removeAllAnimatorListeners();
            c1295960jpS.removeAllLottieOnCompositionLoadedListener();
            c1295960jpS.cancelAnimation();
            c1295960jpS.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0HeS
                @Override // X.InterfaceC1296230jpt
                public final void LIZ(C1294720jnS c1294720jnS) {
                    C500260Jjc.LLFFF(c1295960jpS);
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        c1295960jpS.updateBitmap("user_Image.png", bitmap2);
                    }
                    if (z && zLJFF) {
                        c1295960jpS.setRepeatCount(-1);
                    } else {
                        c1295960jpS.setRepeatCount(0);
                    }
                    c1295960jpS.removeLottieOnCompositionLoadedListener(this);
                }
            });
            c1295960jpS.addAnimatorListener(new Animator.AnimatorListener() { // from class: X.0aLf
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    c1295960jpS.removeAllAnimatorListeners();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AnimationEnd， quickConnectAnimType = ");
                    sbLIZ.append(str2);
                    C20441214yg.LIZIZ("QuickConnectLottieHelper", C2188811AlT.LIZIZ(sbLIZ));
                    C931450aLX c931450aLX2 = c931450aLX;
                    String str3 = str2;
                    c931450aLX2.getClass();
                    int iHashCode = str3.hashCode();
                    if (iHashCode != 68795) {
                        if (iHashCode != 79219778) {
                            if (iHashCode == 1054633244 && str3.equals("LOADING")) {
                                c931450aLX2.LIZJ.onNext("END");
                                return;
                            }
                            return;
                        }
                        if (!str3.equals("START")) {
                            return;
                        }
                        c931450aLX2.LIZJ.onNext("LOADING");
                        return;
                    }
                    if (!str3.equals("END")) {
                        return;
                    }
                    c931450aLX2.LIZJ.onNext("IDEL");
                }
            });
        }
        int iHashCode = str2.hashCode();
        if (iHashCode != 68795) {
            if (iHashCode != 79219778) {
                if (iHashCode == 1054633244 && str2.equals("LOADING")) {
                    str = "ttlive_multiguest_quick_connect_loading_anim.zip";
                }
            } else {
                str2.equals("START");
            }
            str = "ttlive_multiguest_quick_connect_opening_anim.zip";
        } else if (str2.equals("END")) {
            str = "ttlive_multiguest_quick_connect_ending_anim.zip";
        } else {
            str = "ttlive_multiguest_quick_connect_opening_anim.zip";
        }
        C1143680frq.LJIIL(c1295960jpS, "tiktok_live_interaction_normal_2", str, "images", z, null, Boolean.FALSE, null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS99S1200000_15 awS99S1200000_15, Object obj) {
        return C935540aS8.LIZ((C935540aS8) obj, false, ((MultiGuestSharedBgAnchorViewModel) awS99S1200000_15.l1).BQ2(true), awS99S1200000_15.s0, ((LiveEffect) awS99S1200000_15.l2).LLJLLIL(), ((LiveEffect) awS99S1200000_15.l2).LJJ(), false, 67);
    }

    public static final Object invoke$2(AwS99S1200000_15 awS99S1200000_15, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("anchor resumeSharedBg, sharedBgUrl = ");
        sbLIZ.append(((LiveEffect) awS99S1200000_15.l1).LLJLLIL());
        sbLIZ.append(", download image success");
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
        C935480aS2 c935480aS2 = ((MultiGuestSharedBgAnchorViewModel) awS99S1200000_15.l2).LLILLL;
        if (c935480aS2 != null) {
            c935480aS2.LIZJ();
        }
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) awS99S1200000_15.l2;
        LiveEffect liveEffect = (LiveEffect) awS99S1200000_15.l1;
        multiGuestSharedBgAnchorViewModel.LLILLL = new C935480aS2(liveEffect, multiGuestSharedBgAnchorViewModel.LLILZ, true);
        multiGuestSharedBgAnchorViewModel.LLILLJJLI = liveEffect;
        multiGuestSharedBgAnchorViewModel.setState(new AwS55S1300000_15(multiGuestSharedBgAnchorViewModel, awS99S1200000_15.s0, liveEffect, downloadInfo, 0));
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r7 = new com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState(null, r19.s0, null, 0, 0, 0, 0, 0, 0, 0, 0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS99S1200000_15 r19, java.lang.Object r20) {
        /*
            r1 = r20
            X.01vd r1 = (X.C490701vd) r1
            java.util.List<com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState> r0 = r1.LLILLL
            r3 = r19
            java.lang.Object r6 = r3.l2
            com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel r6 = (com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel) r6
            java.util.Iterator r5 = r0.iterator()
        L10:
            boolean r0 = r5.hasNext()
            r4 = 0
            if (r0 == 0) goto L34
            java.lang.Object r7 = r5.next()
            r0 = r7
            com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState r0 = (com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState) r0
            java.lang.String r2 = r0.linkMicId
            com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility r0 = r6.LL
            if (r0 == 0) goto L2c
            com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo r0 = r0.G0()
            if (r0 == 0) goto L2c
            java.lang.String r4 = r0.linkMicId
        L2c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r4)
            if (r0 == 0) goto L10
            if (r7 != 0) goto L4a
        L34:
            com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState r7 = new com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState
            r8 = 0
            java.lang.String r9 = r3.s0
            r11 = 0
            r13 = 0
            r10 = r8
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r11
            r7.<init>(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19)
        L4a:
            java.lang.Object r0 = r3.l1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r6 = r0.invoke(r7)
            java.util.List<com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState> r0 = r1.LLILLL
            java.lang.String r5 = r3.s0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L5f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState r0 = (com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState) r0
            java.lang.String r0 = r0.linkMicId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L5f
            r4.add(r2)
            goto L5f
        L7a:
            java.util.List r5 = X.C13LP.LJLILLLLZI(r6, r4)
            r4 = 0
            r2 = 0
            r9 = 59
            r6 = r4
            r7 = r4
            r8 = r4
            r1 = r1
            X.01vd r0 = X.C490701vd.LIZ(r1, r2, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS99S1200000_15.invoke$3(kotlin.jvm.internal.AwS99S1200000_15, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS99S1200000_15 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS99S1200000_15.invoke$4(kotlin.jvm.internal.AwS99S1200000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS99S1200000_15 awS99S1200000_15, Object obj) {
        ((IEffectService) awS99S1200000_15.l1).getLiveEffectController().LIZLLL(Collections.singletonList(((PreviewEffect) awS99S1200000_15.l2).resourceId), new C020R(awS99S1200000_15.s0, (String) obj, (InterfaceC1631620sYq<? super String, ? super String, ? super List<String>, Unit>) 8));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS99S1200000_15 awS99S1200000_15, Object obj) {
        String str;
        Layout layout = (Layout) obj;
        C919770a2h c919770a2h = (C919770a2h) awS99S1200000_15.l1;
        c919770a2h.LIZIZ = layout;
        c919770a2h.LIZLLL = layout;
        InterfaceC937900aVw interfaceC937900aVw = (InterfaceC937900aVw) awS99S1200000_15.l2;
        if (interfaceC937900aVw != null && (str = awS99S1200000_15.s0) != null) {
            c919770a2h.LJJII(CastIntegerProtector.parseInt(str), interfaceC937900aVw);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS99S1200000_15 awS99S1200000_15, Object obj) {
        String str;
        InterfaceC1692950u9l interfaceC1692950u9l = (InterfaceC1692950u9l) obj;
        if (interfaceC1692950u9l.LIZLLL() && ((int) (interfaceC1692950u9l.LIZ() & 4294967295L)) > 0 && ((int) (interfaceC1692950u9l.LIZ() >> 32)) > 0 && !((Boolean) ((C05P0) awS99S1200000_15.l2).getValue()).booleanValue()) {
            if (((C948300ami) awS99S1200000_15.l1).LIZJ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            String str2 = awS99S1200000_15.s0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
            linkedHashMap.put("is_show_available_spot", str);
            linkedHashMap.put("from_page", str2);
            C942270acz.LIZ(linkedHashMap);
            C0KX4.LIZ("livesdk_multi_show_available_spot_show", linkedHashMap, null, true);
            ((C05P0) awS99S1200000_15.l2).setValue(Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS99S1200000_15 awS99S1200000_15, Object obj) {
        boolean z;
        long jLongValue;
        MgTraceInfo mgTraceInfoLIZ;
        int i;
        WeakReference<InterfaceC917550Zz7> weakReference;
        String str = (String) obj;
        C953610avH c953610avH = (C953610avH) awS99S1200000_15.l1;
        C953600avG c953600avG = (C953600avG) awS99S1200000_15.l2;
        String str2 = awS99S1200000_15.s0;
        c953610avH.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createNoticeBoardRequestAfterGetStreamId, statusOn=");
        sbLIZ.append(c953610avH.LJIIJJI);
        C20441214yg.LJIIIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ));
        if (c953610avH.LJIIJJI) {
            C952930auB.LIZ(EnumC952940auC.CREATE, EnumC953380auu.CREATE_OR_GET_AUX_STREAM, CardStruct.IStatusCode.DEFAULT, "");
            String str3 = c953600avG.LIZ;
            C19489311Mt c19489311Mt = new C19489311Mt();
            HashMap<String, C953660avM> map = c953610avH.LJ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            EnumC937290aUx enumC937290aUx = c953600avG.LIZJ;
            EnumC953330aup enumC953330aup = c953600avG.LIZLLL;
            if (c953600avG.LJ.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            map.put(str3, new C953660avM(jCurrentTimeMillis, 0, enumC937290aUx, enumC953330aup, z, new ArrayList(), c19489311Mt, c953600avG.LJIIIZ));
            C953660avM c953660avM = c953610avH.LJ.get(str3);
            if (c953660avM != null && (weakReference = c953600avG.LJFF) != null) {
                c953660avM.LJFF.add(weakReference);
            }
            if (c953600avG.LJII == EnumC952890au7.PLAYBOOK) {
                C953620avI.LJIIL(c953610avH.LJ, c953610avH.LIZLLL, c953600avG, c19489311Mt);
            }
            DataChannel dataChannel = c953610avH.LIZ;
            C11NJ c11nj = c953610avH.LIZLLL;
            boolean zLJIILL = c953610avH.LJIILL();
            C020F c020f = new C020F(c953600avG, c953610avH, str3, 1);
            C20441214yg.LJIIIZ("NoticeboardController", "createBoard");
            C480460Ism.LIZ().getClass();
            INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
            NoticeboardCreateParams noticeboardCreateParams = new NoticeboardCreateParams();
            noticeboardCreateParams.roomId = C954140aw8.LIZJ();
            noticeboardCreateParams.channelId = C954140aw8.LIZIZ();
            noticeboardCreateParams.linkmicId = str2;
            noticeboardCreateParams.streamId = str;
            noticeboardCreateParams.mediaNodeId = c953600avG.LIZ;
            noticeboardCreateParams.imagePath = c953600avG.LIZIZ;
            Long l = c953600avG.LJIIIIZZ;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            noticeboardCreateParams.noticeboardTemplateId = jLongValue;
            C334801Rq c334801Rq = c953600avG.LJIIJ;
            if (c334801Rq != null) {
                mgTraceInfoLIZ = C01IF.LIZ(c334801Rq);
            } else {
                mgTraceInfoLIZ = null;
            }
            noticeboardCreateParams.mgTraceInfo = mgTraceInfoLIZ;
            String str4 = c953600avG.LIZIZ;
            if (zLJIILL && (str4 == null || a0.LJJJIL(str4))) {
                i = 1;
            } else {
                i = 0;
            }
            noticeboardCreateParams.noticeboardMode = i;
            c11nj.LIZ(new C11QI(iNoticeboardApi.createNoticeboard(noticeboardCreateParams).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new AfS109S0300000_15(c020f, dataChannel, c953600avG, 9)).LJIIL(new AfS184S0100000_15(c020f, 67))).LJIILL().LJIIZILJ());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS99S1200000_15 awS99S1200000_15, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load file fail, linkMicId: ");
        sbLIZ.append(((C942410adD) awS99S1200000_15.l1).LIZ);
        sbLIZ.append(", resourceId: ");
        sbLIZ.append(awS99S1200000_15.s0);
        sbLIZ.append(", reason: ");
        sbLIZ.append((String) obj);
        C20441214yg.LJ("MultiGuestMicSeatEmojiPlayer", C2188811AlT.LIZIZ(sbLIZ));
        ((Function0) awS99S1200000_15.l2).invoke();
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS99S1200000_15(com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel r3, com.bytedance.android.livesdkapi.depend.model.LiveEffect r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 1 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.s0 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r5
            r1.l2 = r4
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS99S1200000_15.<init>(com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel, com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S1200000_15(C919770a2h c919770a2h, InterfaceC937900aVw interfaceC937900aVw, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c919770a2h;
        this.l2 = interfaceC937900aVw;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S1200000_15(C942410adD c942410adD, String str, C942390adB c942390adB, int i) {
        super(1);
        this.$t = i;
        this.l1 = c942410adD;
        this.s0 = str;
        this.l2 = c942390adB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS99S1200000_15(C948300ami c948300ami, C948300ami c948300ami2, String str, C05P0<Boolean> c05p0) {
        super(1);
        this.$t = c05p0;
        this.l1 = c948300ami;
        this.s0 = c948300ami2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S1200000_15(C953600avG c953600avG, C953610avH c953610avH, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c953610avH;
        this.l2 = c953600avG;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S1200000_15(C973280bR0 c973280bR0, String str, BattleComboInfo battleComboInfo, int i) {
        super(1);
        this.$t = i;
        this.l1 = c973280bR0;
        this.s0 = str;
        this.l2 = battleComboInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S1200000_15(C1295960jpS c1295960jpS, C931450aLX c931450aLX, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c931450aLX;
        this.l2 = c1295960jpS;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S1200000_15(IEffectService iEffectService, PreviewEffect previewEffect, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = iEffectService;
        this.l2 = previewEffect;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS99S1200000_15(String str, String str2, Function1<? super UserState, UserState> function1, LinkStatusViewModel linkStatusViewModel) {
        super(1);
        this.$t = linkStatusViewModel;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = function1;
    }
}
