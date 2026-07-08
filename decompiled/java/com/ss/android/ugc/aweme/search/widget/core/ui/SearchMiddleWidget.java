package com.ss.android.ugc.aweme.search.widget.core.ui;

import X.C05IY;
import X.C0QDB;
import X.C0QNM;
import X.C0QSK;
import X.C10EU;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C669400QNm;
import X.C669420QNo;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.InterfaceC1331910klR;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.search.widget.core.model.ExtraInfo;
import com.ss.android.ugc.aweme.search.widget.core.model.SearchWidgetModel;
import com.ss.android.ugc.aweme.search.widget.core.model.SearchWidgetSuggestWord;
import com.ss.android.ugc.aweme.search.widget.core.model.WordParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMiddleWidget extends C0QSK {
    @Override // X.C0QSK
    public final void LJ() {
    }

    @Override // X.C0QSK, android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        super.onDisabled(context);
        Keva keva = (Keva) C669420QNo.LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guide_");
        sbLIZ.append("function_entry_medium");
        keva.erase(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0QSK
    public final void LIZIZ(Intent intent, int i, Map map) throws JSONException {
        Bundle bundle = new Bundle();
        if (i == R.id.tv_search) {
            intent.putExtra("url", "//search");
            C786410Ut5.LJJJI("enter_from", "search_widget", bundle);
            C786410Ut5.LJJJI("enter_method", "default_search_keyword", bundle);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("widget_type", "function_entry_medium");
            jSONObject.put("add_widget_type", C669420QNo.LIZ("function_entry_medium"));
            C786410Ut5.LJJJI("extraLogParams", C786410Ut5.J3(jSONObject), bundle);
            C0QNM.LIZ.getClass();
            if (C0QNM.LIZ().length() > 0) {
                C786410Ut5.LJJJI("keyword", C0QNM.LIZ(), bundle);
                bundle.putInt("back_flag", 2);
                bundle.putBoolean("in_single_stack", true);
                intent.putExtra("click_type", "click_search_result");
                String str = (String) map.get("penetrate_info");
                if (str != null) {
                    intent.putExtra("penetrate_info", str);
                }
            } else {
                intent.putExtra("click_type", "click_enter_search");
            }
        } else if (i == R.id.ndd) {
            String strLIZIZ = C669400QNm.LIZIZ(0);
            if (strLIZIZ == null) {
                strLIZIZ = "//main?tab=0&com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=HOME";
            }
            intent.putExtra("url", strLIZIZ);
            intent.putExtra("click_type", "click_follow");
        } else if (i == R.id.ngj) {
            String strLIZIZ2 = C669400QNm.LIZIZ(1);
            if (strLIZIZ2 == null) {
                strLIZIZ2 = "aweme://openShoot";
            }
            intent.putExtra("url", strLIZIZ2);
            intent.putExtra("click_type", "click_post");
        } else if (i == R.id.ne3) {
            String strLIZIZ3 = C669400QNm.LIZIZ(2);
            if (strLIZIZ3 == null) {
                strLIZIZ3 = "//main?com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=NOTIFICATION";
            }
            intent.putExtra("url", strLIZIZ3);
            intent.putExtra("click_type", "click_message");
        } else if (i == R.id.nbp) {
            if (C10EU.LJIILIIL()) {
                intent.putExtra("url", "//kids/main");
            } else {
                intent.putExtra("url", "//main");
            }
            intent.putExtra("click_type", "click_fyp");
        }
        intent.putExtra("extra_jump_type", 14);
        C0QNM.LIZ.getClass();
        intent.putExtra("data_model", C0QNM.LIZJ.LIZIZ);
        intent.putExtra("search_extra", bundle);
    }

    @Override // X.C0QSK
    public final void LJFF(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        SearchWidgetSuggestWord[] suggestWords;
        WordParams params;
        ExtraInfo extraInfo;
        String penetrateInfo;
        C0QNM.LIZ.getClass();
        C05IY<SearchWidgetModel> c05iy = C0QNM.LIZJ;
        if (c05iy.LIZ == 1) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.r5);
            remoteViews.setOnClickPendingIntent(R.id.nbp, C0QSK.LIZLLL(this, R.id.nbp, context, null, 12));
            appWidgetManager.updateAppWidget(iArr, remoteViews);
            return;
        }
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.r4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SearchWidgetModel searchWidgetModel = c05iy.LIZIZ;
        if (searchWidgetModel != null) {
            suggestWords = searchWidgetModel.getSuggestWords();
        } else {
            suggestWords = null;
        }
        if (suggestWords != null && suggestWords.length != 0 && (params = suggestWords[0].getParams()) != null && (extraInfo = params.getExtraInfo()) != null && (penetrateInfo = extraInfo.getPenetrateInfo()) != null) {
            linkedHashMap.put("penetrate_info", penetrateInfo);
        }
        remoteViews2.setOnClickPendingIntent(R.id.tv_search, C0QSK.LIZLLL(this, R.id.tv_search, context, linkedHashMap, 4));
        remoteViews2.setTextViewText(R.id.zml, context.getText(R.string.sqv));
        remoteViews2.setTextViewText(R.id.tv_post, context.getText(R.string.sqw));
        remoteViews2.setTextViewText(R.id.zqp, context.getText(R.string.sqx));
        remoteViews2.setOnClickPendingIntent(R.id.ndd, C0QSK.LIZLLL(this, R.id.ndd, context, null, 12));
        remoteViews2.setOnClickPendingIntent(R.id.ngj, C0QSK.LIZLLL(this, R.id.ngj, context, null, 12));
        remoteViews2.setOnClickPendingIntent(R.id.ne3, C0QSK.LIZLLL(this, R.id.ne3, context, null, 12));
        if (c05iy.LIZ == 2) {
            SearchWidgetModel searchWidgetModel2 = c05iy.LIZIZ;
            if (searchWidgetModel2 != null) {
                String firstGuessWord = searchWidgetModel2.getFirstGuessWord();
                remoteViews2.setTextViewText(R.id.tv_search, firstGuessWord);
                C0QDB c0qdb = C0QDB.LIZ;
                C2097608Jq.LJ();
                c0qdb.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("search_position", "search_widget");
                c2344009Gk.LJIIIIZZ("words_source", "widget_default_search_keyword");
                c2344009Gk.LJIIIIZZ("widget_type", "function_entry_medium");
                c2344009Gk.LJIIIIZZ("add_widget_type", C669420QNo.LIZ("function_entry_medium"));
                c2344009Gk.LIZJ(0, "words_position");
                c2344009Gk.LJFF("words_content", searchWidgetModel2.getFirstGuessWord());
                c2344009Gk.LJFF("group_id", searchWidgetModel2.getFirstGroupId());
                c2344009Gk.LJFF("impr_id", searchWidgetModel2.getLogId());
                C20684815ws.LJIILLIIL("trending_words_show", c2344009Gk.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("update  keyword:");
                sbLIZ.append(firstGuessWord);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } else {
            remoteViews2.setTextViewText(R.id.tv_search, context.getString(R.string.sr2));
        }
        appWidgetManager.updateAppWidget(iArr, remoteViews2);
        LJI(R.id.lhg, R.drawable.a63, appWidgetManager, remoteViews2, C669400QNm.LIZ(0), iArr);
        LJI(R.id.lrl, R.drawable.a66, appWidgetManager, remoteViews2, C669400QNm.LIZ(1), iArr);
        LJI(R.id.llh, R.drawable.a64, appWidgetManager, remoteViews2, C669400QNm.LIZ(2), iArr);
    }

    public static void LJI(final int i, final int i2, final AppWidgetManager appWidgetManager, final RemoteViews remoteViews, String str, final int[] iArr) {
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_XY;
        c1331670kl3LJIIIZ.LJJII(new InterfaceC1331910klR() { // from class: X.0QNr
            @Override // X.InterfaceC1331910klR
            public final void onCanceled() {
            }

            @Override // X.InterfaceC1331910klR
            public final void onProgress(float f) {
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                remoteViews.setImageViewBitmap(i, bitmap);
                appWidgetManager.partiallyUpdateAppWidget(iArr, remoteViews);
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                remoteViews.setImageViewResource(i, i2);
                appWidgetManager.partiallyUpdateAppWidget(iArr, remoteViews);
            }
        });
    }
}
