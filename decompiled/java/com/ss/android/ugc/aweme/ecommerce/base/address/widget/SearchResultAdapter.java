package com.ss.android.ugc.aweme.ecommerce.base.address.widget;

import X.AbstractC21673619ry;
import X.C03J8;
import X.C09CT;
import X.C1308910kAL;
import X.C13LP;
import X.C1AF0;
import X.C20612085q;
import X.C2081408Dk;
import X.C2344809Gs;
import X.C786410Ut5;
import X.C946803n0;
import X.InterfaceC747600TUg;
import X.ViewOnClickListenerC747590TUf;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public class SearchResultAdapter extends AbstractC21673619ry<ViewOnClickListenerC747590TUf> {
    public final boolean LL;
    public List<SearchResultItemVO> LLILLJJLI;
    public InterfaceC747600TUg LLILLL;

    public int LLLFZ() {
        return R.layout.ay5;
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<SearchResultItemVO> list = this.LLILLJJLI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public SearchResultAdapter(boolean z) {
        this.LL = z;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SearchResultItemVO searchResultItemVO;
        ViewOnClickListenerC747590TUf viewOnClickListenerC747590TUf = (ViewOnClickListenerC747590TUf) viewHolder;
        List<SearchResultItemVO> list = this.LLILLJJLI;
        ForegroundColorSpan foregroundColorSpan = null;
        if (list != null) {
            searchResultItemVO = (SearchResultItemVO) C13LP.LJJJLZIJ(i, list);
        } else {
            searchResultItemVO = null;
        }
        int itemCount = getItemCount();
        boolean z = false;
        if (searchResultItemVO != null) {
            viewOnClickListenerC747590TUf.getClass();
            String str = searchResultItemVO.firstText;
            Locale locale = Locale.ROOT;
            int iLJJJ = a0.LJJJ(str.toLowerCase(locale), searchResultItemVO.keyWord.toLowerCase(locale), 0, false, 6);
            Integer numLIZJ = searchResultItemVO.LIZ;
            if (numLIZJ == null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, viewOnClickListenerC747590TUf.itemView.getContext());
            }
            if (numLIZJ != null) {
                ((TextView) viewOnClickListenerC747590TUf.itemView.findViewById(R.id.zc0)).setTextColor(numLIZJ.intValue());
            }
            Integer numLIZJ2 = searchResultItemVO.LIZIZ;
            if (numLIZJ2 == null) {
                numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, viewOnClickListenerC747590TUf.itemView.getContext());
            }
            if (numLIZJ2 != null) {
                ((TextView) viewOnClickListenerC747590TUf.itemView.findViewById(R.id.zc1)).setTextColor(numLIZJ2.intValue());
            }
            if (iLJJJ != -1) {
                SpannableString spannableString = new SpannableString(searchResultItemVO.firstText);
                Integer numLIZJ3 = searchResultItemVO.LIZJ;
                if (numLIZJ3 != null || (numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, viewOnClickListenerC747590TUf.itemView.getContext())) != null) {
                    foregroundColorSpan = new ForegroundColorSpan(numLIZJ3.intValue());
                }
                C786410Ut5.p2(spannableString, foregroundColorSpan, iLJJJ, searchResultItemVO.keyWord.length() + iLJJJ, 33);
                ((TextView) viewOnClickListenerC747590TUf.itemView.findViewById(R.id.zc0)).setText(spannableString);
            } else {
                ((TextView) viewOnClickListenerC747590TUf.itemView.findViewById(R.id.zc0)).setText(searchResultItemVO.firstText);
            }
            if (searchResultItemVO.secondText == null) {
                C786410Ut5.LJLLLLLL(8, viewOnClickListenerC747590TUf.itemView.findViewById(R.id.zc1));
            } else {
                C786410Ut5.LJLLLLLL(0, viewOnClickListenerC747590TUf.itemView.findViewById(R.id.zc1));
                ((TextView) viewOnClickListenerC747590TUf.itemView.findViewById(R.id.zc1)).setText(searchResultItemVO.secondText);
            }
        }
        if (viewOnClickListenerC747590TUf.LL) {
            View view = viewOnClickListenerC747590TUf.itemView;
            if (viewOnClickListenerC747590TUf.getLayoutPosition() != itemCount - 1) {
                z = true;
            }
            C03J8.LIZ(view, z);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewOnClickListenerC747590TUf viewOnClickListenerC747590TUf = new ViewOnClickListenerC747590TUf(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), LLLFZ(), viewGroup, false), this.LL);
        viewOnClickListenerC747590TUf.LLILLJJLI = this.LLILLL;
        try {
            View view = viewOnClickListenerC747590TUf.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewOnClickListenerC747590TUf.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewOnClickListenerC747590TUf.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ViewOnClickListenerC747590TUf.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewOnClickListenerC747590TUf.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewOnClickListenerC747590TUf.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = ViewOnClickListenerC747590TUf.class.getName();
        return viewOnClickListenerC747590TUf;
    }

    public static final class SearchResultItemVO {
        public final Integer LIZ;
        public final Integer LIZIZ;
        public final Integer LIZJ;

        @C09CT("firstText")
        public final String firstText;

        @C09CT("keyWord")
        public final String keyWord;

        @C09CT("secondText")
        public final String secondText;

        public SearchResultItemVO(String str, String str2, String str3, Integer num, Integer num2, Integer num3) {
            this.keyWord = str;
            this.firstText = str2;
            this.secondText = str3;
            this.LIZ = num;
            this.LIZIZ = num2;
            this.LIZJ = num3;
        }
    }
}
