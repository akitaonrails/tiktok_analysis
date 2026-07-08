package com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui;

import X.C0BCC;
import X.C0QNF;
import X.C1308910kAL;
import X.C15IK;
import X.C20684815ws;
import X.C294590Bgf;
import X.C427690Gpr;
import X.C669090QMh;
import X.C680990QnR;
import X.C681000QnS;
import X.C681050QnX;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.RunnableC514501zT;
import Y.ACListenerS77S0300000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMusicSugHistoryCell extends PowerCell<C681000QnS> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        TextView textView;
        super.onItemViewCreated();
        View view = this.itemView;
        C427690Gpr.LJ(view, 0.0f);
        C427690Gpr.LJI(view.findViewById(R.id.lec), null);
        if (!C0BCC.LIZ() || (textView = (TextView) this.itemView.findViewById(R.id.zf0)) == null) {
            return;
        }
        C669090QMh c669090QMh = C669090QMh.LIZ;
        Context context = this.itemView.getContext();
        c669090QMh.getClass();
        textView.setTextColor(C669090QMh.LJI(context));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String id;
        String str;
        String id2;
        Integer numLIZJ;
        C681000QnS c681000QnS = (C681000QnS) interfaceC1891350zJl;
        super.onBindItemView(c681000QnS);
        SearchSugEntity searchSugEntity = c681000QnS.LL;
        TextView textView = (TextView) this.itemView.findViewById(R.id.zf0);
        View view = this.itemView;
        textView.setText(C0QNF.LIZ(searchSugEntity, view.getContext()));
        HandlerHook.viewPost(textView, new RunnableC514501zT(textView, view, 22));
        if (C294590Bgf.LIZ() && !C0BCC.LIZ() && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, this.itemView.getContext())) != null) {
            ((TextView) this.itemView.findViewById(R.id.zf0)).setTextColor(numLIZJ.intValue());
        }
        C786410Ut5.I7(new ACListenerS77S0300000_10(searchSugEntity, this, c681000QnS, 9), this.itemView);
        C786410Ut5.a9((TuxIconView) this.itemView.findViewById(R.id.lec), new ACListenerS77S0300000_10(searchSugEntity, this, c681000QnS, 10));
        int layoutPosition = getLayoutPosition();
        if (!searchSugEntity.LIZLLL) {
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
            C20684815ws.LJIILLIIL("trending_words_show", c680990QnR.LIZ);
            C680990QnR c680990QnR2 = new C680990QnR();
            c680990QnR2.LIZJ("enter_method", "sug");
            Map<String, String> map = searchSugEntity.LJ;
            String str3 = null;
            if (map != null) {
                str = (String) ((ConcurrentHashMap) map).get("impr_id");
            } else {
                str = null;
            }
            c680990QnR2.LIZJ("query_id", str);
            Map<String, String> map2 = searchSugEntity.LJ;
            if (map2 != null) {
                str3 = (String) ((ConcurrentHashMap) map2).get("raw_query");
            }
            c680990QnR2.LIZJ("input_keyword", str3);
            c680990QnR2.LIZJ("search_keyword", searchSugEntity.content);
            c680990QnR2.LIZ(layoutPosition, "order");
            c680990QnR2.LIZJ("search_type", "video_music");
            Word word2 = searchSugEntity.mWord;
            if (word2 != null && (id2 = word2.getId()) != null) {
                str2 = id2;
            }
            c680990QnR2.LIZJ("group_id", str2);
            c680990QnR2.LIZJ("words_type", "history");
            c680990QnR2.LIZJ("new_sug_session_id", C681050QnX.LIZ);
            C20684815ws.LJIILLIIL("search_trending_show", c680990QnR2.LIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eyp, viewGroup, false);
    }
}
