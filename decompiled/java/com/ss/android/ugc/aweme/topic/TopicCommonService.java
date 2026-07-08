package com.ss.android.ugc.aweme.topic;

import X.C04TD;
import X.C0C64;
import X.C1391600mJi;
import X.C20684815ws;
import X.C450720Hlu;
import X.EnumC1235690iGF;
import X.EnumC1430380nKG;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.topic.book.experiment.BookTokPublishSettings;
import com.ss.android.ugc.aweme.topic.movie.experiment.MovieTokPublishSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class TopicCommonService implements ITopicCommonService {
    public static ITopicCommonService LIZJ() {
        Object objLIZ = C04TD.LIZ(ITopicCommonService.class, false);
        if (objLIZ != null) {
            return (ITopicCommonService) objLIZ;
        }
        if (C04TD.L5 == null) {
            synchronized (ITopicCommonService.class) {
                if (C04TD.L5 == null) {
                    C04TD.L5 = new TopicCommonService();
                }
            }
        }
        return C04TD.L5;
    }

    @Override // com.ss.android.ugc.aweme.topic.ITopicCommonService
    public final HashMap<Integer, Boolean> LIZIZ() {
        HashMap<Integer, Boolean> map = new HashMap<>();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_show_movietok", true, false)) {
            map.put(Integer.valueOf(EnumC1430380nKG.ANCHOR_MOVIETOK.getTYPE()), Boolean.FALSE);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_show_booktok", true, false)) {
            map.put(Integer.valueOf(EnumC1430380nKG.ANCHOR_BOOKTOK.getTYPE()), Boolean.FALSE);
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.topic.ITopicCommonService
    public final void LIZ(View view, String str, HashMap map) {
        boolean z;
        long jLongValue;
        List<String> list;
        AppCompatTextView appCompatTextView;
        long jLongValue2;
        List<String> list2;
        AppCompatTextView appCompatTextView2;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_show_movietok", true, false)) {
            z = true;
        } else {
            z = false;
        }
        if (z && !Intrinsics.LJFF(map.get(Integer.valueOf(EnumC1430380nKG.ANCHOR_MOVIETOK.getTYPE())), Boolean.TRUE)) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            MovieTokPublishSettings.MovieTokPublishSettingsModel movieTokPublishSettingsModel = MovieTokPublishSettings.LIZ;
            MovieTokPublishSettings.MovieTokPublishSettingsModel movieTokPublishSettingsModel2 = (MovieTokPublishSettings.MovieTokPublishSettingsModel) settingsManagerLIZLLL.LJIIIIZZ("movietok_publish_settings", MovieTokPublishSettings.MovieTokPublishSettingsModel.class, movieTokPublishSettingsModel);
            if (movieTokPublishSettingsModel2 != null) {
                movieTokPublishSettingsModel = movieTokPublishSettingsModel2;
            }
            Keva repo = Keva.getRepo("topic_movietok");
            int i = repo.getInt("guide_show_count", 0);
            long j = i;
            Long l = movieTokPublishSettingsModel.maxCountGuideShow;
            if (l != null) {
                jLongValue2 = l.longValue();
            } else {
                jLongValue2 = 0;
            }
            if (j < jLongValue2 && (list2 = movieTokPublishSettingsModel.keywords) != null && !list2.isEmpty()) {
                List<String> list3 = movieTokPublishSettingsModel.keywords;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<String> it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String next = it2.next();
                        if (next != null && a0.LJJIIZI(str, next, true)) {
                            repo.storeInt("guide_show_count", i + 1);
                            map.put(Integer.valueOf(EnumC1430380nKG.ANCHOR_MOVIETOK.getTYPE()), Boolean.TRUE);
                            C20684815ws.onEventV3("add_movie_guide_show");
                            if ((view instanceof TuxTextView) && (appCompatTextView2 = (AppCompatTextView) view) != null) {
                                int iMeasureText = (int) ((appCompatTextView2.getPaint().measureText(appCompatTextView2.getText().toString()) - appCompatTextView2.getMeasuredWidth()) / 2);
                                C450720Hlu c450720Hlu = new C450720Hlu(view.getContext());
                                c450720Hlu.LLILLJJLI.LIZIZ = view;
                                c450720Hlu.LJIIJ(2131837504);
                                EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
                                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                                c1391600mJi.LIZLLL = enumC1235690iGF;
                                c1391600mJi.LJ = iMeasureText;
                                c1391600mJi.LJI = iMeasureText;
                                c1391600mJi.LJII = 3000L;
                                c450720Hlu.LIZIZ().show();
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_show_booktok", true, false) && !Intrinsics.LJFF(map.get(Integer.valueOf(EnumC1430380nKG.ANCHOR_BOOKTOK.getTYPE())), Boolean.TRUE)) {
            SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
            BookTokPublishSettings.BookTokPublishSettingsModel bookTokPublishSettingsModel = BookTokPublishSettings.LIZ;
            BookTokPublishSettings.BookTokPublishSettingsModel bookTokPublishSettingsModel2 = (BookTokPublishSettings.BookTokPublishSettingsModel) settingsManagerLIZLLL2.LJIIIIZZ("booktok_publish_settings", BookTokPublishSettings.BookTokPublishSettingsModel.class, bookTokPublishSettingsModel);
            if (bookTokPublishSettingsModel2 == null) {
                if (bookTokPublishSettingsModel == null) {
                    return;
                }
            } else {
                bookTokPublishSettingsModel = bookTokPublishSettingsModel2;
            }
            Keva repo2 = Keva.getRepo("topic_booktok");
            int i2 = repo2.getInt("guide_show_count", 0);
            long j2 = i2;
            Long l2 = bookTokPublishSettingsModel.maxCountGuideShow;
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            if (j2 >= jLongValue || (list = bookTokPublishSettingsModel.keywords) == null || list.isEmpty()) {
                return;
            }
            List<String> list4 = bookTokPublishSettingsModel.keywords;
            if ((list4 instanceof Collection) && list4.isEmpty()) {
                return;
            }
            for (String str2 : list4) {
                if (str2 != null && a0.LJJIIZI(str, str2, true)) {
                    C20684815ws.onEventV3("add_book_guide_show");
                    repo2.storeInt("guide_show_count", i2 + 1);
                    map.put(Integer.valueOf(EnumC1430380nKG.ANCHOR_BOOKTOK.getTYPE()), Boolean.TRUE);
                    if (!(view instanceof TuxTextView) || (appCompatTextView = (AppCompatTextView) view) == null) {
                        return;
                    }
                    int iMeasureText2 = (int) ((appCompatTextView.getPaint().measureText(appCompatTextView.getText().toString()) - appCompatTextView.getMeasuredWidth()) / 2);
                    C450720Hlu c450720Hlu2 = new C450720Hlu(view.getContext());
                    c450720Hlu2.LLILLJJLI.LIZIZ = view;
                    c450720Hlu2.LJIIJ(2131827854);
                    EnumC1235690iGF enumC1235690iGF2 = EnumC1235690iGF.TOP;
                    C1391600mJi c1391600mJi2 = c450720Hlu2.LLILLJJLI;
                    c1391600mJi2.LIZLLL = enumC1235690iGF2;
                    c1391600mJi2.LJ = iMeasureText2;
                    c1391600mJi2.LJI = iMeasureText2;
                    c1391600mJi2.LJII = 3000L;
                    c450720Hlu2.LIZIZ().show();
                    return;
                }
            }
        }
    }
}
