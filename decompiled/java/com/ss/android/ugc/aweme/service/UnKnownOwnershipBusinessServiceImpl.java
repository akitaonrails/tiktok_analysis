package com.ss.android.ugc.aweme.service;

import X.AbstractC848400XPy;
import X.C0A61;
import X.C0C0D;
import X.C0XQ7;
import X.C1029590ctp;
import X.C1045220dJ2;
import X.C1062900dlY;
import X.C1063100dls;
import X.C10E9;
import X.C12ES;
import X.C1343890l4l;
import X.C1397510mTF;
import X.C13LE;
import X.C1581770rGR;
import X.C1618250sDH;
import X.C1618280sDK;
import X.C1911880zqs;
import X.C19268310Zt;
import X.C19268410Zu;
import X.C19268510Zv;
import X.C19276810bG;
import X.C19277110bJ;
import X.C19277910bR;
import X.C19719912Dl;
import X.C19EG;
import X.C1E90;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2273301DyS;
import X.C2344009Gk;
import X.C523420Kfs;
import X.C785410UrT;
import X.C816490W1f;
import X.C824390WVp;
import X.C844470XAv;
import X.DialogC19274510at;
import X.DialogC19307510gD;
import X.EnumC2239808q4;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.LegoAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.favorites.agents.AwemeCollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.main.assems.DialogAssem;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.requesttask.idle.AnchorListRequest;
import com.ss.android.ugc.aweme.requesttask.idle.FetchImUnder16RequestTask;
import com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes29.dex */
public final class UnKnownOwnershipBusinessServiceImpl implements IUnKnownOwnershipBusinessOuterService {
    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LIZ() {
        MainLooperOptService mainLooperOptServiceLJFF = MainLooperOptService.LJFF(null);
        if (mainLooperOptServiceLJFF != null) {
            MainLooperOptService.LJIILJJIL(mainLooperOptServiceLJFF.LLJI);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final C19719912Dl LJFF() {
        return C13LE.LIZ(LegoAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final C19719912Dl LJIIIIZZ() {
        return C13LE.LIZ(DialogAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJIJJLI() {
        MainLooperOptService mainLooperOptServiceLJFF = MainLooperOptService.LJFF(null);
        if (mainLooperOptServiceLJFF != null) {
            mainLooperOptServiceLJFF.LJIJJLI(EnumC2239808q4.WATCH_MAIN_FRAME);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final AnchorListRequest LJII() {
        return new AnchorListRequest();
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJIIIZ() {
        if (MainLooperOptService.LLJJJJLIIL) {
            MainLooperOptService.LJFF(EnumC2239808q4.WATCH_EXECUTE_TRANSACTION);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final FetchImUnder16RequestTask LJIIJ() {
        return new FetchImUnder16RequestTask();
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJIIL() {
        C1062900dlY c1062900dlY = C1063100dls.LIZ;
        if (((Boolean) C0A61.LIZ.getValue()).booleanValue()) {
            C1062900dlY c1062900dlY2 = C1063100dls.LIZ;
            c1062900dlY2.LIZ.clear();
            c1062900dlY2.LIZIZ.evictAll();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final AwemeCollectionTypeAdapterFactory LJIJ() {
        return new AwemeCollectionTypeAdapterFactory();
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJJIII() {
        MainLooperOptService mainLooperOptServiceLJFF;
        if (!MainLooperOptService.LLJJJJLIIL || (mainLooperOptServiceLJFF = MainLooperOptService.LJFF(null)) == null) {
            return;
        }
        ((HashMap) mainLooperOptServiceLJFF.LL).put(EnumC2239808q4.WATCH_EXECUTE_TRANSACTION, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final Gson LJJIIZI() {
        return new GsonHolder().getGson();
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final String LJ() {
        C19277910bR c19277910bRLJII = C19277910bR.LJII();
        c19277910bRLJII.getClass();
        return C1618280sDK.LIZ() ? c19277910bRLJII.LL : "";
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final MainLooperOptService LJI() {
        return MainLooperOptService.LJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final Gson LJIILL() {
        return GsonHolder.LIZIZ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final boolean LJIJI() {
        return C0C0D.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJJIJ() {
        C19277910bR.LJII().LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final String LJIILJJIL() {
        return C2273301DyS.LJI;
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJIIZILJ() {
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final boolean LIZIZ(Aweme aweme) {
        C1029590ctp.LJI().getClass();
        return C1045220dJ2.LJIIIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final boolean LIZJ(Music music) {
        ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null);
        if (iCommerceMediaService == null || !iCommerceMediaService.LIZJ(music)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final Locale LIZLLL(String str) {
        String str2 = C2273301DyS.LJFF;
        return C19268310Zt.LIZ.LIZIZ.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJIIJJI(Context context) {
        String str = C2273301DyS.LJFF;
        C19268310Zt.LIZ.getClass();
        C2273301DyS.LJ(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJIILIIL(View view) {
        MainLooperOptService mainLooperOptServiceLJFF = MainLooperOptService.LJFF(null);
        if (mainLooperOptServiceLJFF != null) {
            for (EnumC2239808q4 enumC2239808q4 : EnumC2239808q4.values()) {
                ((HashMap) mainLooperOptServiceLJFF.LL).put(enumC2239808q4, Boolean.FALSE);
            }
            mainLooperOptServiceLJFF.LJIJJLI(EnumC2239808q4.WATCH_FIRST_WINDOW_FOCUS_CHANGE);
            mainLooperOptServiceLJFF.LJIJJ(view);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJJ(C19EG c19eg) throws Throwable {
        if (c19eg != null && !c19eg.isFinishing() && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            DialogC19274510at dialogC19274510at = C19268510Zv.LIZ;
            if (dialogC19274510at != null) {
                dialogC19274510at.dismiss();
                C785410UrT.LIZ(dialogC19274510at);
                C19268510Zv.LIZ = null;
            }
            Boolean boolLIZ = SharePrefCache.inst().getPromoteDialogShouldShow().LIZ();
            if (boolLIZ != null && boolLIZ.booleanValue()) {
                String string = C19268510Zv.LIZ().getString("uid", "");
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                if (TextUtils.isEmpty(string)) {
                    SharedPreferences.Editor editorEdit = C19268510Zv.LIZ().edit();
                    editorEdit.putString("uid", curUserId);
                    editorEdit.apply();
                    string = curUserId;
                }
                if (!string.equals(curUserId)) {
                    SharedPreferences.Editor editorEdit2 = C19268510Zv.LIZ().edit();
                    editorEdit2.putBoolean("joined", false);
                    editorEdit2.putString("uid", curUserId);
                    editorEdit2.putInt("popup_times", 0);
                    editorEdit2.putLong("popup_last_time", 0L);
                    editorEdit2.apply();
                }
                if (!C19268510Zv.LIZ().getBoolean("joined", false)) {
                    int i = C19268510Zv.LIZ().getInt("popup_times", 0);
                    long j = C19268510Zv.LIZ().getLong("popup_last_time", 0L);
                    Integer numLIZ = SharePrefCache.inst().getPromoteDialogPopupPopupInterval().LIZ();
                    if (i < SharePrefCache.inst().getPromoteDialogPopupTimesLimit().LIZ().intValue() && System.currentTimeMillis() - j > numLIZ.intValue() * LSPassThroughRecordSizeConfig.DEFAULT * 3600 * 24) {
                        SharedPreferences.Editor editorEdit3 = C19268510Zv.LIZ().edit();
                        editorEdit3.putInt("popup_times", i + 1);
                        editorEdit3.putLong("popup_last_time", System.currentTimeMillis());
                        editorEdit3.apply();
                        C844470XAv.LIZ.getClass();
                        C12ES.LIZJ(52.0f, C844470XAv.LIZ());
                        DialogC19274510at dialogC19274510at2 = new DialogC19274510at(c19eg);
                        C19268510Zv.LIZ = dialogC19274510at2;
                        dialogC19274510at2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.10Zx
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                C19268510Zv.LIZ = null;
                            }
                        });
                        C20684815ws.LJIILLIIL("creative_permission_show", new C2344009Gk().LIZ);
                        DialogC19274510at dialogC19274510at3 = C19268510Zv.LIZ;
                        dialogC19274510at3.show();
                        C785410UrT.LIZIZ(dialogC19274510at3);
                        PopupMonitorServiceImpl.LIZ.getClass();
                        PopupMonitorServiceImpl.LJJJ(dialogC19274510at3);
                        C816490W1f.LIZ(dialogC19274510at3);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJJIIJ(Context context) {
        String str = C2273301DyS.LJFF;
        C19268310Zt.LIZ.LIZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJJIIZ(Context context) {
        WeakReference<C1397510mTF> weakReference;
        C1397510mTF c1397510mTF;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationsHelper.tryDismissOptInDialog() - hasPermission");
        sbLIZ.append(C824390WVp.LIZJ(context));
        C2188811AlT.LIZIZ(sbLIZ);
        if (C824390WVp.LIZJ(context) && (weakReference = C10E9.LIZ) != null && (c1397510mTF = weakReference.get()) != null) {
            c1397510mTF.LIZIZ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void updateRootViewAndState(View view) {
        MainLooperOptService mainLooperOptServiceLJFF = MainLooperOptService.LJFF(null);
        if (mainLooperOptServiceLJFF != null) {
            mainLooperOptServiceLJFF.LJIJJ(view);
            mainLooperOptServiceLJFF.LJIJJLI(EnumC2239808q4.WATCH_FIRST_WINDOW_FOCUS_CHANGE);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final boolean LJIILLIIL(int i, int i2) throws Throwable {
        Cursor cursor;
        int i3;
        C1911880zqs.LIZ.getClass();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseLJIILIIL = ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIILIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("open_time");
            sbLIZ.append(" > ?");
            boolean z = true;
            Cursor cursorQuery2 = sQLiteDatabaseLJIILIIL.query(true, "app_open", null, C2188811AlT.LIZIZ(sbLIZ), new String[]{String.valueOf(System.currentTimeMillis() - ((long) (86400000 * i)))}, null, null, null, null);
            if (cursorQuery2 == null) {
                return false;
            }
            try {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("open_time");
                sbLIZ2.append(" = ?");
                cursorQuery = sQLiteDatabaseLJIILIIL.query(true, "app_open", null, C2188811AlT.LIZIZ(sbLIZ2), new String[]{String.valueOf(calendar.getTimeInMillis())}, null, null, null, null);
                if (cursorQuery.getCount() > 0) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                if (cursorQuery2.getCount() + i3 < i2) {
                    z = false;
                }
                cursorQuery2.close();
                cursorQuery.close();
                return z;
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                cursorQuery = cursorQuery2;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJIL(Context context, String str) {
        C10E9.LJII(context, true, null, true, false, str, null, null);
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJJI(long j, AwS623S0100000_9 awS623S0100000_9) {
        IAddYoursStickerRecordService iAddYoursStickerRecordService = (IAddYoursStickerRecordService) PluggableExtentionKt.pluggableSpi$default(IAddYoursStickerRecordService.class, false, false, false, 14, null);
        if (iAddYoursStickerRecordService != null) {
            iAddYoursStickerRecordService.LIZIZ(j, awS623S0100000_9);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJJIFFI(int i, C19EG c19eg) {
        if (C19268410Zu.LLILZLL == null) {
            synchronized (C19268410Zu.class) {
                try {
                    if (C19268410Zu.LLILZLL == null) {
                        C19268410Zu.LLILZLL = new C19268410Zu();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C19268410Zu c19268410Zu = C19268410Zu.LLILZLL;
        c19268410Zu.getClass();
        if (c19eg != null && !c19eg.isFinishing() && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            DialogC19307510gD dialogC19307510gD = C19268410Zu.LLILZ;
            if (dialogC19307510gD != null) {
                dialogC19307510gD.dismiss();
                C785410UrT.LIZ(dialogC19307510gD);
                C19268410Zu.LLILZ = null;
            }
            WeakReference<Activity> weakReference = c19268410Zu.LLILLL;
            if (weakReference == null || c19eg != weakReference.get()) {
                c19268410Zu.LLILLL = new WeakReference<>(c19eg);
            }
            WeakHandler weakHandler = c19268410Zu.LL;
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            SharedPreferences sharedPreferencesLIZ = C19268410Zu.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last_pop_time_");
            sbLIZ.append(curUserId);
            if (DateUtils.isToday(sharedPreferencesLIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L))) {
                c19268410Zu.LIZIZ();
            } else {
                C1E90.LIZIZ.LIZJ(weakHandler, 2, i);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final C1618250sDH LJJIIJZLJL(C19EG c19eg, C1581770rGR c1581770rGR) {
        return new C1618250sDH(c19eg, c1581770rGR);
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJIJJ(String str, String str2, Context context, C19277110bJ c19277110bJ) {
        String str3 = C2273301DyS.LJFF;
        C2273301DyS c2273301DyS = C19268310Zt.LIZ;
        I18nManagerServiceApi i18nManagerServiceApi = c2273301DyS.LIZIZ;
        if (i18nManagerServiceApi != null) {
            i18nManagerServiceApi.LIZ(context, new C19276810bG(c2273301DyS, context, str, c19277110bJ), str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService
    public final void LJJII(String str, String str2, String str3, String str4, long j, Aweme aweme) {
        CommentService.LIZ.getClass();
        if (!C523420Kfs.LIZ().LLIFFJFJJ(aweme)) {
            C523420Kfs.LIZ().LJJJIL(str, str3, C1343890l4l.LIZ(aweme.getAuthor(), str3), str4, j);
        }
    }
}
