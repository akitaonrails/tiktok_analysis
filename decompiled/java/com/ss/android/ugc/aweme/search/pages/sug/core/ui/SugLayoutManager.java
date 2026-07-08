package com.ss.android.ugc.aweme.search.pages.sug.core.ui;

import X.AbstractC2098408Jy;
import X.AbstractC21673619ry;
import X.C13LZ;
import X.C21673319rv;
import X.C21673919s1;
import X.C2188811AlT;
import X.C271310AkD;
import X.C669070QMf;
import X.InterfaceC669260QMy;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class SugLayoutManager extends WrapLinearLayoutManager {
    public RecyclerView LLILZ;
    public boolean LLILZIL;
    public final int LLILZLL;

    public final void LJIILJJIL() {
        int paddingLeft;
        int paddingLeft2;
        int paddingTop = getPaddingTop();
        boolean z = getLayoutDirection() == 1;
        Iterator<Integer> it2 = C13LZ.LJIILJJIL(0, getChildCount()).iterator();
        while (true) {
            int i = paddingTop;
            while (it2.hasNext()) {
                View childAt = getChildAt(((AbstractC2098408Jy) it2).nextInt());
                if (childAt != null) {
                    measureChildWithMargins(childAt, 0, 0);
                    int decoratedMeasuredHeight = getDecoratedMeasuredHeight(childAt);
                    int decoratedMeasuredWidth = getDecoratedMeasuredWidth(childAt);
                    if (z) {
                        paddingLeft = (getWidth() - getPaddingRight()) - decoratedMeasuredWidth;
                        paddingLeft2 = getWidth() - getPaddingRight();
                    } else {
                        paddingLeft = getPaddingLeft();
                        paddingLeft2 = getPaddingLeft() + decoratedMeasuredWidth;
                    }
                    paddingTop = decoratedMeasuredHeight + i;
                    layoutDecorated(childAt, paddingLeft, i, paddingLeft2, paddingTop);
                }
            }
            return;
        }
    }

    public SugLayoutManager(Context context) {
        super(context, 1);
        this.LLILZLL = 11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.LLILZ = recyclerView;
    }

    @Override // com.ss.android.ugc.aweme.views.WrapLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        AbstractC21673619ry adapter;
        C669070QMf c669070QMf;
        Object tag;
        Object obj;
        InterfaceC669260QMy interfaceC669260QMy;
        InterfaceC669260QMy interfaceC669260QMy2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (((Number) C271310AkD.LIZ.getValue()).intValue() == 1) {
            try {
                RecyclerView recyclerView = this.LLILZ;
                if (recyclerView != null) {
                    adapter = recyclerView.getAdapter();
                } else {
                    adapter = null;
                }
                if (adapter instanceof C669070QMf) {
                    c669070QMf = (C669070QMf) adapter;
                } else {
                    c669070QMf = null;
                }
                if (this.LLILZIL) {
                    if (c669070QMf != null && c669070QMf.LLJJI) {
                        this.LLILZIL = false;
                        c669070QMf.LLJJI = false;
                    }
                    super.onLayoutChildren(c21673319rv, c21673919s1);
                    return;
                }
                if (c669070QMf != null && ((ArrayList) c669070QMf.LLLFZ()).size() == this.LLILZLL && getChildCount() == this.LLILZLL && getItemCount() == this.LLILZLL) {
                    if (c669070QMf.LLJJIII) {
                        super.onLayoutChildren(c21673319rv, c21673919s1);
                        c669070QMf.LLJJIII = false;
                        return;
                    }
                    int i = 0;
                    for (SearchSugEntity searchSugEntity : (ArrayList) c669070QMf.LLLFZ()) {
                        int i2 = i + 1;
                        int itemViewType = c669070QMf.getItemViewType(i);
                        if (itemViewType == 9 || itemViewType == 3) {
                            SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
                            if (sugExtraInfo != null && sugExtraInfo.isRichSug() && searchSugEntity.sugExtraInfo.isLiveQuery()) {
                                super.onLayoutChildren(c21673319rv, c21673919s1);
                                this.LLILZIL = true;
                                return;
                            }
                            i = i2;
                        } else {
                            super.onLayoutChildren(c21673319rv, c21673919s1);
                            this.LLILZIL = true;
                            return;
                        }
                    }
                    if (!c669070QMf.LLJJI) {
                        LJIILJJIL();
                        return;
                    }
                    c669070QMf.LLJJI = false;
                    Iterator<Integer> it2 = C13LZ.LJIILJJIL(0, getItemCount()).iterator();
                    while (it2.hasNext()) {
                        int iNextInt = ((AbstractC2098408Jy) it2).nextInt();
                        SearchSugEntity searchSugEntity2 = (SearchSugEntity) ((ArrayList) c669070QMf.LLLFZ()).get(iNextInt);
                        View childAt = getChildAt(iNextInt);
                        if (childAt != null) {
                            tag = childAt.getTag();
                        } else {
                            tag = null;
                        }
                        if (tag instanceof RecyclerView.ViewHolder) {
                            obj = (RecyclerView.ViewHolder) tag;
                        } else {
                            obj = null;
                        }
                        if (searchSugEntity2 != null && childAt != null && obj != null) {
                            int itemViewType2 = c669070QMf.getItemViewType(iNextInt);
                            if (itemViewType2 == 9 && (obj instanceof InterfaceC669260QMy) && (interfaceC669260QMy2 = (InterfaceC669260QMy) obj) != null) {
                                interfaceC669260QMy2.onViewDetachedFromWindow();
                            }
                            c669070QMf.onBindViewHolder(obj, iNextInt);
                            if (itemViewType2 == 9 && (obj instanceof InterfaceC669260QMy) && (interfaceC669260QMy = (InterfaceC669260QMy) obj) != null) {
                                interfaceC669260QMy.onViewAttachedToWindow();
                            }
                        }
                    }
                    LJIILJJIL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("optimise cost ");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return;
                }
                super.onLayoutChildren(c21673319rv, c21673919s1);
                if (c669070QMf != null) {
                    c669070QMf.LLJJI = false;
                    return;
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                super.onLayoutChildren(c21673319rv, c21673919s1);
                return;
            }
        }
        super.onLayoutChildren(c21673319rv, c21673919s1);
    }
}
