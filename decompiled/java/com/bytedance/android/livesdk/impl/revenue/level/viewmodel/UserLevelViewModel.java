package com.bytedance.android.livesdk.impl.revenue.level.viewmodel;

import X.C09JN;
import X.C0IJT;
import X.C0JT6;
import X.C0UO0;
import X.C1090300eTk;
import X.C1090310eTl;
import X.C1090330eTn;
import X.C1094360eaI;
import X.C1094450eaR;
import X.C1094500eaW;
import X.C1094510eaX;
import X.C1148070fyv;
import X.C1148310fzJ;
import X.C1161920gLG;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C19748512Ol;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C480460Ism;
import X.C496760Jdy;
import X.C515801zg;
import X.C516201zk;
import X.C786410Ut5;
import X.C930940aKi;
import X.InterfaceC1093700eZE;
import X.InterfaceC1094160eZy;
import X.InterfaceC500940Jki;
import Y.AfS186S0100000_17;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelChannel;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelEvent;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.impl.revenue.level.UserLevelWidget;
import com.bytedance.android.livesdk.impl.revenue.level.api.UserLevelApi;
import com.bytedance.android.livesdk.impl.revenue.level.viewmodel.UserLevelViewModel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveUserLevelBackEnableSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelUnlockLevelSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelUpActionEnableSetting;
import com.bytedance.android.livesdk.userservice.UserApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS10S0100200_17;
import kotlin.jvm.internal.AwS22S1100100_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;
import tikcast.api.user_level.GradeConfig;
import tikcast.api.user_level.GradeScoreRule;
import tikcast.api.user_level.UserGrade;

/* JADX INFO: loaded from: classes18.dex */
public final class UserLevelViewModel extends LiveWidgetViewModel implements IUserLevelService {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public CopyOnWriteArraySet<Double> LL = new CopyOnWriteArraySet<>();

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final RoomRecycleWidget aq2() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final String XS1() {
        String str = C496760Jdy.LIZ;
        return str == null ? "" : str;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final boolean eG2() {
        C1094360eaI c1094360eaI = C1094450eaR.LIZ;
        return C1094450eaR.LIZJ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int vF1() {
        C1094360eaI c1094360eaI = C1094450eaR.LIZ;
        return C1094450eaR.LJIIIIZZ;
    }

    public final boolean AQ2() {
        C0JT6<String> c0jt6;
        String strLIZ;
        String strLIZ2;
        C1094360eaI c1094360eaIHP;
        if ((HP() != null && ((c1094360eaIHP = HP()) == null || c1094360eaIHP.LIZ != -1)) || (strLIZ = (c0jt6 = InterfaceC1093700eZE.Kf).LIZ()) == null || a0.LJJJIL(strLIZ) || (strLIZ2 = c0jt6.LIZ()) == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(strLIZ2);
        Gson gson = C19748512Ol.LIZJ;
        BadgeStruct badgeStruct = (BadgeStruct) GsonProtectorUtils.fromJson(gson, jSONObject.optString("levelBadge"), BadgeStruct.class);
        BadgeStruct badgeStruct2 = (BadgeStruct) GsonProtectorUtils.fromJson(gson, jSONObject.optString("levelBadgeAlpha"), BadgeStruct.class);
        if (jSONObject.optInt("currentLevel", -1) < 0) {
            return false;
        }
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            int iOptInt = jSONObject.optInt("currentLevel");
            long jOptLong = jSONObject.optLong("currentScore");
            Double dLIZ = InterfaceC1093700eZE.Jf.LIZ();
            int iDoubleValue = dLIZ != null ? (int) dLIZ.doubleValue() : 0;
            dataChannel.zW(UserLevelChannel.class, new C1094360eaI(iOptInt, jOptLong, badgeStruct, badgeStruct2, jSONObject.optInt("levelStatus"), jSONObject.optLong("levelMinScore"), jSONObject.optLong("levelMaxScore"), jSONObject.optLong("secondToSleep"), Integer.valueOf(jSONObject.optInt("barrageEffectConfig")), jSONObject.optString("avatarBorderColor"), iDoubleValue, 1, jSONObject.optLong("version"), 16));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1094490eaV DX() {
        /*
            r15 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r15.getDataChannel()
            if (r1 == 0) goto Lb6
            java.lang.Class<com.bytedance.android.livesdk.api.revenue.level.event.UserLevelChannel> r0 = com.bytedance.android.livesdk.api.revenue.level.event.UserLevelChannel.class
            java.lang.Object r10 = r1.gg0(r0)
            X.0eaI r10 = (X.C1094360eaI) r10
        Le:
            r6 = -1
            if (r10 == 0) goto Lb0
            long r4 = r10.LJII
            long r0 = r10.LJI
            long r4 = r4 - r0
            long r2 = r10.LIZIZ
            long r2 = r2 - r0
        L1a:
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r0 = com.bytedance.android.live.gift.IGiftService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.gift.IGiftService r0 = (com.bytedance.android.live.gift.IGiftService) r0
            com.bytedance.android.livesdk.gift.model.GiftsInfo$LevelUpGiftInfo r9 = r0.getGiftLevelUpInfo()
            X.0eaV r8 = new X.0eaV
            r8.<init>()
            if (r9 == 0) goto Lad
            long r0 = r9.numOfUpgradeGiftsLeft
        L2f:
            r8.LIZIZ = r0
            if (r9 == 0) goto Laa
            long r0 = r9.blastEndTimestamp
        L35:
            r8.LIZJ = r0
            if (r9 == 0) goto L3b
            long r6 = r9.numOfUpgradeGiftsLeft
        L3b:
            r13 = -1
            if (r10 == 0) goto La8
            int r14 = r10.LIZ
        L40:
            if (r9 == 0) goto La5
            long r0 = r9.minimumLevelGrade
            int r12 = (int) r0
        L45:
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r0 = com.bytedance.android.live.gift.IGiftService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.gift.IGiftService r0 = (com.bytedance.android.live.gift.IGiftService) r0
            com.bytedance.android.livesdk.model.Gift r11 = r0.getUpgradeGift()
            r1 = 0
            if (r14 >= r12) goto L73
            X.0eaU r0 = X.EnumC1094480eaU.UNQUALIFIED
        L56:
            r8.LIZ = r0
            r8.LJ = r4
            r8.LIZLLL = r2
            if (r10 == 0) goto L60
            int r13 = r10.LIZ
        L60:
            r8.LJFF = r13
            if (r9 == 0) goto L68
            java.lang.String r0 = r9.showId
            if (r0 != 0) goto L6a
        L68:
            java.lang.String r0 = ""
        L6a:
            r8.LJI = r0
            if (r10 == 0) goto L70
            int r1 = r10.LJFF
        L70:
            r8.LJII = r1
            return r8
        L73:
            r14 = 1
            if (r11 == 0) goto L8a
            com.bytedance.android.livesdk.model.GiftLockInfo r0 = r11.giftSubInfo
            if (r0 == 0) goto L81
            boolean r0 = r0.mLock
            if (r0 != r14) goto L81
            X.0eaU r0 = X.EnumC1094480eaU.INACTIVE
            goto L56
        L81:
            com.bytedance.android.livesdk.model.GiftLockInfo r0 = r11.giftSubInfo
            if (r0 == 0) goto L8a
            boolean r0 = r0.mLock
            if (r0 != 0) goto L8a
            goto L8b
        L8a:
            r14 = 0
        L8b:
            r11 = 0
            if (r14 == 0) goto L96
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 != 0) goto L96
            X.0eaU r0 = X.EnumC1094480eaU.ACTIVE
            goto L56
        L96:
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 <= 0) goto L9d
            X.0eaU r0 = X.EnumC1094480eaU.FINISHED
            goto L56
        L9d:
            if (r0 >= 0) goto La2
            X.0eaU r0 = X.EnumC1094480eaU.MAXLEVEL
            goto L56
        La2:
            X.0eaU r0 = X.EnumC1094480eaU.UNKNOWN
            goto L56
        La5:
            r12 = 15
            goto L45
        La8:
            r14 = -1
            goto L40
        Laa:
            r0 = -1
            goto L35
        Lad:
            r0 = -1
            goto L2f
        Lb0:
            r4 = -1
            r2 = -1
            goto L1a
        Lb6:
            r10 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.level.viewmodel.UserLevelViewModel.DX():X.0eaV");
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final C1094360eaI HP() {
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            return (C1094360eaI) dataChannel.gg0(UserLevelChannel.class);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final DataChannel gA0() {
        return getDataChannel();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void s01() {
        DataChannel dataChannel;
        C1094360eaI c1094360eaI;
        DataChannel dataChannel2;
        if (getDataChannel() == null || (dataChannel = getDataChannel()) == null || (c1094360eaI = (C1094360eaI) dataChannel.gg0(UserLevelChannel.class)) == null || (dataChannel2 = getDataChannel()) == null) {
            return;
        }
        dataChannel2.zW(UserLevelChannel.class, C1094360eaI.LIZ(c1094360eaI.LIZ, c1094360eaI.LIZIZ, c1094360eaI.LIZJ, c1094360eaI.LIZLLL, c1094360eaI.LJ, c1094360eaI.LJFF, c1094360eaI.LJI, c1094360eaI.LJII, c1094360eaI.LJIIIIZZ, c1094360eaI.LJIIIZ, c1094360eaI.LJIIJ, c1094360eaI.LIZ, c1094360eaI.LJIIL, c1094360eaI.LJIILIIL));
        InterfaceC1093700eZE.Jf.LIZJ(Double.valueOf(c1094360eaI.LIZ));
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final Class<? extends LiveRecyclableWidget> Dk1() {
        return UserLevelWidget.class;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final CopyOnWriteArraySet<Double> lB2() {
        return this.LL;
    }

    public static void yQ2(C1094360eaI c1094360eaI) {
        if (c1094360eaI != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("currentLevel", c1094360eaI.LIZ);
                jSONObject.put("currentScore", c1094360eaI.LIZIZ);
                jSONObject.put("fromLevel", c1094360eaI.LJIIJJI);
                jSONObject.put("levelStatus", c1094360eaI.LJFF);
                jSONObject.put("avatarBorderColor", c1094360eaI.LJIIJ);
                jSONObject.put("barrageEffectConfig", c1094360eaI.LJIIIZ);
                jSONObject.put("levelMaxScore", c1094360eaI.LJII);
                jSONObject.put("levelMinScore", c1094360eaI.LJI);
                jSONObject.put("secondToSleep", c1094360eaI.LJIIIIZZ);
                jSONObject.put("version", c1094360eaI.LJIILIIL);
                Gson gson = C19748512Ol.LIZJ;
                jSONObject.put("levelBadge", gson.LJIILL(c1094360eaI.LIZJ));
                jSONObject.put("levelBadgeAlpha", gson.LJIILL(c1094360eaI.LIZLLL));
                InterfaceC1093700eZE.Kf.LIZJ(C786410Ut5.J3(jSONObject));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1CC2.LIZ("UserLevel save state error", e);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final C1094500eaW A21(GiftsInfo.LevelUpGiftInfo levelUpGiftInfo) {
        C1094360eaI c1094360eaI;
        long jLongValue;
        double dDoubleValue;
        int i;
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            c1094360eaI = (C1094360eaI) dataChannel.gg0(UserLevelChannel.class);
        } else {
            c1094360eaI = null;
        }
        C1094500eaW c1094500eaW = new C1094500eaW();
        if (c1094360eaI != null) {
            jLongValue = Long.valueOf(c1094360eaI.LJII - c1094360eaI.LIZIZ).longValue();
        } else {
            jLongValue = -1;
        }
        c1094500eaW.LIZ = jLongValue;
        if (c1094360eaI != null) {
            long j = c1094360eaI.LIZIZ;
            long j2 = c1094360eaI.LJI;
            dDoubleValue = Double.valueOf((j - j2) / (c1094360eaI.LJII - j2)).doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        c1094500eaW.LIZIZ = dDoubleValue;
        if (c1094360eaI != null) {
            i = c1094360eaI.LIZ;
        } else {
            i = -1;
        }
        c1094500eaW.LIZJ = i;
        return c1094500eaW;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int L82(int i) {
        DataChannel dataChannel;
        C1094360eaI c1094360eaI;
        int i2;
        C1094360eaI c1094360eaI2 = C1094450eaR.LIZ;
        if (!C1094450eaR.LIZJ || getDataChannel() == null || (dataChannel = getDataChannel()) == null || (c1094360eaI = (C1094360eaI) dataChannel.gg0(UserLevelChannel.class)) == null || i >= (i2 = c1094360eaI.LIZ)) {
            return 0;
        }
        Iterator<Integer> it2 = C1094450eaR.LJII.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (i + 1 <= iIntValue && iIntValue <= i2) {
                i3 = iIntValue;
            }
        }
        return i3;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void QL(double d) {
        this.LL.add(Double.valueOf(d));
        InterfaceC1094160eZy.s1.LJFF(this.LL);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int TD2(List<BadgeStruct> list) {
        String str;
        int i = -1;
        if (list != null) {
            for (BadgeStruct badgeStruct : list) {
                if (badgeStruct != null && badgeStruct.badgeScene == 8) {
                    try {
                        CombineBadgeStruct combineBadgeStruct = badgeStruct.combineBadgeStruct;
                        if (combineBadgeStruct != null && (str = combineBadgeStruct.str) != null) {
                            i = CastIntegerProtector.parseInt(str);
                        } else {
                            i = 0;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        return i;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final boolean Tj1(int i) {
        DataChannel dataChannel;
        C1094360eaI c1094360eaI;
        int i2;
        C1094360eaI c1094360eaI2 = C1094450eaR.LIZ;
        if (!C1094450eaR.LIZJ || getDataChannel() == null || (dataChannel = getDataChannel()) == null || (c1094360eaI = (C1094360eaI) dataChannel.gg0(UserLevelChannel.class)) == null || i >= (i2 = c1094360eaI.LIZ)) {
            return false;
        }
        Iterator<Integer> it2 = C1094450eaR.LJII.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (i + 1 <= iIntValue && iIntValue <= i2) {
                i3 = iIntValue;
            }
        }
        if (i3 <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void WN1(long j) {
        if (getDataChannel() == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        AwS10S0100200_17 awS10S0100200_17 = new AwS10S0100200_17(this, j, jCurrentTimeMillis, 0);
        AwS10S0100200_17 awS10S0100200_172 = new AwS10S0100200_17(this, j, jCurrentTimeMillis, 1);
        C480460Ism.LIZ().getClass();
        ((UserApi) C480460Ism.LIZLLL(UserApi.class)).updateSwitch(12L, j).LJIILIIL(new C0UO0()).LJJLL(new C515801zg(awS10S0100200_17, awS10S0100200_172, 63), new C516201zk(awS10S0100200_172, 298));
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void cG2(double d) {
        this.LL.remove(Double.valueOf(d));
        InterfaceC1094160eZy.s1.LJFF(this.LL);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int m40(long j) {
        DataChannel dataChannel;
        C1094360eaI c1094360eaI;
        C1094360eaI c1094360eaI2 = C1094450eaR.LIZ;
        if (C1094450eaR.LIZJ && getDataChannel() != null && (dataChannel = getDataChannel()) != null && (c1094360eaI = (C1094360eaI) dataChannel.gg0(UserLevelChannel.class)) != null) {
            long j2 = c1094360eaI.LIZIZ;
            int i = c1094360eaI.LIZ;
            long j3 = j2 + j;
            for (Map.Entry entry : ((LinkedHashMap) C1094450eaR.LIZLLL).entrySet()) {
                if (((Number) entry.getKey()).intValue() >= i && ((GradeScoreRule) entry.getValue()).gradeMinScore <= j3 && ((GradeScoreRule) entry.getValue()).gradeMaxScore > j3) {
                    return ((Number) entry.getKey()).intValue();
                }
            }
        }
        return 0;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void nz0(int i) {
        if (i > 1) {
            C11NZ.LJLJJLL(1L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(this, 54));
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final ImageModel oy0(int i) {
        C1094360eaI c1094360eaI = C1094450eaR.LIZ;
        if (!C1094450eaR.LIZJ || getDataChannel() == null) {
            return null;
        }
        return (ImageModel) ((LinkedHashMap) C1094450eaR.LJFF).get(Integer.valueOf(i));
    }

    public final String vQ2(int i) {
        C1094360eaI c1094360eaI = C1094450eaR.LIZ;
        if (!C1094450eaR.LIZJ || getDataChannel() == null) {
            return null;
        }
        return (String) ((LinkedHashMap) C1094450eaR.LJI).get(Integer.valueOf(i));
    }

    public final Integer wQ2(int i) {
        C1094360eaI c1094360eaI = C1094450eaR.LIZ;
        if (!C1094450eaR.LIZJ || getDataChannel() == null) {
            return null;
        }
        return (Integer) ((LinkedHashMap) C1094450eaR.LJ).get(Integer.valueOf(i));
    }

    public final void xQ2(final String str, final Function1<? super List<GradeConfig>, Unit> function1) {
        final C1094360eaI c1094360eaI;
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            c1094360eaI = (C1094360eaI) dataChannel.gg0(UserLevelChannel.class);
        } else {
            c1094360eaI = null;
        }
        C496760Jdy.LJ(str, true);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        AwS22S1100100_17 awS22S1100100_17 = new AwS22S1100100_17(c1094360eaI, str, jCurrentTimeMillis, 0);
        C480460Ism.LIZ().getClass();
        ((UserLevelApi) C480460Ism.LIZLLL(UserLevelApi.class)).getUserLevelInfoJsonWithParameter(true).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.0eaT
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str2;
                Integer numValueOf;
                Integer numValueOf2;
                Long lValueOf;
                Long lValueOf2;
                String str3;
                List<GradeConfig> arrayList;
                n nVar;
                int i;
                long j;
                Integer numValueOf3;
                Long lValueOf3;
                Long lValueOf4;
                C1C7U.LIZ("UserLevelViewModel@cee4.requestUserGradeJson$dispose$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                UserLevelViewModel userLevelViewModel = this.LL;
                String str4 = str;
                C1094360eaI c1094360eaI2 = c1094360eaI;
                long j2 = jCurrentTimeMillis;
                userLevelViewModel.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (baseResponse != null && Integer.valueOf(baseResponse.statusCode) != null && baseResponse.statusCode != 0) {
                    if (c1094360eaI2 != null) {
                        i = c1094360eaI2.LIZ;
                    } else {
                        i = -1;
                    }
                    Integer numValueOf4 = Integer.valueOf(i);
                    if (c1094360eaI2 != null) {
                        j = c1094360eaI2.LIZIZ;
                    } else {
                        j = -1;
                    }
                    C496760Jdy.LJFF(numValueOf4, Long.valueOf(j), -1, -1L, Integer.valueOf(baseResponse.statusCode));
                    long j3 = jCurrentTimeMillis2 - j2;
                    Integer numValueOf5 = Integer.valueOf(baseResponse.statusCode);
                    if (c1094360eaI2 != null) {
                        numValueOf3 = Integer.valueOf(c1094360eaI2.LIZ);
                        lValueOf3 = Long.valueOf(c1094360eaI2.LIZIZ);
                        lValueOf4 = Long.valueOf(c1094360eaI2.LJIILIIL);
                    } else {
                        numValueOf3 = null;
                        lValueOf3 = null;
                        lValueOf4 = null;
                    }
                    str2 = str4;
                    C496760Jdy.LJII(true, str4, j3, true, numValueOf5, null, null, numValueOf3, lValueOf3, lValueOf4, baseResponse.LIZIZ);
                } else {
                    str2 = str4;
                }
                long j4 = jCurrentTimeMillis2 - j2;
                if (baseResponse != null) {
                    numValueOf = Integer.valueOf(baseResponse.statusCode);
                } else {
                    numValueOf = null;
                }
                n nVarLJIILIIL = null;
                if (c1094360eaI2 != null) {
                    numValueOf2 = Integer.valueOf(c1094360eaI2.LIZ);
                    lValueOf = Long.valueOf(c1094360eaI2.LIZIZ);
                    lValueOf2 = Long.valueOf(c1094360eaI2.LJIILIIL);
                } else {
                    numValueOf2 = null;
                    lValueOf = null;
                    lValueOf2 = null;
                }
                if (baseResponse != null) {
                    str3 = baseResponse.LIZIZ;
                } else {
                    str3 = null;
                }
                h hVarLJIIL = null;
                C496760Jdy.LJII(true, str2, j4, true, numValueOf, null, null, numValueOf2, lValueOf, lValueOf2, str3);
                if (baseResponse != null && (nVar = (n) baseResponse.data) != null) {
                    k kVarLJJIIZ = nVar.LJJIIZ("grade_config");
                    if (kVarLJJIIZ != null) {
                        hVarLJIIL = kVarLJJIIZ.LJIIL();
                    }
                    ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).CM(C497740JfY.LJII(), String.valueOf(hVarLJIIL), "user_level_upgrade_config", null);
                    Gson gson = C19748512Ol.LIZJ;
                    arrayList = (List) GsonProtectorUtils.fromJson(gson, hVarLJIIL, new TypeToken<List<GradeConfig>>() { // from class: X.0eaG
                    }.getType());
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    k kVarLJJIIZ2 = nVar.LJJIIZ("user_grade");
                    if (kVarLJJIIZ2 != null) {
                        nVarLJIILIIL = kVarLJJIIZ2.LJIILIIL();
                    }
                    userLevelViewModel.zQ2((UserGrade) GsonProtectorUtils.fromJson(gson, (k) nVarLJIILIIL, UserGrade.class), false, 2, "enter_room", "", Boolean.FALSE, new C1094510eaX(baseResponse.LIZIZ));
                    C1094450eaR.LIZIZ(arrayList);
                } else {
                    arrayList = new ArrayList<>();
                }
                Function1<List<GradeConfig>, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(arrayList);
                }
                C1C7U.LIZIZ("UserLevelViewModel@cee4.requestUserGradeJson$dispose$1");
            }
        }, new AfS186S0100000_17(awS22S1100100_17, 55));
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void gN(final String str, final Boolean bool, final String str2) {
        final C1094360eaI c1094360eaI;
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            c1094360eaI = (C1094360eaI) dataChannel.gg0(UserLevelChannel.class);
        } else {
            c1094360eaI = null;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C496760Jdy.LJ(str, false);
        C480460Ism.LIZ().getClass();
        ((UserLevelApi) C480460Ism.LIZLLL(UserLevelApi.class)).getUserLevelInfoWithParameter(false).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.0eaQ
            public final /* synthetic */ boolean LLILLJJLI = false;
            public final /* synthetic */ Function1<List<GradeConfig>, Unit> LLIZLLLIL = null;

            /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00ed A[PHI: r15 r16
              0x00ed: PHI (r15v2 java.lang.Integer) = (r15v1 java.lang.Integer), (r15v5 java.lang.Integer), (r15v5 java.lang.Integer) binds: [B:60:0x00e9, B:17:0x0048, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE]
              0x00ed: PHI (r16v1 java.lang.Integer) = (r16v0 java.lang.Integer), (r16v4 java.lang.Integer), (r16v4 java.lang.Integer) binds: [B:60:0x00e9, B:17:0x0048, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r27) {
                /*
                    Method dump skipped, instruction units count: 388
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1094440eaQ.accept(java.lang.Object):void");
            }
        }, new C09JN() { // from class: X.0eaS
            public final /* synthetic */ boolean LLILLJJLI = false;

            @Override // X.C09JN
            public final void accept(Object obj) {
                Integer numValueOf;
                Long lValueOf;
                Integer numValueOf2;
                Long lValueOf2;
                C1C7U.LIZ("UserLevelViewModel@cee4.requestUserGrade$dispose$2");
                Throwable th = (Throwable) obj;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                C1094360eaI c1094360eaI2 = c1094360eaI;
                Long lValueOf3 = null;
                if (c1094360eaI2 != null) {
                    numValueOf = Integer.valueOf(c1094360eaI2.LIZ);
                } else {
                    numValueOf = null;
                }
                C1094360eaI c1094360eaI3 = c1094360eaI;
                if (c1094360eaI3 != null) {
                    lValueOf = Long.valueOf(c1094360eaI3.LIZIZ);
                } else {
                    lValueOf = null;
                }
                C496760Jdy.LJFF(numValueOf, lValueOf, -1, -1L, -3);
                boolean z = this.LLILLJJLI;
                String str3 = str;
                long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                C1094360eaI c1094360eaI4 = c1094360eaI;
                if (c1094360eaI4 != null) {
                    numValueOf2 = Integer.valueOf(c1094360eaI4.LIZ);
                } else {
                    numValueOf2 = null;
                }
                C1094360eaI c1094360eaI5 = c1094360eaI;
                if (c1094360eaI5 != null) {
                    lValueOf2 = Long.valueOf(c1094360eaI5.LIZIZ);
                } else {
                    lValueOf2 = null;
                }
                C1094360eaI c1094360eaI6 = c1094360eaI;
                if (c1094360eaI6 != null) {
                    lValueOf3 = Long.valueOf(c1094360eaI6.LJIILIIL);
                }
                C496760Jdy.LJII(z, str3, j, true, -3, null, null, numValueOf2, lValueOf2, lValueOf3, null);
                C20441214yg.LJI("UserLevelViewModel", th);
                C1C7U.LIZIZ("UserLevelViewModel@cee4.requestUserGrade$dispose$2");
            }
        });
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void HS1(UserGrade userGrade, boolean z, String str, boolean z2, C1094510eaX c1094510eaX) {
        int i;
        if (userGrade == null) {
            return;
        }
        if (Intrinsics.LJFF(str, "star_comment")) {
            i = 5;
        } else {
            i = 3;
        }
        zQ2(userGrade, z, i, "gift", str, Boolean.valueOf(z2), c1094510eaX);
    }

    public final C1094360eaI zQ2(UserGrade userGrade, boolean z, int i, String str, String str2, Boolean bool, C1094510eaX c1094510eaX) {
        C1094360eaI c1094360eaI;
        boolean z2;
        long j;
        long j2;
        int iDoubleValue;
        long id;
        String str3;
        String str4;
        long currentUserId;
        boolean z3;
        String str5;
        Integer numValueOf = null;
        if (userGrade == null || getDataChannel() == null) {
            return null;
        }
        DataChannel dataChannel = getDataChannel();
        if (dataChannel == null || (c1094360eaI = (C1094360eaI) dataChannel.gg0(UserLevelChannel.class)) == null) {
            c1094360eaI = new C1094360eaI(-1, 0L, (BadgeStruct) null, (BadgeStruct) null, 0, 0L, 0L, 0L, (Integer) null, (String) null, 0, 0, 0L, 16382);
        }
        long j3 = c1094360eaI.LJIILIIL;
        long j4 = userGrade.version;
        int i2 = 0;
        if (j4 > j3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!LiveUserLevelBackEnableSetting.INSTANCE.getValue()) {
            z2 = false;
        }
        String str6 = "";
        if (i == 2) {
            Long l = (Long) DataChannelGlobal.LLILZ.gg0(C1148070fyv.class);
            Integer numValueOf2 = Integer.valueOf(userGrade.gradeMode);
            if (l != null) {
                numValueOf = Integer.valueOf((int) l.longValue());
            }
            if (numValueOf2 != null && (numValueOf2.intValue() != 1 ? !(numValueOf2.intValue() != 3 ? numValueOf2.intValue() != 2 ? numValueOf2.intValue() != 0 || numValueOf == null || numValueOf.intValue() != 0 : numValueOf == null || numValueOf.intValue() != 2 : numValueOf == null || numValueOf.intValue() != 1) : !(numValueOf == null || numValueOf.intValue() != 1))) {
                z3 = true;
            } else {
                z3 = false;
            }
            int iLIZIZ = C496760Jdy.LIZIZ(Boolean.valueOf(z3));
            try {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_user_level_opt_status_monitor");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(numValueOf2, "opt_status");
                c474500IjALIZ.LJJII(numValueOf, "level_opt_status");
                c474500IjALIZ.LJJII(Integer.valueOf(iLIZIZ), "opt_status_same_with_cache");
                c474500IjALIZ.LJJII("opt_api", Scene.SCENE_SERVICE);
                if (c1094510eaX == null || (str5 = c1094510eaX.LIZ) == null) {
                    str5 = "";
                }
                c474500IjALIZ.LJJII(str5, "log_id");
                c474500IjALIZ.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        int i3 = c1094360eaI.LIZ;
        int i4 = userGrade.currentGrade;
        long id2 = 0;
        if (i3 > i4 && !z2 && j4 > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("viewModel currentLevel  = ");
            sbLIZ.append(c1094360eaI.LIZ);
            sbLIZ.append(" but api response is ");
            sbLIZ.append(userGrade.currentGrade);
            C20441214yg.LJ("UserLevelViewModel", C2188811AlT.LIZIZ(sbLIZ));
            if (i == 2) {
                C496760Jdy.LJFF(Integer.valueOf(c1094360eaI.LIZ), Long.valueOf(c1094360eaI.LIZIZ), Integer.valueOf(userGrade.currentGrade), Long.valueOf(userGrade.currentScore), -1);
                return null;
            }
            return null;
        }
        long j5 = c1094360eaI.LIZIZ;
        long j6 = userGrade.currentScore;
        if (j5 > j6 && !z2 && j4 > 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("viewModel currentScore  = ");
            sbLIZ2.append(c1094360eaI.LIZIZ);
            sbLIZ2.append(" but api response is ");
            sbLIZ2.append(userGrade.currentScore);
            C20441214yg.LJ("UserLevelViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            if (i == 2) {
                C496760Jdy.LJFF(Integer.valueOf(c1094360eaI.LIZ), Long.valueOf(c1094360eaI.LIZIZ), Integer.valueOf(userGrade.currentGrade), Long.valueOf(userGrade.currentScore), -2);
                return null;
            }
            return null;
        }
        BadgeStruct badgeStruct = userGrade.opacityBadge;
        if (badgeStruct == null) {
            badgeStruct = c1094360eaI.LIZJ;
        }
        BadgeStruct badgeStruct2 = userGrade.defaultGradeBadge;
        if (badgeStruct2 == null) {
            badgeStruct2 = c1094360eaI.LIZLLL;
        }
        ImageModel imageModelOy0 = oy0(i4);
        int i5 = userGrade.gradeMode;
        GradeScoreRule gradeScoreRule = userGrade.gradeScoreRule;
        if (gradeScoreRule != null) {
            j = gradeScoreRule.gradeMinScore;
            j2 = gradeScoreRule.gradeMaxScore;
        } else {
            j = c1094360eaI.LJI;
            j2 = c1094360eaI.LJII;
        }
        long j7 = userGrade.timeToSleep;
        Integer numWQ2 = wQ2(userGrade.currentGrade);
        String strVQ2 = vQ2(userGrade.currentGrade);
        if (z) {
            iDoubleValue = userGrade.currentGrade;
        } else {
            Double dLIZ = InterfaceC1093700eZE.Jf.LIZ();
            if (dLIZ != null) {
                iDoubleValue = (int) dLIZ.doubleValue();
            } else {
                iDoubleValue = 0;
            }
        }
        C1094360eaI c1094360eaILIZ = C1094360eaI.LIZ(i4, j6, badgeStruct, badgeStruct2, imageModelOy0, i5, j, j2, j7, numWQ2, strVQ2, iDoubleValue, i, userGrade.version);
        InterfaceC1093700eZE.Pf.LIZJ(String.valueOf(System.currentTimeMillis() + (((long) userGrade.timeToSleep) * 1000)));
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 != null) {
            dataChannel2.zW(UserLevelChannel.class, c1094360eaILIZ);
        }
        C1094450eaR.LIZ = c1094360eaILIZ;
        InterfaceC1094160eZy.W1.LJFF(Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (!Intrinsics.LJFF(str, "user_level_data_holder")) {
            C1094450eaR.LIZIZ = userGrade;
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            } else {
                currentUserId = 0;
            }
            C1094450eaR.LJIIIZ = String.valueOf(currentUserId);
        }
        if (z) {
            InterfaceC1093700eZE.Jf.LIZJ(Double.valueOf(c1094360eaILIZ.LIZ));
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.gg0(C1148310fzJ.class);
        if (c1094360eaI.LJFF != 1 && c1094360eaILIZ.LJFF == 1 && c1094360eaI.LJIIL != 1) {
            C496760Jdy.LJIIIIZZ(Integer.valueOf(c1094360eaI.LIZ), Integer.valueOf(c1094360eaI.LJFF), Integer.valueOf(c1094360eaILIZ.LIZ), Long.valueOf(c1094360eaI.LIZIZ), Long.valueOf(c1094360eaILIZ.LIZIZ), Integer.valueOf(c1094360eaILIZ.LJFF));
            DataChannel dataChannel3 = getDataChannel();
            if (dataChannel3 != null) {
                dataChannel3.LC0(UserLevelEvent.class, C1090310eTl.LIZ);
            }
            if (c1094360eaI.LJFF == 3) {
                ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).gN("gift", Boolean.FALSE, "");
                DataChannel dataChannel4 = getDataChannel();
                if (dataChannel4 != null) {
                    dataChannel4.LC0(UserLevelEvent.class, C1090330eTn.LIZ);
                }
            }
        }
        if (c1094360eaI.LJFF == 1 && c1094360eaILIZ.LJFF == 2 && c1094360eaI.LJIIL != 1) {
            C496760Jdy.LJIIIIZZ(Integer.valueOf(c1094360eaI.LIZ), Integer.valueOf(c1094360eaI.LJFF), Integer.valueOf(c1094360eaILIZ.LIZ), Long.valueOf(c1094360eaI.LIZIZ), Long.valueOf(c1094360eaILIZ.LIZIZ), Integer.valueOf(c1094360eaILIZ.LJFF));
        }
        if (c1094360eaI.LIZ >= 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("nextLevel: ");
            sbLIZ3.append(c1094360eaILIZ.LIZ);
            sbLIZ3.append(", currentLevel: ");
            sbLIZ3.append(c1094360eaI.LIZ);
            sbLIZ3.append(", scene: ");
            sbLIZ3.append(c1094360eaI.LJIIL);
            C20441214yg.LJIIIZ("UserLevelViewModel", C2188811AlT.LIZIZ(sbLIZ3));
            if (c1094360eaILIZ.LIZ > c1094360eaI.LIZ && c1094360eaI.LJIIL != 1 && UserLevelUpActionEnableSetting.INSTANCE.getValue()) {
                C0JT6<Boolean> c0jt6 = InterfaceC1093700eZE.Qf;
                Boolean bool2 = Boolean.TRUE;
                c0jt6.LIZJ(bool2);
                C496760Jdy.LIZ = str2;
                int i6 = c1094360eaILIZ.LIZ;
                boolean zTj1 = Tj1(c1094360eaI.LIZ);
                int i7 = c1094360eaI.LIZ;
                Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if (room != null) {
                    id = room.getId();
                    if (room.getOwner() != null) {
                        id2 = room.getOwner().getId();
                    }
                } else {
                    id = 0;
                }
                long currentUserId2 = UserService.getInstance().user().getCurrentUserId();
                if (zTj1) {
                    str3 = "big";
                } else {
                    str3 = "small";
                }
                if (i7 <= 0) {
                    str3 = "new";
                }
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_user_level_up_success");
                c474500IjALIZ2.LJIL();
                c474500IjALIZ2.LJJII(Integer.valueOf(Intrinsics.LJFF(bool, bool2) ? 1 : 0), "is_combo");
                c474500IjALIZ2.LJJII(Long.valueOf(id), "room_id");
                c474500IjALIZ2.LJJII(Long.valueOf(id2), "anchor_id");
                if (str2 == null) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                c474500IjALIZ2.LJJII(str4, "trigger_payment");
                c474500IjALIZ2.LJJII(Long.valueOf(currentUserId2), "user_id");
                c474500IjALIZ2.LJJII(Integer.valueOf(i7), "up_before_user_level");
                c474500IjALIZ2.LJJII(Integer.valueOf(i6), "user_level");
                c474500IjALIZ2.LJJII(str3, "level_up_type");
                c474500IjALIZ2.LIZ();
                DataChannel dataChannel5 = getDataChannel();
                if (dataChannel5 != null) {
                    dataChannel5.LC0(UserLevelEvent.class, new C1090300eTk(c1094360eaILIZ));
                }
            }
            if (c1094360eaILIZ.LIZIZ > c1094360eaI.LIZIZ) {
                Iterator<Integer> it2 = UserLevelUnlockLevelSetting.INSTANCE.getValue().iterator();
                while (it2.hasNext()) {
                    int iIntValue = it2.next().intValue();
                    if (iIntValue > c1094360eaI.LIZ && iIntValue <= c1094360eaILIZ.LIZ) {
                        i2++;
                    }
                }
                Integer numValueOf3 = Integer.valueOf(c1094360eaI.LIZ);
                Long lValueOf = Long.valueOf(c1094360eaI.LIZIZ);
                Integer numValueOf4 = Integer.valueOf(c1094360eaI.LJFF);
                Integer numValueOf5 = Integer.valueOf(c1094360eaILIZ.LIZ);
                Long lValueOf2 = Long.valueOf(c1094360eaILIZ.LIZIZ);
                Integer numValueOf6 = Integer.valueOf(c1094360eaILIZ.LJFF);
                Integer numValueOf7 = Integer.valueOf(i2);
                try {
                    C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_user_level_updated", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
                    c474500IjALIZIZ.LJIL();
                    C496760Jdy.LIZ(c474500IjALIZIZ);
                    c474500IjALIZIZ.LJJII(Integer.valueOf(C496760Jdy.LIZIZ(bool)), "is_combo");
                    c474500IjALIZIZ.LJJII(numValueOf3, "current_grade");
                    c474500IjALIZIZ.LJJII(lValueOf, "current_score");
                    c474500IjALIZIZ.LJJII(numValueOf4, "current_grade_mode");
                    c474500IjALIZIZ.LJJII(numValueOf5, "grade");
                    c474500IjALIZIZ.LJJII(lValueOf2, "score");
                    if (str2 != null) {
                        str6 = str2;
                    }
                    c474500IjALIZIZ.LJJII(str6, "trigger_payment");
                    c474500IjALIZIZ.LJJII(numValueOf6, "grade_mode");
                    c474500IjALIZIZ.LJJII(str, Scene.SCENE_SERVICE);
                    c474500IjALIZIZ.LJJII(numValueOf7, "cross_unlock_num");
                    c474500IjALIZIZ.LIZ();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            yQ2(c1094360eaILIZ);
        }
        return c1094360eaILIZ;
    }
}
