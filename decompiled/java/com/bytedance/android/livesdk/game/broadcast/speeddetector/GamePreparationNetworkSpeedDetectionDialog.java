package com.bytedance.android.livesdk.game.broadcast.speeddetector;

import X.C01GW;
import X.C0TKK;
import X.C0UWJ;
import X.C0UWK;
import X.C1119170fEJ;
import X.C1119920fFW;
import X.C11JF;
import X.C1338270kvh;
import X.C1602160rnK;
import X.C16F5;
import X.C16FS;
import X.C1954807lC;
import X.C20483915Dh;
import X.C452501pT;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C751090TdD;
import X.C758170Tod;
import X.C773730UWt;
import X.C786410Ut5;
import X.EnumC776480Ud4;
import X.EnumC779450Uhr;
import X.InterfaceC776660UdM;
import X.ViewOnClickListenerC1836610xtT;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationNetworkSpeedDetectionDialogAlive;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationPageDestroyEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.GamePreparationManualSpeedTestStartEvent;
import com.bytedance.android.livesdk.dataChannel.SuggestedDefinitionByManuallySpeedDetection;
import com.bytedance.android.livesdk.game.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog;
import com.bytedance.android.livesdk.livesetting.game.TtliveGameEnableCategoryGearsSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS296S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GamePreparationNetworkSpeedDetectionDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyOzFiOj82LSEoHELIOSLDs2KzEjO2EUKSgpGT02OCQ+KDs6JysCLDskJzcnGj82LSEILDs2KzElJiEXISQgJig=";
    public AnimatorSet LLJLLL;
    public Animator LLJZ;
    public C11JF LLJZIJLIL;
    public C16F5 LLL;
    public AppCompatImageView LLLF;
    public C16F5 LLLFF;
    public C16FS LLLFFI;
    public C16FS LLLFZ;
    public ViewOnClickListenerC1836610xtT LLLI;
    public long LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIL;
    public final C751090TdD LLLIL;
    public final BPEAHandler LLLII = new BPEAHandler(Looper.getMainLooper());
    public int LLLIIIL = -1;
    public final C01GW LLLIILIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(129));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131844530));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C758170Tod(R.attr.d33, new ACListenerS147S0100000_12(this, 197)));
        c1119170fEJ.LJ = arrayList;
        c1119170fEJ.LIZLLL = this.LLLIL;
        return c1119170fEJ;
    }

    public final boolean uS() {
        return ((Boolean) this.LLLIILIL.getValue()).booleanValue();
    }

    public final void yS() {
        AnimatorSet animatorSet = this.LLJLLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJLLL = null;
        Animator animator = this.LLJZ;
        if (animator != null) {
            animator.cancel();
        }
        this.LLJZ = null;
    }

    public GamePreparationNetworkSpeedDetectionDialog() {
        C751090TdD c751090TdD = new C751090TdD();
        c751090TdD.LIZIZ = C497740JfY.LJIJI(2131844536);
        c751090TdD.LIZJ = false;
        c751090TdD.LIZLLL = new ACListenerS147S0100000_12(this, 200);
        this.LLLIL = c751090TdD;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        super.onDestroy();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(GamePreparationNetworkSpeedDetectionDialogAlive.class, Boolean.FALSE);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        yS();
        C11JF c11jf = this.LLJZIJLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        if (C773730UWt.LJIIIZ() && !this.LLLIIL) {
            PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LLILZ.gg0(BroadcastShareScreenDefinition.class);
            if (quality == null || (str = quality.sdkKey) == null) {
                str = "";
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(uS()))) {
                C0UWK.LIZ(-1, "cancelled", "exit_test_page", (jCurrentTimeMillis - this.LLLIIII) / ((long) LSPassThroughRecordSizeConfig.DEFAULT), str, "", "");
            }
        }
        C0UWJ c0uwj = C0UWJ.DisconnectTypeManuallyDetectionCloseDialog;
        C773730UWt.LIZ(c0uwj.getCode(), c0uwj.getMessage(), EnumC779450Uhr.SCENE_TIKTOK_GAME_LIVE_MANUAL);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(GamePreparationNetworkSpeedDetectionDialogAlive.class, Boolean.TRUE);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("enter_from");
        } else {
            i = -1;
        }
        this.LLLIIIL = i;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public final void wS(long j) {
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = this.LLLI;
        if (viewOnClickListenerC1836610xtT != null) {
            viewOnClickListenerC1836610xtT.LIZLLL();
        }
        C16FS c16fs = this.LLLFZ;
        if (c16fs != null) {
            c16fs.setEnabled(false);
        }
        C16F5 c16f5 = this.LLLFF;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131844549, "-"));
        }
        this.LLLIIL = false;
        C0TKK.LIZJ("during_testing");
        C20483915Dh c20483915Dh = this.LLIZ;
        if (c20483915Dh != null) {
            c20483915Dh.setEndTextButtonEnable(false);
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.FQ2(GamePreparationManualSpeedTestStartEvent.class);
        }
        this.LLLIIII = System.currentTimeMillis();
        C773730UWt.LJIIL(EnumC776480Ud4.PAGE_PREPARATION, EnumC779450Uhr.SCENE_TIKTOK_GAME_LIVE_MANUAL, new InterfaceC776660UdM() { // from class: X.0UWH
            @Override // X.InterfaceC776660UdM
            public final void onProgress(long j2) {
                GamePreparationNetworkSpeedDetectionDialog gamePreparationNetworkSpeedDetectionDialog = this.LIZ;
                gamePreparationNetworkSpeedDetectionDialog.getClass();
                float f = 1024;
                String strK4 = C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((j2 / f) / f) * 8)}, 1));
                C16F5 c16f52 = gamePreparationNetworkSpeedDetectionDialog.LLLFF;
                if (c16f52 != null) {
                    c16f52.setText(C497740JfY.LJIJJ(2131844549, strK4));
                }
            }

            @Override // X.InterfaceC776660UdM
            public final void LIZIZ(int i, String str) {
                String str2;
                GamePreparationNetworkSpeedDetectionDialog gamePreparationNetworkSpeedDetectionDialog = this.LIZ;
                gamePreparationNetworkSpeedDetectionDialog.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LLILZ.gg0(BroadcastShareScreenDefinition.class);
                String str3 = "";
                if (quality == null || (str2 = quality.sdkKey) == null) {
                    str2 = "";
                }
                if (i != C0UWJ.DisconnectTypeManuallyDetectionClickCancel.getCode() && i != C0UWJ.DisconnectTypeManuallyDetectionCloseDialog.getCode()) {
                    if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(gamePreparationNetworkSpeedDetectionDialog.uS()))) {
                        C0UWK.LIZ(i, "failed", "", (jCurrentTimeMillis - gamePreparationNetworkSpeedDetectionDialog.LLLIIII) / ((long) LSPassThroughRecordSizeConfig.DEFAULT), str2, "", str);
                    }
                    C0UWI c0uwi = C0UWI.FAILED;
                    int i2 = (int) ((jCurrentTimeMillis - gamePreparationNetworkSpeedDetectionDialog.LLLIIII) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    C0UW3.LIZ = true;
                    C0UW3.LIZIZ = c0uwi;
                    C0UW3.LIZJ = i2;
                    C0UW3.LIZLLL = "";
                } else {
                    C0UWI c0uwi2 = C0UWI.CANCELLED;
                    int i3 = (int) ((jCurrentTimeMillis - gamePreparationNetworkSpeedDetectionDialog.LLLIIII) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    C0UW3.LIZ = true;
                    C0UW3.LIZIZ = c0uwi2;
                    C0UW3.LIZJ = i3;
                    C0UW3.LIZLLL = "";
                }
                if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(gamePreparationNetworkSpeedDetectionDialog.uS()))) {
                    String strLJ = C773730UWt.LJ();
                    Map<String, Object> map = C1338270kvh.LIZ;
                    if (strLJ == null) {
                        strLJ = "";
                    }
                    String strLIZLLL = C773730UWt.LIZLLL();
                    if (strLIZLLL != null) {
                        str3 = strLIZLLL;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("detect_failure_code", Integer.valueOf(i));
                    linkedHashMap.put("detect_failure_msg", str);
                    C248000xa.LIZ(1, strLJ, str3, linkedHashMap);
                }
                if (!gamePreparationNetworkSpeedDetectionDialog.isHidden() && !gamePreparationNetworkSpeedDetectionDialog.isDetached()) {
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                    C11JF c11jf = gamePreparationNetworkSpeedDetectionDialog.LLJZIJLIL;
                    if (c11jf != null) {
                        c11jf.dispose();
                    }
                    gamePreparationNetworkSpeedDetectionDialog.yS();
                    ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = gamePreparationNetworkSpeedDetectionDialog.LLLI;
                    if (viewOnClickListenerC1836610xtT2 != null) {
                        int visibility = viewOnClickListenerC1836610xtT2.getVisibility();
                        viewOnClickListenerC1836610xtT2.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility, 0, viewOnClickListenerC1836610xtT2);
                    }
                    ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT3 = gamePreparationNetworkSpeedDetectionDialog.LLLI;
                    if (viewOnClickListenerC1836610xtT3 != null) {
                        viewOnClickListenerC1836610xtT3.LJFF();
                    }
                    C20483915Dh c20483915Dh2 = gamePreparationNetworkSpeedDetectionDialog.LLIZ;
                    if (c20483915Dh2 != null) {
                        c20483915Dh2.setEndTextButtonEnable(true);
                    }
                    C0TKK.LIZJ("testing_problem");
                }
            }

            @Override // X.InterfaceC776660UdM
            public final void LIZ(long j2, long j3, AFwS296S0000000_12 aFwS296S0000000_12) {
                String str;
                String str2;
                List<PushStreamInfo.Quality> listLJ;
                PushStreamInfo pushStreamInfo;
                float f;
                List<PushStreamInfo.Quality> listLJ2;
                Map<Long, PushStreamInfo> map;
                PushStreamInfo pushStreamInfo2;
                Map<String, PushStreamInfo.QualityList> map2;
                Map<Long, PushStreamInfo> map3;
                PushStreamInfo pushStreamInfo3;
                float f2;
                int iIndexOf;
                int length;
                int i;
                Map<String, PushStreamInfo.QualityList> map4;
                PushStreamInfo pushStreamInfo4;
                GamePreparationNetworkSpeedDetectionDialog gamePreparationNetworkSpeedDetectionDialog = this.LIZ;
                if (!gamePreparationNetworkSpeedDetectionDialog.isHidden() && !gamePreparationNetworkSpeedDetectionDialog.isDetached()) {
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    PushStreamInfo.Quality quality = (PushStreamInfo.Quality) dataChannelGlobal.gg0(BroadcastShareScreenDefinition.class);
                    String str3 = "";
                    if (quality == null || (str = quality.sdkKey) == null) {
                        str = "";
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Map<String, Object> map5 = C1338270kvh.LIZ;
                    float f3 = 1024;
                    float f4 = j2 / f3;
                    float f5 = 8;
                    String strK4 = C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf((f4 / f3) * f5)}, 1));
                    RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannelGlobal.gg0(C168W.class);
                    if (roomCreateInfo != null) {
                        PushStreamInfo.Quality qualityLJI = C773730UWt.LJI();
                        if (qualityLJI == null || (str2 = qualityLJI.sdkKey) == null) {
                            str2 = "";
                        }
                        if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(gamePreparationNetworkSpeedDetectionDialog.uS()))) {
                            String strLJ = C773730UWt.LJ();
                            if (strLJ == null) {
                                strLJ = "";
                            }
                            String strLIZLLL = C773730UWt.LIZLLL();
                            if (strLIZLLL == null) {
                                strLIZLLL = "";
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("upload_speed", Long.valueOf(j2));
                            linkedHashMap.put("download_speed", Long.valueOf(j3));
                            linkedHashMap.put("suggest_sdk_key", str2);
                            linkedHashMap.put("detect_result_network_good", Boolean.TRUE);
                            C248000xa.LIZ(0, strLJ, strLIZLLL, linkedHashMap);
                        }
                        if (TtliveGameEnableCategoryGearsSetting.INSTANCE.isEnable()) {
                            EnumC1284950jXh enumC1284950jXh = C19370910qR.LIZ;
                            Map<Long, PushStreamInfo> map6 = roomCreateInfo.pushStreamInfoMap;
                            if (map6 != null && (pushStreamInfo4 = map6.get(4L)) != null) {
                                map4 = pushStreamInfo4.multiQualities;
                            } else {
                                map4 = null;
                            }
                            listLJ = C19370910qR.LJ(map4);
                        } else {
                            Map<Long, PushStreamInfo> map7 = roomCreateInfo.pushStreamInfoMap;
                            if (map7 != null && (pushStreamInfo = map7.get(4L)) != null) {
                                listLJ = pushStreamInfo.qualityList;
                            } else {
                                listLJ = null;
                            }
                        }
                        String strLIZ = C0IMM.LIZ(str2, listLJ);
                        String strLJIJJ = C497740JfY.LJIJJ(2131844549, strK4);
                        StringBuilder sb = new StringBuilder();
                        sb.append(C497740JfY.LJIJI(2131844532));
                        sb.append("\n");
                        sb.append(C497740JfY.LJIJI(2131844534));
                        if (strLJIJJ != null) {
                            str3 = strLJIJJ;
                        }
                        sb.append(str3);
                        sb.append("\n");
                        sb.append(C497740JfY.LJIJI(2131844533));
                        sb.append(strLIZ);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
                        if (C500260Jjc.LJJIIZ(strLJIJJ)) {
                            if (strLJIJJ != null) {
                                length = strLJIJJ.length();
                            } else {
                                length = 0;
                            }
                            int iIndexOf2 = sb.indexOf(strLJIJJ, 0);
                            if (iIndexOf2 > 0 && (i = length + iIndexOf2) <= sb.length()) {
                                C1119920fFW.LJIIIIZZ(spannableStringBuilder, iIndexOf2, i, 33, 500);
                            }
                        }
                        if (C500260Jjc.LJJIIZ(strLIZ) && (iIndexOf = sb.indexOf(strLIZ, 0)) > 0 && strLIZ.length() + iIndexOf <= sb.length()) {
                            C1119920fFW.LJIIIIZZ(spannableStringBuilder, iIndexOf, strLIZ.length() + iIndexOf, 33, 500);
                        }
                        try {
                            f = CastFloatProtector.parseFloat(strK4);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("speed to float exception ");
                            sbLIZ.append(e.getMessage());
                            C20441214yg.LIZIZ("GamePreparationNetworkSpeedDetectionDialog", C2188811AlT.LIZIZ(sbLIZ));
                            f = 0.0f;
                        }
                        C11JF c11jf = gamePreparationNetworkSpeedDetectionDialog.LLJZIJLIL;
                        if (c11jf != null) {
                            c11jf.dispose();
                        }
                        gamePreparationNetworkSpeedDetectionDialog.yS();
                        AppCompatImageView appCompatImageView = gamePreparationNetworkSpeedDetectionDialog.LLLF;
                        if (appCompatImageView != null) {
                            if (f >= 120.0f) {
                                f2 = 180.0f;
                            } else if (f > 0.0f && f < 120.0f) {
                                f2 = ((f / 120.0f) * 174.0f) + 6.0f;
                            } else {
                                f2 = 6.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) View.ROTATION, appCompatImageView.getRotation(), f2);
                            objectAnimatorOfFloat.setStartDelay(0L);
                            objectAnimatorOfFloat.setDuration(400L);
                            objectAnimatorOfFloat.setInterpolator(new InterpolatorC1125410fON(0.33f, 0.0f, 0.35f, 1.0f));
                            C786410Ut5.Pd(objectAnimatorOfFloat);
                        }
                        C16F5 c16f52 = gamePreparationNetworkSpeedDetectionDialog.LLL;
                        if (c16f52 != null) {
                            C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(24.0f), c16f52);
                        }
                        C16F5 c16f53 = gamePreparationNetworkSpeedDetectionDialog.LLL;
                        if (c16f53 != null) {
                            c16f53.setText(spannableStringBuilder);
                        }
                        C16F5 c16f54 = gamePreparationNetworkSpeedDetectionDialog.LLLFF;
                        if (c16f54 != null) {
                            c16f54.setText(C497740JfY.LJIJJ(2131844549, strK4));
                        }
                        C16FS c16fs2 = gamePreparationNetworkSpeedDetectionDialog.LLLFZ;
                        if (c16fs2 != null) {
                            c16fs2.setEnabled(true);
                        }
                        C20483915Dh c20483915Dh2 = gamePreparationNetworkSpeedDetectionDialog.LLIZ;
                        if (c20483915Dh2 != null) {
                            c20483915Dh2.setEndTextButtonEnable(true);
                        }
                        if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(gamePreparationNetworkSpeedDetectionDialog.uS()))) {
                            if (C772710USv.LIZIZ()) {
                                DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
                                dataChannelGlobal2.HQ2(SuggestedDefinitionByManuallySpeedDetection.class, str2);
                                PushStreamInfo.Quality quality2 = new PushStreamInfo.Quality();
                                RoomCreateInfo roomCreateInfo2 = (RoomCreateInfo) dataChannelGlobal2.gg0(C168W.class);
                                if (TtliveGameEnableCategoryGearsSetting.INSTANCE.isEnable()) {
                                    EnumC1284950jXh enumC1284950jXh2 = C19370910qR.LIZ;
                                    if (roomCreateInfo2 != null && (map3 = roomCreateInfo2.pushStreamInfoMap) != null && (pushStreamInfo3 = map3.get(4L)) != null) {
                                        map2 = pushStreamInfo3.multiQualities;
                                    } else {
                                        map2 = null;
                                    }
                                    listLJ2 = C19370910qR.LJ(map2);
                                } else if (roomCreateInfo2 != null && (map = roomCreateInfo2.pushStreamInfoMap) != null && (pushStreamInfo2 = map.get(4L)) != null) {
                                    listLJ2 = pushStreamInfo2.qualityList;
                                } else {
                                    listLJ2 = null;
                                }
                                quality2.name = C0IMM.LIZ(str2, listLJ2);
                                quality2.sdkKey = str2;
                                dataChannelGlobal2.JQ2(C931140aL2.class, str2);
                                Map<String, Object> map8 = C1338270kvh.LIZ;
                                dataChannelGlobal2.HQ2(BroadcastShareScreenDefinition.class, quality2);
                                HashMap map9 = new HashMap();
                                map9.put("name", quality2.name);
                                map9.put("sdk_key", quality2.sdkKey);
                                InterfaceC772390URp.p.LJFF(map9);
                            }
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_definition_selection_select_success");
                            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                            c474500IjALIZ.LJJII(str, "previous_definition");
                            c474500IjALIZ.LJJII(str2, "current_definition");
                            c474500IjALIZ.LJJII("auto_speedtest", "switch_type");
                            c474500IjALIZ.LJJ("screen_share");
                            c474500IjALIZ.LIZ();
                            C0UWK.LIZ(-1, "success", "", (jCurrentTimeMillis - gamePreparationNetworkSpeedDetectionDialog.LLLIIII) / ((long) LSPassThroughRecordSizeConfig.DEFAULT), str, str2, "");
                        }
                        C0UWI c0uwi = C0UWI.SUCCESS;
                        int i2 = (int) ((jCurrentTimeMillis - gamePreparationNetworkSpeedDetectionDialog.LLLIIII) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                        C0UW3.LIZ = true;
                        C0UW3.LIZIZ = c0uwi;
                        C0UW3.LIZJ = i2;
                        C0UW3.LIZLLL = str2;
                        if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(gamePreparationNetworkSpeedDetectionDialog.uS()))) {
                            aFwS296S0000000_12.invoke(Long.valueOf((long) (f4 * f5)), str2);
                        }
                    }
                }
            }
        });
        C786410Ut5.LJLIIL(j, this.LLLII, new ARunnableS112S0100000_12(this, 132));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AppCompatImageView appCompatImageView;
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(this, GamePreparationPageDestroyEvent.class, new AwS591S0100000_12(this, 987));
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.roe);
        this.LLLI = viewOnClickListenerC1836610xtT;
        if (viewOnClickListenerC1836610xtT != null) {
            int visibility = viewOnClickListenerC1836610xtT.getVisibility();
            viewOnClickListenerC1836610xtT.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, viewOnClickListenerC1836610xtT);
        }
        this.LLL = (C16F5) view.findViewById(R.id.yp5);
        this.LLLFF = (C16F5) view.findViewById(R.id.yp_);
        this.LLLFFI = (C16FS) view.findViewById(R.id.ctj);
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = this.LLLI;
        C16FS c16fs = null;
        if (viewOnClickListenerC1836610xtT2 != null) {
            appCompatImageView = (AppCompatImageView) viewOnClickListenerC1836610xtT2.findViewById(R.id.yp8);
        } else {
            appCompatImageView = null;
        }
        this.LLLF = appCompatImageView;
        wS(500L);
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT3 = this.LLLI;
        if (viewOnClickListenerC1836610xtT3 != null) {
            c16fs = (C16FS) viewOnClickListenerC1836610xtT3.findViewById(R.id.yp3);
        }
        this.LLLFZ = c16fs;
        if (c16fs != null) {
            c16fs.setEnabled(false);
        }
        C16FS c16fs2 = this.LLLFZ;
        if (c16fs2 != null) {
            C786410Ut5.h8(c16fs2, new ACListenerS147S0100000_12(this, 198));
        }
        C16FS c16fs3 = this.LLLFFI;
        if (c16fs3 != null) {
            C786410Ut5.h8(c16fs3, new ACListenerS147S0100000_12(this, 199));
        }
    }

    public final void zS(long j, boolean z) {
        C16F5 c16f5 = this.LLL;
        if (c16f5 != null) {
            C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(45.0f), c16f5);
        }
        if (z) {
            C16F5 c16f52 = this.LLL;
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIJI(2131844544));
                return;
            }
            return;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder(C497740JfY.LJIJJ(2131844543, Long.valueOf(j)));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
            if (!C500260Jjc.LJJIIZ(sb)) {
                return;
            }
            int iIndexOf = sb.indexOf(String.valueOf(j), 0);
            if (iIndexOf > 0 && String.valueOf(j).length() + iIndexOf <= sb.length()) {
                C1119920fFW.LJIIIIZZ(spannableStringBuilder, iIndexOf, String.valueOf(j).length() + iIndexOf, 33, 500);
            }
            C16F5 c16f53 = this.LLL;
            if (c16f53 == null) {
                return;
            }
            c16f53.setText(spannableStringBuilder);
            return;
        }
        throw new C1954807lC();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g71, viewGroup, false);
    }
}
