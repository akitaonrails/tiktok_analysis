package com.ss.android.ugc.aweme.ecommerce.base.address.widget.search;

import X.AbstractC21673619ry;
import X.C03B0;
import X.C09CT;
import X.C1308910kAL;
import X.C13LP;
import X.C1747700va4;
import X.C1AF0;
import X.C20612085q;
import X.C2081408Dk;
import X.C2344809Gs;
import X.C786410Ut5;
import X.C946803n0;
import X.InterfaceC1747710va5;
import X.ViewOnClickListenerC1747680va2;
import X.ViewOnClickListenerC1747690va3;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class OneSearchResultAdapter extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public List<SearchResultItemVO> LL;
    public InterfaceC1747710va5 LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<SearchResultItemVO> list = this.LL;
        if (list != null) {
            return ((ArrayList) list).size();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        SearchResultItemVO searchResultItemVO;
        Integer num;
        List<SearchResultItemVO> list = this.LL;
        if (list != null && (searchResultItemVO = (SearchResultItemVO) ListProtector.get(list, i)) != null && (num = searchResultItemVO.type) != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int size;
        SearchResultItemVO searchResultItemVO;
        SearchResultItemVO searchResultItemVO2;
        SearchResultItemVO searchResultItemVO3;
        int iLJJJ;
        Locale locale;
        String lowerCase;
        String lowerCase2;
        List<SearchResultItemVO> list = this.LL;
        int length = 0;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                Integer num = ((SearchResultItemVO) obj).type;
                if (num != null && num.intValue() == 6) {
                    arrayList.add(obj);
                }
            }
            size = arrayList.size();
        } else {
            size = 0;
        }
        ForegroundColorSpan foregroundColorSpan = null;
        if (viewHolder instanceof ViewOnClickListenerC1747690va3) {
            List<SearchResultItemVO> list2 = this.LL;
            if (list2 != null) {
                searchResultItemVO3 = (SearchResultItemVO) C13LP.LJJJLZIJ(i, list2);
            } else {
                searchResultItemVO3 = null;
            }
            viewHolder.getClass();
            if (searchResultItemVO3 != null) {
                String str = searchResultItemVO3.content;
                if (str != null && (lowerCase = str.toLowerCase((locale = Locale.ROOT))) != null) {
                    String str2 = searchResultItemVO3.keyWord;
                    if (str2 == null || (lowerCase2 = str2.toLowerCase(locale)) == null) {
                        lowerCase2 = "";
                    }
                    iLJJJ = a0.LJJJ(lowerCase, lowerCase2, 0, false, 6);
                } else {
                    iLJJJ = -1;
                }
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, viewHolder.itemView.getContext());
                if (numLIZJ != null) {
                    ((TextView) viewHolder.itemView.findViewById(R.id.tv_search_cand_text)).setTextColor(numLIZJ.intValue());
                }
                if (iLJJJ != -1) {
                    SpannableString spannableString = new SpannableString(searchResultItemVO3.content);
                    Integer numLIZJ2 = searchResultItemVO3.LIZ;
                    if (numLIZJ2 != null || (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, viewHolder.itemView.getContext())) != null) {
                        foregroundColorSpan = new ForegroundColorSpan(numLIZJ2.intValue());
                    }
                    String str3 = searchResultItemVO3.keyWord;
                    if (str3 != null) {
                        length = str3.length();
                    }
                    C786410Ut5.p2(spannableString, foregroundColorSpan, iLJJJ, length + iLJJJ, 33);
                    ((TextView) viewHolder.itemView.findViewById(R.id.tv_search_cand_text)).setText(spannableString);
                    return;
                }
                ((TextView) viewHolder.itemView.findViewById(R.id.tv_search_cand_text)).setText(searchResultItemVO3.content);
                return;
            }
            return;
        }
        if (viewHolder instanceof C1747700va4) {
            List<SearchResultItemVO> list3 = this.LL;
            if (list3 != null && (searchResultItemVO2 = (SearchResultItemVO) C13LP.LJJJLZIJ(i, list3)) != null) {
                ((TextView) viewHolder.itemView.findViewById(R.id.tv_search_cand_text)).setText(searchResultItemVO2.content);
                return;
            } else {
                viewHolder.getClass();
                return;
            }
        }
        if (!(viewHolder instanceof ViewOnClickListenerC1747680va2)) {
            return;
        }
        ViewOnClickListenerC1747680va2 viewOnClickListenerC1747680va2 = (ViewOnClickListenerC1747680va2) viewHolder;
        List<SearchResultItemVO> list4 = this.LL;
        if (list4 != null && (searchResultItemVO = (SearchResultItemVO) C13LP.LJJJLZIJ(i, list4)) != null) {
            TextView textView = (TextView) viewOnClickListenerC1747680va2.itemView.findViewById(R.id.tv_search_cand_text);
            ECRichText eCRichText = searchResultItemVO.manually;
            if (eCRichText != null) {
                C03B0 c03b0 = new C03B0(textView, "address_search");
                C03B0.LIZ(c03b0, eCRichText, null, null, false, null, null, 126);
                textView.setText(c03b0.LIZJ);
            }
            InterfaceC1747710va5 interfaceC1747710va5 = viewOnClickListenerC1747680va2.LL;
            if (interfaceC1747710va5 == null) {
                return;
            }
            interfaceC1747710va5.LIZIZ(size);
            return;
        }
        viewOnClickListenerC1747680va2.getClass();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        if (i != -100) {
            if (i != 7) {
                ViewOnClickListenerC1747690va3 viewOnClickListenerC1747690va3 = new ViewOnClickListenerC1747690va3(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ay1, viewGroup, false));
                viewOnClickListenerC1747690va3.LL = this.LLILLJJLI;
                viewHolder = viewOnClickListenerC1747690va3;
            } else {
                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ay4, viewGroup, false);
                viewHolder = new RecyclerView.ViewHolder(viewTd) { // from class: X.0va4
                };
            }
        } else {
            ViewOnClickListenerC1747680va2 viewOnClickListenerC1747680va2 = new ViewOnClickListenerC1747680va2(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ay3, viewGroup, false));
            viewOnClickListenerC1747680va2.LL = this.LLILLJJLI;
            viewHolder = viewOnClickListenerC1747680va2;
        }
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }

    public static final class SearchResultItemVO {
        public final Integer LIZ;

        @C09CT("content")
        public final String content;

        @C09CT("keyWord")
        public final String keyWord;

        @C09CT("manually")
        public final ECRichText manually;

        @C09CT("type")
        public final Integer type;

        public SearchResultItemVO(Integer num, String str, String str2, ECRichText eCRichText, Integer num2) {
            this.type = num;
            this.keyWord = str;
            this.content = str2;
            this.manually = eCRichText;
            this.LIZ = num2;
        }
    }
}
