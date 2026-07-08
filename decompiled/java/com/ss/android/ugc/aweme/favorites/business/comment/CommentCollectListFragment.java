package com.ss.android.ugc.aweme.favorites.business.comment;

import X.AbstractC1255880imo;
import X.AbstractC683590Qrd;
import X.C0HCL;
import X.C0OG5;
import X.C0T3Q;
import X.C0XKC;
import X.C1209980ham;
import X.C1260870iur;
import X.C12ES;
import X.C1351950lHl;
import X.C1389890mGx;
import X.C14EU;
import X.C1722300uv6;
import X.C19EG;
import X.C2188811AlT;
import X.C419910GdJ;
import X.C786410Ut5;
import X.InterfaceC1526205yG;
import X.InterfaceC1603190roz;
import Y.ACallableS2S0002000_9;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.CommentCollectListFragmentData;
import com.ss.android.ugc.aweme.favorites.model.CollectedCommentList;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentCollectListFragment extends BaseCollectListFragment<Comment, CollectedCommentList> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTYlHELIOSJyogO2svJiI+LSs4Zww8JSgpJzsQJykgLCwnBCw/PQkhKSIhLCEn";
    public boolean LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void ES() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_comment;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJI = getString(2131834433);
        c1722300uv6.LJIIIIZZ = getString(2131834432);
        if (getContext() instanceof InterfaceC1603190roz) {
            this.LLIZ.setTopMargin(C0HCL.LIZ(53.0f, r2.getContext()));
        } else {
            c1722300uv6.LIZ(c419910GdJ);
        }
        this.LLIZ.setStatus(c1722300uv6);
        C786410Ut5.LLLZLZ(this.LLIZ, 0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void LJJIFFI() {
        C1260870iur c1260870iur = this.LLJILJIL;
        if (c1260870iur != null) {
            c1260870iur.LIZJ(4);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void refreshData() {
        C1260870iur c1260870iur = this.LLJILJIL;
        if (c1260870iur != null) {
            c1260870iur.LIZJ(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void wS() {
        C1260870iur c1260870iur = this.LLJILJIL;
        if (c1260870iur != null) {
            c1260870iur.LJIIJ(new AbstractC1255880imo<Comment, CollectedCommentList>() { // from class: X.0OG5
                @Override // X.AbstractC666100QAu
                public final boolean checkParams(Object... objArr) {
                    return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC1255880imo
                public final List<Comment> getItems() {
                    T t = this.mData;
                    if (t == 0) {
                        return null;
                    }
                    return ((CollectedCommentList) t).items;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC1255880imo
                public final boolean isHasMore() {
                    T t = this.mData;
                    return t != 0 && ((CollectedCommentList) t).hasMore == 1;
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [T, com.ss.android.ugc.aweme.favorites.model.CollectedCommentList] */
                {
                    ?? collectedCommentList = new CollectedCommentList();
                    collectedCommentList.items = new ArrayList();
                    collectedCommentList.hasMore = 1;
                    this.mData = collectedCommentList;
                }

                /* JADX WARN: Type inference failed for: r12v1, types: [T, com.ss.android.ugc.aweme.favorites.model.CollectedCommentList] */
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.AbstractC666100QAu
                public final void handleData(Object obj) {
                    boolean z;
                    List<Comment> list;
                    ?? r12 = (CollectedCommentList) obj;
                    int i = 0;
                    if (r12 != 0 && !C086I.LIZIZ(r12.items)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.mIsNewDataEmpty = z;
                    if (!z) {
                        int i2 = this.mListQueryType;
                        if (i2 != 1) {
                            if (i2 == 4) {
                                T t = this.mData;
                                if (t == 0) {
                                    this.mData = r12;
                                    return;
                                }
                                List<Comment> list2 = ((CollectedCommentList) t).items;
                                Objects.requireNonNull(list2);
                                Integer numValueOf = null;
                                if (r12 != 0) {
                                    list = r12.items;
                                } else {
                                    list = null;
                                }
                                List<Comment> list3 = ((CollectedCommentList) this.mData).items;
                                ArrayList arrayList = new ArrayList();
                                for (Comment comment : list) {
                                    arrayList.add(comment);
                                    Iterator<Comment> it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        if (Intrinsics.LJFF(comment.getCid(), it2.next().getCid())) {
                                            arrayList.remove(comment);
                                        }
                                    }
                                }
                                list2.addAll(arrayList);
                                CollectedCommentList collectedCommentList = (CollectedCommentList) this.mData;
                                if (r12 != 0) {
                                    numValueOf = Integer.valueOf(r12.cursor);
                                }
                                collectedCommentList.cursor = numValueOf.intValue();
                                T t2 = this.mData;
                                CollectedCommentList collectedCommentList2 = (CollectedCommentList) t2;
                                if (r12.hasMore == 1 && ((CollectedCommentList) t2).hasMore == 1) {
                                    i = 1;
                                }
                                collectedCommentList2.hasMore = i;
                                return;
                            }
                            return;
                        }
                        this.mData = r12;
                        return;
                    }
                    T t3 = this.mData;
                    if (t3 == 0) {
                        return;
                    }
                    if (this.mListQueryType == 1) {
                        List<Comment> list4 = ((CollectedCommentList) t3).items;
                        Objects.requireNonNull(list4);
                        list4.clear();
                    }
                    ((CollectedCommentList) this.mData).hasMore = 0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC1255880imo
                public final void loadMoreList(Object... objArr) {
                    C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS2S0002000_9(((CollectedCommentList) this.mData).cursor, 1), 0);
                }

                @Override // X.AbstractC1255880imo
                public final void refreshList(Object... objArr) {
                    C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS2S0002000_9(0, 1), 0);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final AbstractC683590Qrd<Comment> yS() {
        C19EG activity = getActivity();
        if (activity != null) {
            return new CommentCollectListAdapter(activity, this, this.LLJILJILJ);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void zS() {
        super.zS();
        RecyclerView recyclerView = this.LLILZLL;
        if (recyclerView != null) {
            recyclerView.setBackground(null);
        }
    }

    public CommentCollectListFragment() {
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void mz() {
        W0();
    }

    public CommentCollectListFragment(boolean z) {
        this();
        this.LLJILJILJ = z;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void initView(View view) {
        super.initView(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLILZLL.getLayoutParams();
        marginLayoutParams.topMargin = (int) C12ES.LIZJ(8.0f, getContext());
        C786410Ut5.p6(this.LLILZLL, marginLayoutParams);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void omCommentDeleteEvent(C1209980ham c1209980ham) {
        Object[] objArr;
        AbstractC1255880imo abstractC1255880imo;
        List items;
        if (this.LLIZLLLIL == null || c1209980ham == null) {
            return;
        }
        Object obj = c1209980ham.LIZIZ;
        if ((obj instanceof Object[]) && (objArr = (Object[]) obj) != null) {
            int i = 0;
            if (objArr.length == 2) {
                Object obj2 = objArr[1];
                C1260870iur c1260870iur = this.LLJILJIL;
                if (c1260870iur != null && (abstractC1255880imo = (AbstractC1255880imo) c1260870iur.LL) != null && (items = abstractC1255880imo.getItems()) != null) {
                    int size = items.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (Intrinsics.LJFF(((Comment) ListProtector.get(items, i)).getCid(), obj2)) {
                            if (i != -1) {
                                ListProtector.remove(items, i);
                            }
                        } else {
                            i++;
                        }
                    }
                    InterfaceC1526205yG interfaceC1526205yG = this.LLJILJIL;
                    if (interfaceC1526205yG != null) {
                        interfaceC1526205yG.onSuccess();
                    }
                }
            }
        }
    }

    @C14EU
    public final void onAntiCrawlerEvent(C0XKC c0xkc) {
        String str = c0xkc.LIZ;
        if (str != null && a0.LJJIIZI(str, "/tiktok/comment/listcollection/v1/?", false)) {
            EventBus.LIZLLL().LIZIZ(c0xkc);
            refreshData();
        }
    }

    @C14EU
    public final void onCommentCollectEvent(C0T3Q c0t3q) {
        if (this.LLIZLLLIL == null) {
            return;
        }
        Comment commentM169clone = c0t3q.LIZ.m169clone();
        commentM169clone.setAliasAweme(c0t3q.LIZIZ);
        String string = null;
        if (C1351950lHl.LJII(commentM169clone)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131826734);
            }
            sbLIZ.append(string);
            sbLIZ.append(commentM169clone.getText());
            commentM169clone.setText(C2188811AlT.LIZIZ(sbLIZ));
        } else if (C1351950lHl.LJIIIZ(commentM169clone)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            Context context2 = getContext();
            if (context2 != null) {
                string = context2.getString(2131826735);
            }
            sbLIZ2.append(string);
            sbLIZ2.append(commentM169clone.getText());
            commentM169clone.setText(C2188811AlT.LIZIZ(sbLIZ2));
        } else if (C1351950lHl.LJI(commentM169clone)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            Context context3 = getContext();
            if (context3 != null) {
                string = context3.getString(2131826733);
            }
            sbLIZ3.append(string);
            sbLIZ3.append(commentM169clone.getText());
            commentM169clone.setText(C2188811AlT.LIZIZ(sbLIZ3));
        }
        List items = ((AbstractC1255880imo) this.LLJILJIL.LL).getItems();
        int i = 0;
        if (commentM169clone.isCollected()) {
            ListProtector.add(items, 0, commentM169clone);
        } else {
            int size = items.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                if (Intrinsics.LJFF(((Comment) ListProtector.get(items, i)).getCid(), commentM169clone.getCid())) {
                    if (i != -1) {
                        ListProtector.remove(items, i);
                    }
                } else {
                    i++;
                }
            }
        }
        this.LLJILJIL.onSuccess();
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CommentCollectListFragmentData commentCollectListFragmentData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (commentCollectListFragmentData = (CommentCollectListFragmentData) arguments.getParcelable("power_viewpager_default_key")) != null) {
            this.LLJILJILJ = commentCollectListFragmentData.isMyProfile;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment, X.InterfaceC1212360hec
    public final void LLJJJIL(List<Comment> list, boolean z) {
        int i;
        super.LLJJJIL(list, z);
        T t = this.LLJILJIL.LL;
        if (t instanceof C0OG5) {
            T t2 = t.mData;
            if (t2 == 0) {
                i = 0;
            } else {
                i = ((CollectedCommentList) t2).invalidCount;
            }
            C19EG activity = getActivity();
            if (i != 0 && activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                c1389890mGx.LJIIJ(activity.getString(2131838263, Integer.valueOf(i)));
                c1389890mGx.LJIIJJI();
            }
        }
    }
}
