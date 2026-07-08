package com.ss.android.ugc.aweme.topic.common.creator;

import X.C019F;
import X.C0O4X;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1722300uv6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2255108sX;
import X.C419910GdJ;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.prefab.DetailListAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.topic.book.creator.BookSearchItemCell;
import com.ss.android.ugc.aweme.topic.common.creator.vm.TopicSearchViewModel;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.movie.creator.MovieSearchItemCell;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicSearchListAssem extends DetailListAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJJIL;
    public C0O4X LLJJJJ;

    public interface TopicSelectedAbility extends InterfaceC494301wD {
        boolean BI(TopicRawInfo topicRawInfo, boolean z);

        boolean uB0(String str);
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopicSearchListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/topic/common/creator/vm/TopicSearchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TopicSearchListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopicSearchViewModel.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1544), AFwS240S0000000_9.get$arr$(639), null, true);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    /* JADX INFO: renamed from: Ap, reason: merged with bridge method [inline-methods] */
    public final TopicSearchViewModel tp() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (TopicSearchViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailListAssem, com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer num;
        Integer num2;
        C0O4X c0o4x;
        String str;
        String str2;
        super.onViewCreated(view);
        Object obj = getConfig().LLILZ.get("topic_type");
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        C0O4X c0o4x2 = C0O4X.BOOK;
        int type = c0o4x2.getType();
        if (num != null && num.intValue() == type) {
            c0o4x = c0o4x2;
        } else {
            Object obj2 = getConfig().LLILZ.get("topic_type");
            if (obj2 instanceof Integer) {
                num2 = (Integer) obj2;
            } else {
                num2 = null;
            }
            c0o4x = C0O4X.MOVIE;
            int type2 = c0o4x.getType();
            if (num2 == null || num2.intValue() != type2) {
                return;
            }
        }
        this.LLJJJJ = c0o4x;
        TopicSearchViewModel topicSearchViewModelTp = tp();
        C0O4X c0o4x3 = this.LLJJJJ;
        if (c0o4x3 == null) {
            c0o4x3 = null;
        }
        topicSearchViewModelTp.LLILLJJLI = c0o4x3;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            C1722300uv6 c1722300uv6Lp = lp();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_magnify_glass;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6Lp.LIZJ = 0;
            c1722300uv6Lp.LIZIZ = c419910GdJ;
            Object obj3 = getConfig().LLILZ.get("title");
            if (obj3 instanceof String) {
                str = (String) obj3;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            c1722300uv6Lp.LJI = str;
            Object obj4 = getConfig().LLILZ.get("desc");
            if ((obj4 instanceof String) && (str2 = (String) obj4) != null) {
                str3 = str2;
            }
            c1722300uv6Lp.LJIIIIZZ = str3;
            C0O4X c0o4x4 = this.LLJJJJ;
            if (c0o4x4 == null) {
                c0o4x4 = null;
            }
            int type3 = c0o4x4.getType();
            if (type3 == c0o4x2.getType()) {
                mp().LJIILJJIL(BookSearchItemCell.class);
            } else if (type3 == C0O4X.MOVIE.getType()) {
                mp().LJIILJJIL(MovieSearchItemCell.class);
            } else {
                return;
            }
            mp().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            mp().setLifecycleOwner(this);
            AssemViewModel.asyncSubscribe$default(tp(), new C2217381BqS() { // from class: X.0Oif
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj5) {
                    C325970CqB c325970CqB = (C325970CqB) obj5;
                    c325970CqB.getClass();
                    return C627260Oiy.LIZLLL(c325970CqB);
                }
            }, null, new AwS588S0100000_9(interfaceC665370Q7zLJFF, 397), new AwS553S0100000_9(interfaceC665370Q7zLJFF, 1543), new AwS375S0200000_9(this, interfaceC665370Q7zLJFF, 100), 2, null);
            yp();
            zp();
            TopicSearchViewModel topicSearchViewModelTp2 = tp();
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, RefreshAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, topicSearchViewModelTp2, RefreshAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(topicSearchViewModelTp2);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(topicSearchViewModelTp2);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(RefreshAbility.class.getClassLoader(), new Class[]{RefreshAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, RefreshAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshAbility");
                    }
                }
            }
            TopicSearchViewModel topicSearchViewModelTp3 = tp();
            InterfaceC494301wD interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLJFF, SearchAbility.class, null);
            if (interfaceC494301wDLIZ2 == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, topicSearchViewModelTp3, SearchAbility.class, null, null);
                return;
            }
            try {
                InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(interfaceC494301wDLIZ2);
                if (invocationHandler2 instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler2).LL.add(topicSearchViewModelTp3);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2255108sX c2255108sX2 = new C2255108sX();
                c2255108sX2.LL.add(topicSearchViewModelTp3);
                c2255108sX2.LL.add((T) interfaceC494301wDLIZ2);
                Object objNewProxyInstance2 = Proxy.newProxyInstance(SearchAbility.class.getClassLoader(), new Class[]{SearchAbility.class}, c2255108sX2);
                if (objNewProxyInstance2 != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance2, SearchAbility.class, null, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility");
            }
        }
    }
}
