package com.ss.android.ugc.aweme.notice.api.services;

import X.AbstractC1585770rMt;
import X.AbstractC1906720ziY;
import X.C05RV;
import X.C0WHU;
import X.C10D1;
import X.C1242310iQv;
import X.C13IQ;
import X.C1801100wyC;
import X.C1917290zzb;
import X.C19206610Ca;
import X.C19EG;
import X.C635690OwZ;
import X.C878950Ydx;
import X.C889900Yvc;
import X.EnumC880480YgQ;
import X.InterfaceC1209300hZg;
import X.InterfaceC1255480imA;
import X.InterfaceC1349370lDb;
import X.InterfaceC1570900qyu;
import X.InterfaceC1617760sCU;
import X.InterfaceC1891350zJl;
import X.InterfaceC1908070zkj;
import X.InterfaceC1917380zzk;
import X.InterfaceC800130Va7;
import X.InterfaceC888500YtM;
import X.InterfaceC889560Yv4;
import X.InterfaceC889970Yvj;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public interface INoticeService {
    NetworkPartner LIZ();

    C0WHU LIZIZ();

    C05RV LIZJ();

    boolean LIZLLL();

    boolean LJ();

    Class<?> LJFF(Context context, C1917290zzb c1917290zzb, InterfaceC1917380zzk interfaceC1917380zzk);

    int LJI();

    boolean LJII();

    List<FilterTabType> LJIIIIZZ();

    void LJIIIZ(MotionEvent motionEvent);

    boolean LJIIJ();

    int LJIIJJI();

    boolean LJIIL(Context context);

    boolean LJIILIIL();

    void LJIILJJIL(Context context, C1917290zzb c1917290zzb);

    void LJIILL();

    InterfaceC1908070zkj LJIILLIIL();

    boolean LJIIZILJ();

    Intent LJIJ(Context context);

    void LJIJI(Context context, C1917290zzb c1917290zzb, C19206610Ca c19206610Ca);

    int LJIJJ(Context context, User user, String str, String str2, boolean z);

    String LJIJJLI(String str, String str2);

    void LJIL(C889900Yvc c889900Yvc);

    boolean LJJ();

    void LJJI();

    void LJJIFFI(InterfaceC889970Yvj interfaceC889970Yvj);

    <T extends AmeBaseFragment> Class<? extends T> LJJII();

    boolean LJJIII();

    void LJJIIJ(String str);

    void LJJIIJZLJL();

    InterfaceC1255480imA LJJIIZ();

    InterfaceC1209300hZg LJJIIZI();

    boolean LJJIJ();

    boolean LJJIJIIJI();

    void LJJIJIIJIL();

    FilterTabType LJJIJIL();

    InterfaceC889560Yv4 LJJIJL(C878950Ydx c878950Ydx, Function0<? extends List<? extends InterfaceC888500YtM>> function0);

    void LJJIJLIJ(FilterTabType filterTabType, String str);

    void LJJIL(Function0<Unit> function0);

    void LJJIZ(Context context, String str, boolean z);

    String LJJJ();

    void LJJJI();

    boolean LJJJIL();

    C05RV LJJJJ();

    boolean LJJJJI(Context context);

    void LJJJJIZL(C19EG c19eg, int i, List<Integer> list, String str, C635690OwZ c635690OwZ, Map<String, String> map, Function1<? super C1801100wyC, Unit> function1);

    InterfaceC1570900qyu LJJJJJ(C19EG c19eg, InterfaceC1617760sCU interfaceC1617760sCU);

    void LJJJJJL(Long l);

    void LJJJJL(String str, WeakHandler weakHandler);

    RecyclerView.ViewHolder LJJJJLI(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq);

    void LJJJJLL();

    InterfaceC1349370lDb LJJJJZ();

    boolean LJJJJZI();

    Intent LJJJLIIL(Context context, String str);

    boolean LJJJLL();

    void LJJJLZIJ();

    boolean LJJJZ();

    Pair<FilterTabType, Set<EnumC880480YgQ>> LJJL();

    void LJJLI();

    void LJJLIIIIJ(NoticeList noticeList);

    void LJJLIIIJ(String str, WeakHandler weakHandler);

    void LJJLIIIJILLIZJL(Context context, C1917290zzb c1917290zzb);

    Boolean LJJLIIIJJI();

    void LJJLIIIJJIZ(C19EG c19eg);

    boolean LJJLIIIJL();

    boolean LJJLIIIJLJLI();

    void LJJLIIIJLLLLLLLZ();

    <T extends CommonPageFragment> Class<? extends T> LJJLIIJ();

    void LJJLIL(InterfaceC889970Yvj interfaceC889970Yvj);

    void LJJLJ();

    void LJJLJLI(String str, boolean z);

    boolean LJJLL();

    void LJJZ(int i);

    boolean LJJZZI();

    void LJJZZIII();

    ViewModelProvider.Factory LJL();

    void LJLI(String str, boolean z);

    Pair<FilterTabType, Set<EnumC880480YgQ>> LJLIIIL();

    View.OnClickListener LJLIIL(Context context);

    SpannableStringBuilder LJLIL(TextView textView, CharSequence charSequence, int i, int i2, int i3, int i4, List<Pair<Integer, Integer>> list, Integer num);

    void LJLILLLLZI();

    void LJLJI();

    boolean LJLJJI(BaseResponse baseResponse);

    boolean LJLJJL();

    void LJLJJLL(Context context);

    void LJLJL();

    void LJLJLLL(long j, String str);

    AbstractC1906720ziY LJLL(C1242310iQv c1242310iQv);

    boolean LJLLI(BaseResponse baseResponse);

    AbstractC1585770rMt LJLLILLLL();

    void LJLLJ(JSONObject jSONObject);

    String LJLLL();

    boolean LJLLLL();

    boolean LJLLLLLL();

    InterfaceC800130Va7 LJLZ();

    void LJZ();

    void LJZI(C05RV c05rv, String str, Function1<? super Boolean, Unit> function1);

    void LJZL(Context context, C1917290zzb c1917290zzb);

    String LL();

    void LLD(String str, boolean z);

    void LLF();

    void LLFF(Context context, C1917290zzb c1917290zzb, C10D1 c10d1);

    boolean LLFFF();

    boolean LLFII();

    void initLegoInflate();

    void notifyLocaleChange(Locale locale);
}
