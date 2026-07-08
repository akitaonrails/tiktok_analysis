package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.AbstractC1283560jVS;
import X.AbstractC1283580jVU;
import X.C1283590jVV;
import X.C1954807lC;
import X.C1CXJ;
import X.C1CY7;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes35.dex */
public class LinkMicMultiLinker extends AbstractC1283560jVS {
    private final native void MoltenFfiNativeAddUserX5605790896614023045(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeAppDidBecomeActiveX7988945083519851975(long j);

    private final native void MoltenFfiNativeAppDidEnterBackgroundX1724291357795596025(long j);

    private final native void MoltenFfiNativeAppWillEnterForegroundX2728383963555728814(long j);

    private final native void MoltenFfiNativeAppWillResignActiveX4335170002417371197(long j);

    private final native void MoltenFfiNativeApplyViewerSingX7025799460959586386(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeApplyX4963363652242848787(long j, ByteBuffer byteBuffer);

    private final native boolean MoltenFfiNativeAudioOccupiedChangeX7822730615516336070(long j, boolean z, String str);

    private final native long MoltenFfiNativeAvatarIdX7651129778963460979(long j, String str);

    private final native void MoltenFfiNativeCancelApplyX1397014407970133398(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeCancelInviteX5921245631428383747(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeCancelViewerSingX6079966530242801620(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeChangeLayoutV2X5121863327697316794(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeChangeLayoutX4345716394581630877(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeChangeLocalAudioMuteX595054063204435096(long j, boolean z, String str);

    private final native void MoltenFfiNativeChangeLocalAudioOccupiedX4458278318303329552(long j, boolean z);

    private final native void MoltenFfiNativeChangeLocalAudioStateX3170568512821253926(long j, long j2, boolean z, String str);

    private final native void MoltenFfiNativeChangeLocalOnlineUserStateX6955584615052560146(long j, long j2);

    private final native void MoltenFfiNativeChangeLocalVideoMuteX7621237082313634576(long j, boolean z, String str);

    private final native void MoltenFfiNativeClearAllStatesX1100711299255650228(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeClearMemoryX5488357864036470341(long j);

    private final native ByteBuffer MoltenFfiNativeCompensateInnerArchImX2696357502533171511(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeContentPositionListX2629783322342272740(long j);

    private final native void MoltenFfiNativeCreateChannelX4445456992343757426(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeDisposeX6869354892757304123(long j);

    private final native void MoltenFfiNativeFetchCrossAllStateFromServerX7276152119682689986(long j);

    private final native void MoltenFfiNativeFetchNewestStateFromServerX3546077229783425842(long j);

    private final native void MoltenFfiNativeFinishChannelX7449934566561143215(long j, ByteBuffer byteBuffer);

    private final native long MoltenFfiNativeFloatPositionWithLinkMicIdX3754248613578850812(long j, String str);

    private final native ByteBuffer MoltenFfiNativeGenerateSeiFromRustLayoutX3679094237390661376(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeGenerateSeiX4945997138097209920(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeGenerateVoiceChatSeiX2642951554762605191(long j, ByteBuffer byteBuffer);

    private final native String MoltenFfiNativeGetCurrentRtcReportStatusX773606191034251694(long j);

    private final native ByteBuffer MoltenFfiNativeGetCurrentStateX3542471672691911446(long j);

    private final native long MoltenFfiNativeGetPositionWithLinkMicIdX7172637000897554893(long j, String str);

    private final native ByteBuffer MoltenFfiNativeGetRtcDispatcherX786990414821054195(long j);

    private final native String MoltenFfiNativeGetRustVersionX5492030950148102168(long j);

    private final native String MoltenFfiNativeGetSessionIdX602762118930546801(long j);

    private final native ByteBuffer MoltenFfiNativeGetUiPositionsX7112765902940989017(long j);

    private final native ByteBuffer MoltenFfiNativeGetUserByLinkMicIdX6601214348808831511(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeGetUserByUidX3809604173256673576(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeInnerAppliedListX2093167299584388270(long j);

    private final native ByteBuffer MoltenFfiNativeInnerInvitedListX6131885049783915379(long j);

    private final native ByteBuffer MoltenFfiNativeInnerWaitingListX8083002811418236441(long j);

    private final native ByteBuffer MoltenFfiNativeInviteOperatorX1493013496292950771(long j);

    private final native void MoltenFfiNativeInviteX3840428485527545309(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeInvitorX6312200983937560576(long j);

    private final native boolean MoltenFfiNativeIsAudioMuteX6369242868893993565(long j, String str);

    private final native boolean MoltenFfiNativeIsAudioOccupiedX530352675876136379(long j, String str);

    private final native boolean MoltenFfiNativeIsInResumeLinkedLinkMicIdListX8593657555177240351(long j, String str);

    private final native boolean MoltenFfiNativeIsVideoMuteX7516229193069562648(long j, String str, boolean z);

    private final native void MoltenFfiNativeJoinChannelAfterPermitImX1921818614997762254(long j);

    private final native void MoltenFfiNativeJoinDirectX6443742513171201183(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeJoinRtcChannelX3652978002931794810(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeKickoutAllGuestsX8393998457464306342(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeKickoutX2593852766684901898(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeLeaveX7784816608497289058(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeLinkMicPositionArrayX2987991181438459267(long j);

    private final native ByteBuffer MoltenFfiNativeLinkedListInCurrentRoomX8449776891822366605(long j);

    private final native ByteBuffer MoltenFfiNativeLinkedListX4378967980509338353(long j);

    private final native long MoltenFfiNativeLinkedUserSizeX2055406646548498827(long j);

    private final native void MoltenFfiNativeLivePageWillAppearX9026564268112903724(long j);

    private final native void MoltenFfiNativeLivePageWillDisappearX3484817640645103665(long j);

    private final native void MoltenFfiNativeMarkAddRtcViewWithLinkMicIdX1866613590288457606(long j, ByteBuffer byteBuffer);

    private final native long MoltenFfiNativeMaxPositionX926312942473887226(long j);

    private final native void MoltenFfiNativeModeratorCancelInviteX4628228891431871065(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeModeratorInviteX6973716674497110061(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeModeratorKickoutX965095226790792975(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeModeratorPermitX8273950169885051095(long j, ByteBuffer byteBuffer);

    private final native boolean MoltenFfiNativeMuteAudioX1366597062045019297(long j, boolean z, String str);

    private final native boolean MoltenFfiNativeMuteVideoX9059332311578819882(long j, boolean z, String str);

    private final native void MoltenFfiNativeOnSeiReceivedX3783359380694086633(long j, String str);

    private final native boolean MoltenFfiNativeOnlineUserStateChangeX6181993046958456803(long j, int i, String str);

    private final native int MoltenFfiNativeOnlineUserStateX8832890082162187724(long j, String str);

    private final native void MoltenFfiNativePermitViewerSingX8678992107210429847(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativePermitX1995631721786506064(long j, ByteBuffer byteBuffer);

    private final native long MoltenFfiNativePositionWithContentIdX8894893907631387463(long j, String str);

    private final native ByteBuffer MoltenFfiNativeReceivedFirstFrameLinkMicIdSetX5723025468614908557(long j);

    private final native void MoltenFfiNativeReleaseLiveCoreX7199350775602102085(long j);

    private final native void MoltenFfiNativeReplyX5046499432808671959(long j, ByteBuffer byteBuffer);

    private final native long MoltenFfiNativeReportAudioVolumeIndicationX3228839509165861305(long j, double d, long j2);

    private final native void MoltenFfiNativeResumeX2021923284159475537(long j, ByteBuffer byteBuffer);

    private final native int MoltenFfiNativeRtcConnectionStateX4838830651161310865(long j, String str);

    private final native ByteBuffer MoltenFfiNativeRtcResolutionSizeX2775517814199762122(long j);

    private final native long MoltenFfiNativeRtcRoomIdX4867286838526933343(long j);

    private final native ByteBuffer MoltenFfiNativeSeiLinkedListInCurrentRoomX752801667417428237(long j);

    private final native ByteBuffer MoltenFfiNativeSeiLinkedListX1049500119585998043(long j);

    private final native ByteBuffer MoltenFfiNativeSelfLinkMicIdX8186490278915302661(long j);

    private final native ByteBuffer MoltenFfiNativeSelfUserX2041987796644318528(long j);

    private final native void MoltenFfiNativeSendPositionSyncRtcMessageX5797149609602243136(long j);

    private final native void MoltenFfiNativeSetChannelIdX5349286428618649279(long j, long j2);

    private final native void MoltenFfiNativeSetRtcRoomIdX5842961237516730500(long j, long j2);

    private final native boolean MoltenFfiNativeSimulcastEnableAllX8444864405606610782(long j);

    private final native ByteBuffer MoltenFfiNativeSpeakerInfoListX2655237462654038307(long j);

    private final native void MoltenFfiNativeStartInteractX8777900853102277028(long j);

    private final native void MoltenFfiNativeStartPushDataX4231017035659743015(long j);

    private final native void MoltenFfiNativeStopInteractX4820095336720998020(long j, int i);

    private final native void MoltenFfiNativeSyncMuteLocalAudioX592688593127074147(long j, boolean z, String str);

    private final native ByteBuffer MoltenFfiNativeUpdateAvatarStateX7742665055069551804(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeUpdateGroupChannelIdLinkerModeX2755820220729190222(long j, long j2, long j3, int i);

    private final native void MoltenFfiNativeUpdateInnerSettingsX5999633527691916179(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeUpdateLocalFloatPositionX3637967058429302176(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeUpdateRtcVideoResolutionX7272188033558713134(long j);

    private final native void MoltenFfiNativeUpdateSeiLinkedListX2936713991769427196(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeWaitingFirstFrameLinkMicIdSetX7893241968369751064(long j);

    public static final native void molten_ffi_link_mic_sdk_LinkMicMultiLinker_free(long j);

    @Override // X.AbstractC1283560jVS
    public final void LIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            molten_ffi_link_mic_sdk_LinkMicMultiLinker_free(((C1283590jVV) abstractC1283580jVU).LIZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r3 = r0.get()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L89
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6b
            java.util.concurrent.atomic.AtomicLong r2 = r7.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L0
            X.0jVU r1 = r7.LL     // Catch: java.lang.Throwable -> L59
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L3b
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L59
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L59
            r7.MoltenFfiNativeAppDidBecomeActiveX7988945083519851975(r0)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L3a
            r7.LIZ()
        L3a:
            return
        L3b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L59
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L59
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L59
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L59
            throw r2     // Catch: java.lang.Throwable -> L59
        L59:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L6a
            r7.LIZ()
        L6a:
            throw r3
        L6b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L89:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LIZIZ():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r3 = r0.get()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L89
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6b
            java.util.concurrent.atomic.AtomicLong r2 = r7.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L0
            X.0jVU r1 = r7.LL     // Catch: java.lang.Throwable -> L59
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L3b
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L59
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L59
            r7.MoltenFfiNativeAppDidEnterBackgroundX1724291357795596025(r0)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L3a
            r7.LIZ()
        L3a:
            return
        L3b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L59
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L59
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L59
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L59
            throw r2     // Catch: java.lang.Throwable -> L59
        L59:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L6a
            r7.LIZ()
        L6a:
            throw r3
        L6b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L89:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LIZLLL():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C968980bK4> LJJJJ() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJJJJ():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJL() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r3 = r0.get()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L89
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6b
            java.util.concurrent.atomic.AtomicLong r2 = r7.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L0
            X.0jVU r1 = r7.LL     // Catch: java.lang.Throwable -> L59
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L3b
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L59
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L59
            r7.MoltenFfiNativeDisposeX6869354892757304123(r0)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L3a
            r7.LIZ()
        L3a:
            return
        L3b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L59
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L59
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L59
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L59
            throw r2     // Catch: java.lang.Throwable -> L59
        L59:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L6a
            r7.LIZ()
        L6a:
            throw r3
        L6b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L89:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJJJJJL():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLL() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r3 = r0.get()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L89
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6b
            java.util.concurrent.atomic.AtomicLong r2 = r7.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L0
            X.0jVU r1 = r7.LL     // Catch: java.lang.Throwable -> L59
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L3b
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L59
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L59
            r7.MoltenFfiNativeFetchCrossAllStateFromServerX7276152119682689986(r0)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L3a
            r7.LIZ()
        L3a:
            return
        L3b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L59
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L59
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L59
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L59
            throw r2     // Catch: java.lang.Throwable -> L59
        L59:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L6a
            r7.LIZ()
        L6a:
            throw r3
        L6b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L89:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJJJLL():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C967830bID LJJLIIIJL() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJJLIIIJL():X.0bID");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher LJJLIIJ() {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJJLIIJ():com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LJJZ() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJJZ():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LJL() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJL():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LJLIIIL() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJLIIIL():java.util.List");
    }

    public final long LJLJI() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            return ((C1283590jVV) abstractC1283580jVU).LIZ;
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bb, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C968340bJ2> LLIIIL() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLIIIL():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LLIILII() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLIILII():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LLIILZL() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLIILZL():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LLIZLLLIL() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLIZLLLIL():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJI() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r3 = r0.get()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L89
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6b
            java.util.concurrent.atomic.AtomicLong r2 = r7.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L0
            X.0jVU r1 = r7.LL     // Catch: java.lang.Throwable -> L59
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L3b
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L59
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L59
            r7.MoltenFfiNativeStartPushDataX4231017035659743015(r0)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L3a
            r7.LIZ()
        L3a:
            return
        L3b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L59
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L59
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L59
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L59
            throw r2     // Catch: java.lang.Throwable -> L59
        L59:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L6a
            r7.LIZ()
        L6a:
            throw r3
        L6b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L89:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLJI():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJILLL() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r3 = r0.get()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L89
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6b
            java.util.concurrent.atomic.AtomicLong r2 = r7.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L0
            X.0jVU r1 = r7.LL     // Catch: java.lang.Throwable -> L59
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L3b
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L59
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L59
            r7.MoltenFfiNativeUpdateRtcVideoResolutionX7272188033558713134(r0)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L3a
            r7.LIZ()
        L3a:
            return
        L3b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L59
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L59
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L59
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L59
            throw r2     // Catch: java.lang.Throwable -> L59
        L59:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L6a
            r7.LIZ()
        L6a:
            throw r3
        L6b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L89:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLJILLL():void");
    }

    public final String LJJLIL() {
        return MoltenFfiNativeGetRustVersionX5492030950148102168(LJLJI());
    }

    public final long LLIIZ() {
        return MoltenFfiNativeLinkedUserSizeX2055406646548498827(LJLJI());
    }

    public final boolean LLJ() {
        return MoltenFfiNativeSimulcastEnableAllX8444864405606610782(LJLJI());
    }

    public LinkMicMultiLinker(C1283590jVV c1283590jVV) {
        super(c1283590jVV);
    }

    public final void LJJIL(long j) {
        MoltenFfiNativeChangeLocalOnlineUserStateX6955584615052560146(LJLJI(), j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJ(java.lang.String r9) {
        /*
            r8 = this;
            X.1CH4 r1 = new X.1CH4
            r1.<init>(r9)
            com.squareup.wire.ProtoAdapter<X.1CH4> r0 = X.C1CH4.ADAPTER
            int r0 = r0.encodedSize(r1)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r1.encode(r0)
        L17:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L82
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L17
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L70
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L52
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L70
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L70
            r8.MoltenFfiNativeClearAllStatesX1100711299255650228(r0, r5)     // Catch: java.lang.Throwable -> L70
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L51
            r8.LIZ()
        L51:
            return
        L52:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L70
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L70
            r1.append(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L70
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L70
            throw r2     // Catch: java.lang.Throwable -> L70
        L70:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L70
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L81
            r8.LIZ()
        L81:
            throw r3
        L82:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La0:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJJJ(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C967180bHA LJJLL(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJJLL(java.lang.String):X.0bHA");
    }

    public final boolean LJLJL(String str) {
        return MoltenFfiNativeIsAudioMuteX6369242868893993565(LJLJI(), str);
    }

    public final C1CXJ LLILLIZIL(String str) {
        int iMoltenFfiNativeOnlineUserStateX8832890082162187724 = MoltenFfiNativeOnlineUserStateX8832890082162187724(LJLJI(), str);
        C1CXJ.Companion.getClass();
        return C1CY7.LIZ(iMoltenFfiNativeOnlineUserStateX8832890082162187724);
    }

    public final long LLILZ(String str) {
        return MoltenFfiNativePositionWithContentIdX8894893907631387463(LJLJI(), str);
    }

    public final void LLJIJIL(boolean z) {
        MoltenFfiNativeSyncMuteLocalAudioX592688593127074147(LJLJI(), z, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJILJIL(boolean r9) {
        /*
            r8 = this;
            X.1CCu r1 = new X.1CCu
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1.<init>(r0)
            com.squareup.wire.ProtoAdapter<X.1CCu> r0 = X.C2226621CCu.ADAPTER
            int r0 = r0.encodedSize(r1)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r1.encode(r0)
        L1b:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La4
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L86
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1b
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L74
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L56
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L74
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L74
            r8.MoltenFfiNativeUpdateInnerSettingsX5999633527691916179(r0, r5)     // Catch: java.lang.Throwable -> L74
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L55
            r8.LIZ()
        L55:
            return
        L56:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L74
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L74
            r1.append(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L74
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L74
            throw r2     // Catch: java.lang.Throwable -> L74
        L74:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L74
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L85
            r8.LIZ()
        L85:
            throw r3
        L86:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La4:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLJILJIL(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJILJILJ(java.util.List<java.lang.String> r9) {
        /*
            r8 = this;
            X.1C2J r1 = new X.1C2J
            r1.<init>(r9)
            com.squareup.wire.ProtoAdapter<X.1C2J> r0 = X.C1C2J.ADAPTER
            int r0 = r0.encodedSize(r1)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r1.encode(r0)
        L17:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L82
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L17
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L70
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L52
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L70
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L70
            r8.MoltenFfiNativeUpdateLocalFloatPositionX3637967058429302176(r0, r5)     // Catch: java.lang.Throwable -> L70
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L51
            r8.LIZ()
        L51:
            return
        L52:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L70
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L70
            r1.append(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L70
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L70
            throw r2     // Catch: java.lang.Throwable -> L70
        L70:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L70
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L81
            r8.LIZ()
        L81:
            throw r3
        L82:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La0:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLJILJILJ(java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJ(java.util.List<X.C967180bHA> r9) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLJJ(java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C969290bKZ r9, X.InterfaceC968200bIo r10) {
        /*
            r8 = this;
            X.1CgJ r2 = new X.1CgJ
            X.1CgP r1 = r9.LIZ()
            X.1CIG r0 = X.C2231651CWd.LJIIIZ(r10)
            r2.<init>(r1, r0)
            com.squareup.wire.ProtoAdapter<X.1CgJ> r0 = X.C2236571CgJ.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1f:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8a
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1f
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L78
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L78
            r8.MoltenFfiNativeApplyX4963363652242848787(r0, r5)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            r8.LIZ()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L78
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L89
            r8.LIZ()
        L89:
            throw r3
        L8a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJFF(X.0bKZ, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C969290bKZ r9, java.lang.String r10) {
        /*
            r8 = this;
            X.1CgP r2 = r9.LIZ()
            X.1CgM r1 = new X.1CgM
            r0 = 0
            r1.<init>(r2, r10, r0)
            com.squareup.wire.ProtoAdapter<X.1CgM> r0 = X.C2236601CgM.ADAPTER
            int r0 = r0.encodedSize(r1)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r1.encode(r0)
        L1c:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La5
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L87
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1c
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L75
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L57
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L75
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L75
            r8.MoltenFfiNativeApplyViewerSingX7025799460959586386(r0, r5)     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L56
            r8.LIZ()
        L56:
            return
        L57:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L75
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L75
            r1.append(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L75
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L75
            throw r2     // Catch: java.lang.Throwable -> L75
        L75:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L86
            r8.LIZ()
        L86:
            throw r3
        L87:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La5:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJI(X.0bKZ, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C2227521CGg r9, X.InterfaceC968200bIo r10) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJII(X.1CGg, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(X.C2231451CVj r9, X.InterfaceC968200bIo r10) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJIILL(X.1CVj, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(X.C2227521CGg r9, java.lang.String r10) {
        /*
            r8 = this;
            X.1CGe r2 = r9.LIZ()
            X.1CIk r1 = new X.1CIk
            r0 = 0
            r1.<init>(r2, r10, r0)
            com.squareup.wire.ProtoAdapter<X.1CIk> r0 = X.C2228081CIk.ADAPTER
            int r0 = r0.encodedSize(r1)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r1.encode(r0)
        L1c:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La5
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L87
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1c
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L75
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L57
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L75
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L75
            r8.MoltenFfiNativeCancelViewerSingX6079966530242801620(r0, r5)     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L56
            r8.LIZ()
        L56:
            return
        L57:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L75
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L75
            r1.append(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L75
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L75
            throw r2     // Catch: java.lang.Throwable -> L75
        L75:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L86
            r8.LIZ()
        L86:
            throw r3
        L87:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La5:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJIILLIIL(X.1CGg, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(X.C2234011CcB r9, X.InterfaceC968200bIo r10) {
        /*
            r8 = this;
            X.1CfU r2 = new X.1CfU
            X.1CfX r1 = r9.LIZ()
            X.1CIG r0 = X.C2231651CWd.LJIIIZ(r10)
            r2.<init>(r1, r0)
            com.squareup.wire.ProtoAdapter<X.1CfU> r0 = X.C2236061CfU.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1f:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8a
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1f
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L78
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L78
            r8.MoltenFfiNativeChangeLayoutX4345716394581630877(r0, r5)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            r8.LIZ()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L78
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L89
            r8.LIZ()
        L89:
            throw r3
        L8a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJIIZILJ(X.1CcB, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(X.C2234011CcB r9, X.InterfaceC968200bIo r10) {
        /*
            r8 = this;
            X.1CfU r2 = new X.1CfU
            X.1CfX r1 = r9.LIZ()
            X.1CIG r0 = X.C2231651CWd.LJIIIZ(r10)
            r2.<init>(r1, r0)
            com.squareup.wire.ProtoAdapter<X.1CfU> r0 = X.C2236061CfU.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1f:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8a
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1f
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L78
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L78
            r8.MoltenFfiNativeChangeLayoutV2X5121863327697316794(r0, r5)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            r8.LIZ()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L78
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L89
            r8.LIZ()
        L89:
            throw r3
        L8a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJIJJ(X.1CcB, X.0bIo):void");
    }

    public final void LJIJJLI(String str, boolean z) {
        MoltenFfiNativeChangeLocalAudioMuteX595054063204435096(LJLJI(), z, str);
    }

    public final void LJJIZ(String str, boolean z) {
        MoltenFfiNativeChangeLocalVideoMuteX7621237082313634576(LJLJI(), z, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJ(X.C972290bPP r9, X.InterfaceC968200bIo r10) {
        /*
            r8 = this;
            X.1Cfj r2 = new X.1Cfj
            X.1Cfm r1 = r9.LIZ()
            X.1CIG r0 = X.C2231651CWd.LJIIIZ(r10)
            r2.<init>(r1, r0)
            com.squareup.wire.ProtoAdapter<X.1Cfj> r0 = X.C2236211Cfj.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1f:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8a
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1f
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L78
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L78
            r8.MoltenFfiNativeCreateChannelX4445456992343757426(r0, r5)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            r8.LIZ()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L78
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L89
            r8.LIZ()
        L89:
            throw r3
        L8a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJJJJJ(X.0bPP, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJZ(X.C2234021CcC r9, X.InterfaceC968200bIo r10) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJJJZ(X.1CcC, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1AZI LJJL(java.util.List<X.C2183391Acj> r9, X.C1AZQ r10) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJJL(java.util.List, X.1AZQ):X.1AZI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dd, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00df, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1AZI LJJLIIIJ(java.util.List<X.C2183391Acj> r9, X.C1AZR r10) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJJLIIIJ(java.util.List, X.1AZR):X.1AZI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJLL(X.C920810a4N r9, X.InterfaceC968200bIo r10) {
        /*
            r8 = this;
            X.1Cf6 r2 = new X.1Cf6
            X.1Cf9 r1 = r9.LIZ()
            X.1CIG r0 = X.C2231651CWd.LJIIIZ(r10)
            r2.<init>(r1, r0)
            com.squareup.wire.ProtoAdapter<X.1Cf6> r0 = X.C2235821Cf6.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1f:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8a
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1f
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L78
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L78
            r8.MoltenFfiNativeInviteX3840428485527545309(r0, r5)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            r8.LIZ()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L78
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L89
            r8.LIZ()
        L89:
            throw r3
        L8a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJLJJLL(X.0a4N, X.0bIo):void");
    }

    public final boolean LJLZ(String str, boolean z) {
        return MoltenFfiNativeIsVideoMuteX7516229193069562648(LJLJI(), str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZI(X.C969280bKY r9, X.InterfaceC968200bIo r10) {
        /*
            r8 = this;
            X.1Cfg r2 = new X.1Cfg
            X.1CgS r1 = r9.LIZ()
            X.1CIG r0 = X.C2231651CWd.LJIIIZ(r10)
            r2.<init>(r1, r0)
            com.squareup.wire.ProtoAdapter<X.1Cfg> r0 = X.C2236181Cfg.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1f:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8a
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1f
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L78
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L78
            r8.MoltenFfiNativeJoinDirectX6443742513171201183(r0, r5)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            r8.LIZ()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L78
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L89
            r8.LIZ()
        L89:
            throw r3
        L8a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LJZI(X.0bKY, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLI(X.C968750bJh r9, X.InterfaceC968200bIo r10) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLI(X.0bJh, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIFFJFJJ(X.C968530bJL r9, X.InterfaceC968200bIo r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLIFFJFJJ(X.0bJL, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIIJ(X.C1CKR r9, X.InterfaceC968200bIo r10) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLIIIJ(X.1CKR, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIL(X.C2231451CVj r9, X.InterfaceC968200bIo r10) {
        /*
            r8 = this;
            X.1CIe r2 = new X.1CIe
            X.1CGk r1 = r9.LIZ()
            X.1CIG r0 = X.C2231651CWd.LJIIIZ(r10)
            r2.<init>(r1, r0)
            com.squareup.wire.ProtoAdapter<X.1CIe> r0 = X.C2228021CIe.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1f:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8a
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1f
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L78
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L78
            r8.MoltenFfiNativeModeratorCancelInviteX4628228891431871065(r0, r5)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            r8.LIZ()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L78
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L89
            r8.LIZ()
        L89:
            throw r3
        L8a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLIL(X.1CVj, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILII(X.C920810a4N r9, X.InterfaceC968200bIo r10) {
        /*
            r8 = this;
            X.1Cf6 r2 = new X.1Cf6
            X.1Cf9 r1 = r9.LIZ()
            X.1CIG r0 = X.C2231651CWd.LJIIIZ(r10)
            r2.<init>(r1, r0)
            com.squareup.wire.ProtoAdapter<X.1Cf6> r0 = X.C2235821Cf6.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1f:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8a
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1f
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L78
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L78
            r8.MoltenFfiNativeModeratorInviteX6973716674497110061(r0, r5)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            r8.LIZ()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L78
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L89
            r8.LIZ()
        L89:
            throw r3
        L8a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLILII(X.0a4N, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILIL(X.C968750bJh r9, X.InterfaceC968200bIo r10) {
        /*
            r8 = this;
            X.1CPV r2 = new X.1CPV
            X.1CPQ r1 = r9.LIZ()
            X.1CIG r0 = X.C2231651CWd.LJIIIZ(r10)
            r2.<init>(r1, r0)
            com.squareup.wire.ProtoAdapter<X.1CPV> r0 = X.C1CPV.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1f:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8a
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1f
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L78
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L78
            r8.MoltenFfiNativeModeratorKickoutX965095226790792975(r0, r5)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            r8.LIZ()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L78
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L89
            r8.LIZ()
        L89:
            throw r3
        L8a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLILIL(X.0bJh, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILL(X.C969130bKJ r9, X.InterfaceC968200bIo r10) {
        /*
            r8 = this;
            X.1Cg7 r2 = new X.1Cg7
            X.1CgD r1 = r9.LIZ()
            X.1CIG r0 = X.C2231651CWd.LJIIIZ(r10)
            r2.<init>(r1, r0)
            com.squareup.wire.ProtoAdapter<X.1Cg7> r0 = X.C2236451Cg7.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1f:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8a
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1f
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L78
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L78
            r8.MoltenFfiNativeModeratorPermitX8273950169885051095(r0, r5)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            r8.LIZ()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L78
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L89
            r8.LIZ()
        L89:
            throw r3
        L8a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLILL(X.0bKJ, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILLJJLI(X.C969130bKJ r9, X.InterfaceC968200bIo r10) {
        /*
            r8 = this;
            X.1Cg7 r2 = new X.1Cg7
            X.1CgD r1 = r9.LIZ()
            X.1CIG r0 = X.C2231651CWd.LJIIIZ(r10)
            r2.<init>(r1, r0)
            com.squareup.wire.ProtoAdapter<X.1Cg7> r0 = X.C2236451Cg7.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1f:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8a
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1f
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L78
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L78
            r8.MoltenFfiNativePermitX1995631721786506064(r0, r5)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            r8.LIZ()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L78
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L89
            r8.LIZ()
        L89:
            throw r3
        L8a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLILLJJLI(X.0bKJ, X.0bIo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILLL(X.C969130bKJ r9, java.lang.String r10) {
        /*
            r8 = this;
            X.1CgD r2 = r9.LIZ()
            X.1CgA r1 = new X.1CgA
            r0 = 0
            r1.<init>(r2, r10, r0)
            com.squareup.wire.ProtoAdapter<X.1CgA> r0 = X.C2236481CgA.ADAPTER
            int r0 = r0.encodedSize(r1)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r1.encode(r0)
        L1c:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La5
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L87
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1c
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L75
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L57
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L75
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L75
            r8.MoltenFfiNativePermitViewerSingX8678992107210429847(r0, r5)     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L56
            r8.LIZ()
        L56:
            return
        L57:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L75
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L75
            r1.append(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L75
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L75
            throw r2     // Catch: java.lang.Throwable -> L75
        L75:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L86
            r8.LIZ()
        L86:
            throw r3
        L87:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La5:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLILLL(X.0bKJ, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILZIL(X.C969140bKK r9, X.InterfaceC968200bIo r10) {
        /*
            r8 = this;
            X.1Cfs r2 = new X.1Cfs
            X.1Cfv r1 = r9.LIZ()
            X.1CIG r0 = X.C2231651CWd.LJIIIZ(r10)
            r2.<init>(r1, r0)
            com.squareup.wire.ProtoAdapter<X.1Cfs> r0 = X.C2236301Cfs.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1f:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8a
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1f
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L78
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L78
            r8.MoltenFfiNativeReplyX5046499432808671959(r0, r5)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            r8.LIZ()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L78
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L89
            r8.LIZ()
        L89:
            throw r3
        L8a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLILZIL(X.0bKK, X.0bIo):void");
    }

    public final void LLILZLL(double d, long j) {
        MoltenFfiNativeReportAudioVolumeIndicationX3228839509165861305(LJLJI(), d, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIZ(X.C968590bJR r9, X.InterfaceC968200bIo r10) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLIZ(X.0bJR, X.0bIo):void");
    }

    public final void LJJ(long j, String str, boolean z) {
        MoltenFfiNativeChangeLocalAudioStateX3170568512821253926(LJLJI(), j, z, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFFF(boolean r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker.LLFFF(boolean, boolean, boolean):void");
    }
}
