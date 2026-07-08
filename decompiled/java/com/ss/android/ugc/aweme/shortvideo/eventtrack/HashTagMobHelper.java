package com.ss.android.ugc.aweme.shortvideo.eventtrack;

import X.C0LAB;
import X.C117V;
import X.C13LP;
import X.C15438062q;
import X.C20684815ws;
import X.C2188811AlT;
import X.C580270MpN;
import X.C736480Suk;
import X.C857150Xjt;
import X.C857430XkL;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: loaded from: classes15.dex */
public final class HashTagMobHelper extends ViewModel {
    public String LL;
    public LogPbBean LLILLJJLI;
    public RecommendWordMob LLILLL;
    public String LLILZ;
    public BaseTitleHelper LLILZIL;
    public List<? extends C117V> LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;

    public static String vQ2(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((AVChallenge) it2.next()).challengeName);
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ != null) {
                return strLJJLIIIJ;
            }
        }
        return "";
    }

    public static String wQ2(List list) {
        Object next;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((RecommendHashtag) it2.next()).getChallengeName());
            }
            Iterator it3 = arrayList.iterator();
            if (!it3.hasNext()) {
                next = null;
            } else {
                next = it3.next();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) next);
                    sbLIZ.append(',');
                    sbLIZ.append(str);
                    next = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            String str2 = (String) next;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final void AQ2(C857430XkL c857430XkL) {
        String str;
        C736480Suk c736480Suk = new C736480Suk();
        c736480Suk.LIZ("enter_method", c857430XkL.LIZJ);
        c736480Suk.LIZ("tag_id", c857430XkL.LIZLLL);
        c736480Suk.LIZ("tag_source", c857430XkL.LJFF);
        c736480Suk.LIZ("tag_content", c857430XkL.LIZ);
        c736480Suk.LIZ("rank", String.valueOf(c857430XkL.LIZIZ));
        c736480Suk.LIZ("creation_id", this.LL);
        String str2 = c857430XkL.LJ;
        if (str2 == null) {
            str2 = "";
        }
        c736480Suk.LIZ("query_id", str2);
        BaseTitleHelper baseTitleHelper = this.LLILZIL;
        if (baseTitleHelper != null) {
            str = baseTitleHelper.LLILLJJLI;
        } else {
            str = null;
        }
        c736480Suk.LIZ("title", str);
        c736480Suk.LIZ("log_id", c857430XkL.LJI);
        C20684815ws.LJIJ("show_tag_words", c736480Suk.LIZIZ());
    }

    public final void zQ2(String str) {
        String str2;
        if (Intrinsics.LJFF(str, "click_tag_button")) {
            this.LLIZ = true;
        } else if (this.LLIZ) {
            this.LLIZ = false;
            return;
        }
        BaseTitleHelper baseTitleHelper = this.LLILZIL;
        if (baseTitleHelper != null) {
            baseTitleHelper.vQ2();
        }
        this.LLIZLLLIL = str;
        C736480Suk c736480Suk = new C736480Suk();
        BaseTitleHelper baseTitleHelper2 = this.LLILZIL;
        if (baseTitleHelper2 != null) {
            str2 = baseTitleHelper2.LLILLJJLI;
        } else {
            str2 = null;
        }
        c736480Suk.LIZ("title", str2);
        c736480Suk.LIZ("creation_id", this.LL);
        c736480Suk.LIZ("enter_method", str);
        C20684815ws.LJIJ("show_tag", c736480Suk.LIZIZ());
    }

    public final void yQ2(C857430XkL c857430XkL, VideoPublishEditModel videoPublishEditModel, String str) {
        String str2;
        String str3;
        C857150Xjt c857150Xjt = C857150Xjt.LIZ;
        C0LAB c0lab = new C0LAB();
        String str4 = c857430XkL.LIZJ;
        String json = "";
        if (str4 == null) {
            str4 = "";
        }
        c0lab.LJ("enter_method", str4);
        String str5 = c857430XkL.LIZLLL;
        if (str5 == null) {
            str5 = "";
        }
        c0lab.LJ("tag_id", str5);
        c0lab.LJ("tag_source", c857430XkL.LJFF);
        c0lab.LJ("tag_content", c857430XkL.LIZ);
        c0lab.LJ("rank", String.valueOf(c857430XkL.LIZIZ));
        c0lab.LJ("creation_id", this.LL);
        String str6 = c857430XkL.LJ;
        if (str6 == null) {
            str6 = "";
        }
        c0lab.LJ("query_id", str6);
        BaseTitleHelper baseTitleHelper = this.LLILZIL;
        if (baseTitleHelper != null) {
            str2 = baseTitleHelper.LLILLJJLI;
        } else {
            str2 = null;
        }
        c0lab.LJ("title", str2);
        c0lab.LJ("log_id", c857430XkL.LJI);
        if (C857150Xjt.LIZIZ != null) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("after_post", str3);
        c857150Xjt.getClass();
        C857150Xjt.LIZ(c0lab);
        String str7 = this.LLILZ;
        if (str7 == null) {
            str7 = "";
        }
        c0lab.LJ("search_keyword", str7);
        LogPbBean logPbBean = this.LLILLJJLI;
        if (logPbBean != null) {
            json = GsonProtectorUtils.toJson(o.LIZIZ, logPbBean);
        }
        c0lab.LJ("log_pb", json);
        C580270MpN.LIZJ(videoPublishEditModel, c0lab, str);
        C20684815ws.LJIILLIIL("add_tag", c0lab.LIZ);
    }

    public final void xQ2(String str, C117V c117v, Integer num, String str2, VideoPublishEditModel videoPublishEditModel, String str3) {
        String str4 = str2;
        if (c117v != null && num != null) {
            num.intValue();
            String cid = c117v.LIZ.getCid();
            String str5 = c117v.LIZ.challengeName;
            if (str5 == null) {
                str5 = "";
            }
            if (str4 == null) {
                str4 = c117v.LJFF;
            }
            yQ2(new C857430XkL(str5, num, str, cid, str4), videoPublishEditModel, str3);
        }
    }
}
