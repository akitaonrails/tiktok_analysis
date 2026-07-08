package com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui;

import X.AbstractC681090Qnb;
import X.C0BCC;
import X.C0QNF;
import X.C1308910kAL;
import X.C15IK;
import X.C1848410yCV;
import X.C20684815ws;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C294590Bgf;
import X.C419910GdJ;
import X.C427690Gpr;
import X.C669090QMh;
import X.C680990QnR;
import X.C681010QnT;
import X.C681050QnX;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.RunnableC514501zT;
import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMusicSugCell extends PowerCell<C681010QnT> {
    public SearchSugEntity LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        TextView textView;
        super.onItemViewCreated();
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.itemView.findViewById(R.id.lwd);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_up_left_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        appCompatImageView.setImageDrawable(c419910GdJ.LIZ(this.itemView.getContext()));
        View view = this.itemView;
        C427690Gpr.LJ(view, 0.0f);
        C427690Gpr.LJI(view.findViewById(R.id.lwd), null);
        if (!C0BCC.LIZ() || (textView = (TextView) this.itemView.findViewById(R.id.tv_sug)) == null) {
            return;
        }
        C669090QMh c669090QMh = C669090QMh.LIZ;
        Context context = this.itemView.getContext();
        c669090QMh.getClass();
        textView.setTextColor(C669090QMh.LJI(context));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer numLIZJ;
        String id;
        String str;
        String strIsHistorySug;
        String strIsPersonalized;
        String queryLang;
        String recallReason;
        final C681010QnT c681010QnT = (C681010QnT) interfaceC1891350zJl;
        super.onBindItemView(c681010QnT);
        this.LL = c681010QnT.LL;
        int layoutPosition = getLayoutPosition();
        SearchSugEntity searchSugEntity = this.LL;
        if (searchSugEntity != null && !searchSugEntity.LIZLLL) {
            searchSugEntity.LIZLLL = true;
            C680990QnR c680990QnR = new C680990QnR();
            c680990QnR.LIZJ("words_source", "sug");
            c680990QnR.LIZJ("search_entrance", C15IK.LIZ);
            c680990QnR.LIZJ("search_position", "video_music");
            c680990QnR.LIZ(layoutPosition, "words_position");
            c680990QnR.LIZJ("words_content", searchSugEntity.content);
            Word word = searchSugEntity.mWord;
            String str2 = "";
            if (word == null || (id = word.getId()) == null) {
                id = "";
            }
            c680990QnR.LIZJ("group_id", id);
            c680990QnR.LIZJ("creation_id", C15IK.LJ);
            c680990QnR.LIZJ("words_horder", "other");
            c680990QnR.LIZIZ(searchSugEntity.LJ);
            c680990QnR.LIZJ("new_sug_session_id", C681050QnX.LIZ);
            if (C0QNF.LIZJ(searchSugEntity)) {
                str = "enrich_sug";
            } else {
                str = "normal_sug";
            }
            c680990QnR.LIZJ("sug_type", str);
            SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo == null || (strIsHistorySug = sugExtraInfo.isHistorySug()) == null) {
                strIsHistorySug = "";
            }
            c680990QnR.LIZJ("is_history_sug", strIsHistorySug);
            SugExtraInfo sugExtraInfo2 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo2 == null || (strIsPersonalized = sugExtraInfo2.isPersonalized()) == null) {
                strIsPersonalized = "";
            }
            c680990QnR.LIZJ("is_personalized", strIsPersonalized);
            SugExtraInfo sugExtraInfo3 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo3 == null || (queryLang = sugExtraInfo3.getQueryLang()) == null) {
                queryLang = "";
            }
            c680990QnR.LIZJ("query_lang", queryLang);
            SugExtraInfo sugExtraInfo4 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo4 != null && (recallReason = sugExtraInfo4.getRecallReason()) != null) {
                str2 = recallReason;
            }
            c680990QnR.LIZJ("recall_reason", str2);
            C20684815ws.LJIILLIIL("trending_words_show", c680990QnR.LIZ);
        }
        View view = this.itemView;
        View viewFindViewById = view.findViewById(R.id.lwd);
        View.OnClickListener aCListenerS145S0100000_10 = new ACListenerS145S0100000_10(this, 65);
        if (C1848410yCV.LIZ) {
            aCListenerS145S0100000_10 = new f(aCListenerS145S0100000_10);
        }
        a aVar = new a(aCListenerS145S0100000_10);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(viewFindViewById);
        }
        viewFindViewById.setOnClickListener(aVar);
        AbstractC681090Qnb abstractC681090Qnb = new AbstractC681090Qnb() { // from class: X.0QnQ
            @Override // X.AbstractC681090Qnb
            public final void LIZLLL(View view2) {
                SearchSugEntity searchSugEntity2;
                String str3;
                String id2;
                String str4;
                String strIsHistorySug2;
                String strIsPersonalized2;
                String queryLang2;
                String recallReason2;
                if (!C0OBG.LIZIZ(view2) && (searchSugEntity2 = this.LLILLJJLI.LL) != null && !TextUtils.isEmpty(searchSugEntity2.content)) {
                    int layoutPosition2 = this.LLILLJJLI.getLayoutPosition();
                    SearchSugEntity searchSugEntity3 = this.LLILLJJLI.LL;
                    if (searchSugEntity3 != null) {
                        C680990QnR c680990QnR2 = new C680990QnR();
                        c680990QnR2.LIZJ("words_source", "sug");
                        c680990QnR2.LIZJ("search_position", "video_music");
                        c680990QnR2.LIZ(layoutPosition2, "words_position");
                        c680990QnR2.LIZJ("words_content", searchSugEntity3.content);
                        Word word2 = searchSugEntity3.mWord;
                        String str5 = "";
                        if (word2 == null || (id2 = word2.getId()) == null) {
                            id2 = "";
                        }
                        c680990QnR2.LIZJ("group_id", id2);
                        c680990QnR2.LIZJ("creation_id", C15IK.LJ);
                        c680990QnR2.LIZJ("words_horder", "other");
                        c680990QnR2.LIZIZ(searchSugEntity3.LJ);
                        c680990QnR2.LIZJ("new_sug_session_id", C681050QnX.LIZ);
                        if (C0QNF.LIZJ(searchSugEntity3)) {
                            str4 = "enrich_sug";
                        } else {
                            str4 = "normal_sug";
                        }
                        c680990QnR2.LIZJ("sug_type", str4);
                        SugExtraInfo sugExtraInfo5 = searchSugEntity3.sugExtraInfo;
                        if (sugExtraInfo5 == null || (strIsHistorySug2 = sugExtraInfo5.isHistorySug()) == null) {
                            strIsHistorySug2 = "";
                        }
                        c680990QnR2.LIZJ("is_history_sug", strIsHistorySug2);
                        SugExtraInfo sugExtraInfo6 = searchSugEntity3.sugExtraInfo;
                        if (sugExtraInfo6 == null || (strIsPersonalized2 = sugExtraInfo6.isPersonalized()) == null) {
                            strIsPersonalized2 = "";
                        }
                        c680990QnR2.LIZJ("is_personalized", strIsPersonalized2);
                        SugExtraInfo sugExtraInfo7 = searchSugEntity3.sugExtraInfo;
                        if (sugExtraInfo7 == null || (queryLang2 = sugExtraInfo7.getQueryLang()) == null) {
                            queryLang2 = "";
                        }
                        c680990QnR2.LIZJ("query_lang", queryLang2);
                        SugExtraInfo sugExtraInfo8 = searchSugEntity3.sugExtraInfo;
                        if (sugExtraInfo8 != null && (recallReason2 = sugExtraInfo8.getRecallReason()) != null) {
                            str5 = recallReason2;
                        }
                        c680990QnR2.LIZJ("recall_reason", str5);
                        C20684815ws.LJIILLIIL("trending_words_click", c680990QnR2.LIZ);
                    }
                    C679990Qlp c679990Qlp = new C679990Qlp();
                    c679990Qlp.LIZJ = false;
                    this.LLILLJJLI.getLayoutPosition();
                    SearchSugEntity searchSugEntity4 = this.LLILLJJLI.LL;
                    String str6 = null;
                    if (searchSugEntity4 != null) {
                        str3 = searchSugEntity4.content;
                    } else {
                        str3 = null;
                    }
                    c679990Qlp.LIZIZ = str3;
                    c679990Qlp.LIZ = "search_sug";
                    c679990Qlp.LJIIIIZZ = "other";
                    C1440005kM.LIZIZ(new C681320Qny(c679990Qlp));
                    InterfaceC681060QnY interfaceC681060QnY = c681010QnT.LLILLJJLI;
                    int layoutPosition3 = this.LLILLJJLI.getLayoutPosition();
                    SearchSugEntity searchSugEntity5 = this.LLILLJJLI.LL;
                    if (searchSugEntity5 != null) {
                        str6 = searchSugEntity5.content;
                    }
                    interfaceC681060QnY.x7(layoutPosition3, str6);
                }
            }
        };
        abstractC681090Qnb.LL = false;
        view.setOnTouchListener(abstractC681090Qnb);
        SearchSugEntity searchSugEntity2 = c681010QnT.LL;
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_sug);
        View view2 = this.itemView;
        textView.setText(C0QNF.LIZ(searchSugEntity2, view2.getContext()));
        HandlerHook.viewPost(textView, new RunnableC514501zT(textView, view2, 22));
        if (C294590Bgf.LIZ() && !C0BCC.LIZ() && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, this.itemView.getContext())) != null) {
            ((TextView) this.itemView.findViewById(R.id.tv_sug)).setTextColor(numLIZJ.intValue());
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.itemView.findViewById(R.id.lwd);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_up_left_ltr;
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1j, this.itemView.getContext());
        appCompatImageView.setImageDrawable(c419910GdJ.LIZ(this.itemView.getContext()));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eyo, viewGroup, false);
    }
}
