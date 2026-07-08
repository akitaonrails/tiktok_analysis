package com.ss.android.ugc.aweme.favorites.business.sticker;

import X.AbstractC1255880imo;
import X.AbstractC683510QrV;
import X.AbstractC683590Qrd;
import X.C0HCL;
import X.C1206680hVS;
import X.C1260870iur;
import X.C14EU;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C2187451AjH;
import X.C419910GdJ;
import X.C616540OGe;
import X.C786410Ut5;
import X.InterfaceC1603190roz;
import Y.ACallableS2S0002000_9;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.bean.StickerList;
import com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class StickerCollectListFragment extends BaseCollectListFragment<NewFaceStickerBean, StickerList> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTYlHELIOSJyogO2s/PSYwIyA+ZxwnISYnLD0QJykgLCwnBCw/PQkhKSIhLCEn";
    public boolean LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void ES() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_bookmark;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJI = getString(2131834436);
        c1722300uv6.LJIIIIZZ = getString(2131834435);
        if (getContext() instanceof InterfaceC1603190roz) {
            C1749280vcc c1749280vcc = this.LLIZ;
            if (c1749280vcc != null) {
                c1749280vcc.setTopMargin(C0HCL.LIZ(53.0f, c1749280vcc.getContext()));
            }
        } else {
            c1722300uv6.LIZ(c419910GdJ);
        }
        C1749280vcc c1749280vcc2 = this.LLIZ;
        if (c1749280vcc2 != null) {
            c1749280vcc2.setStatus(c1722300uv6);
        }
        C1749280vcc c1749280vcc3 = this.LLIZ;
        if (c1749280vcc3 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc3, 0);
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
            c1260870iur.LJIIJ(new AbstractC1255880imo<NewFaceStickerBean, StickerList>() { // from class: X.0mOT
                public final List<Function1<NewFaceStickerBean, Boolean>> LL = Collections.singletonList(new C1394150mNp(this));
                public int LLILLJJLI;

                @Override // X.AbstractC666100QAu
                public final boolean checkParams(Object... objArr) {
                    return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC1255880imo
                public final List<NewFaceStickerBean> getItems() {
                    T t = this.mData;
                    if (t == 0) {
                        return null;
                    }
                    return ((StickerList) t).items;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC1255880imo
                public final boolean isHasMore() {
                    T t = this.mData;
                    return t != 0 && ((StickerList) t).LIZ();
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [T, com.ss.android.ugc.aweme.favorites.bean.StickerList] */
                {
                    ?? stickerList = new StickerList();
                    stickerList.items = new ArrayList();
                    stickerList.LIZIZ(false);
                    this.mData = stickerList;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
                /* JADX WARN: Type inference failed for: r10v1, types: [T, com.ss.android.ugc.aweme.favorites.bean.StickerList] */
                @Override // X.AbstractC666100QAu
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void handleData(java.lang.Object r10) {
                    /*
                        Method dump skipped, instruction units count: 314
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1394550mOT.handleData(java.lang.Object):void");
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC1255880imo
                public final void loadMoreList(Object... objArr) {
                    int i = ((StickerList) this.mData).cursor;
                    if (!C10EU.LJIIIIZZ()) {
                        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS2S0002000_9(i, 10, 0), 0);
                    }
                }

                @Override // X.AbstractC1255880imo
                public final void refreshList(Object... objArr) {
                    if (!C10EU.LJIIIIZZ()) {
                        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS2S0002000_9(0, 12, 0), 0);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final AbstractC683590Qrd<NewFaceStickerBean> yS() {
        return new AbstractC683590Qrd<NewFaceStickerBean>() { // from class: X.0mNW
            @Override // X.AbstractC438050HFr
            public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) ListProtector.get(getData(), i);
                C1393950mNV c1393950mNV = (C1393950mNV) viewHolder;
                c1393950mNV.LLIZ = newFaceStickerBean;
                c1393950mNV.LLILLJJLI.setText(newFaceStickerBean.name);
                c1393950mNV.LLILLL.setText(newFaceStickerBean.ownerName);
                if (newFaceStickerBean.effectSource == 1) {
                    TextView textView = c1393950mNV.LLILZ;
                    if (textView != null) {
                        C786410Ut5.LLIL(textView, 0);
                    }
                    TextView textView2 = c1393950mNV.LLILZ;
                    if (textView2 != null) {
                        textView2.setText(2131845453);
                    }
                } else {
                    TextView textView3 = c1393950mNV.LLILZ;
                    if (textView3 != null) {
                        C786410Ut5.LLIL(textView3, 8);
                    }
                }
                TextView textView4 = c1393950mNV.LLILZIL;
                textView4.setText(textView4.getContext().getString(2131837792, C1843500y4a.LIZIZ(newFaceStickerBean.userCount)));
                UrlModel urlModel = newFaceStickerBean.iconUrl;
                if (urlModel != null && urlModel.getUrlList() != null && !newFaceStickerBean.iconUrl.getUrlList().isEmpty()) {
                    if (!C0R07.LIZ()) {
                        C1324750kZt.LIZ(c1393950mNV.LL, UriProtector.parse((String) ListProtector.get(newFaceStickerBean.iconUrl.getUrlList(), 0)));
                    } else {
                        C1324840ka2.LJIIJ(c1393950mNV.LL, (String) ListProtector.get(newFaceStickerBean.iconUrl.getUrlList(), 0), -1, -1);
                    }
                } else {
                    C1324840ka2.LIZ(c1393950mNV.LL, R.drawable.cd6);
                }
                C786410Ut5.I7(new C1401860maG(c1393950mNV, newFaceStickerBean, 1), c1393950mNV.itemView);
                C786410Ut5.V7(c1393950mNV.LLILZLL, new C1401860maG(c1393950mNV, newFaceStickerBean, 2));
                c1393950mNV.onShowItem();
            }

            @Override // X.AbstractC438050HFr
            public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
                return new C1393950mNV(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cuz, viewGroup, false));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJILJILJ = true;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(StickerCollectListFragment.class.getName());
        }
        super.onResume();
        if (this.LLJILJILJ) {
            this.LLJILJILJ = false;
            refreshData();
        }
    }

    @C14EU
    public final void onStickerCollectEvent(C1206680hVS c1206680hVS) {
        NewFaceStickerBean newFaceStickerBean;
        AbstractC1255880imo abstractC1255880imo;
        List items;
        if (!isViewValid() || (newFaceStickerBean = c1206680hVS.LIZ) == null) {
            return;
        }
        if (!newFaceStickerBean.isFavorite) {
            C1260870iur c1260870iur = this.LLJILJIL;
            if (c1260870iur != null && (abstractC1255880imo = (AbstractC1255880imo) c1260870iur.LL) != null && (items = abstractC1255880imo.getItems()) != null) {
                int size = items.size();
                Iterator it2 = items.iterator();
                while (it2.hasNext()) {
                    NewFaceStickerBean newFaceStickerBean2 = (NewFaceStickerBean) it2.next();
                    if (newFaceStickerBean2 != null && TextUtils.equals(newFaceStickerBean2.id, newFaceStickerBean.id)) {
                        this.LLJILJILJ = false;
                        it2.remove();
                    }
                }
                if (size != items.size()) {
                    AbstractC683510QrV abstractC683510QrV = this.LLIZLLLIL;
                    if (abstractC683510QrV != null) {
                        abstractC683510QrV.notifyDataSetChanged();
                    }
                } else {
                    this.LLJILJILJ = true;
                }
                if (items.isEmpty()) {
                    Ng1();
                    return;
                }
                return;
            }
            return;
        }
        this.LLJILJILJ = true;
    }
}
