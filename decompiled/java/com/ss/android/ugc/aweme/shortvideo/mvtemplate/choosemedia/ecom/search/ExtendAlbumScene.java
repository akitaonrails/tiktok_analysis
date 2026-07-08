package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ecom.search;

import X.AbstractC1664490tPr;
import X.AbstractC21673619ry;
import X.C0LF5;
import X.C0LFC;
import X.C0LJY;
import X.C0LJZ;
import X.C0OZZ;
import X.C12ES;
import X.C531100KsG;
import X.C786410Ut5;
import X.InterfaceC523020KfE;
import android.content.Context;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class ExtendAlbumScene extends AbstractC1664490tPr<C0LF5, C0LFC> implements InterfaceC523020KfE {
    public RecyclerView LLJJJIL;
    public int LLJJJJ;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (LLLLILI().LIZ.LIZ.isEmpty()) {
            C786410Ut5.LJLLLLLL(8, this.mView);
            return;
        }
        View view = this.mView;
        if (view instanceof C0LJY) {
            ((C0LJY) view).setGestureListener(new C0LJZ() { // from class: X.0LFB
                @Override // X.C0LJZ
                public final void LIZ() {
                    this.LIZ.LLLLIL().LIZIZ.invoke();
                }

                @Override // X.C0LJZ
                public final void N3() {
                    this.LIZ.LLLLIL().LIZ.invoke();
                }
            });
        }
        this.LLJJJIL = (RecyclerView) findViewById(R.id.gfz);
        final List<? extends MediaModel> list = LLLLILI().LIZ.LIZ;
        final Function1<MediaModel, Unit> function1 = LLLLIL().LIZJ;
        AbstractC21673619ry<C531100KsG> abstractC21673619ry = new AbstractC21673619ry<C531100KsG>(list, function1) { // from class: X.0KsF
            public final List<? extends MediaModel> LL;
            public final Function1<MediaModel, Unit> LLILLJJLI;

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return this.LL.size();
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LL = list;
                this.LLILLJJLI = function1;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                C531100KsG c531100KsG = (C531100KsG) viewHolder;
                MediaModel mediaModel = (MediaModel) ListProtector.get(this.LL, i);
                c531100KsG.LLILZ = mediaModel;
                if (mediaModel != null) {
                    SmartImageView smartImageView = c531100KsG.LLILLL;
                    Size size = c531100KsG.LLILZLL;
                    C23216097u c23216097u = C23215097t.LIZ;
                    c531100KsG.LLILZIL = C23215097t.LIZLLL(smartImageView, mediaModel, size, new AwS622S0100000_8(c531100KsG, 16));
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                C531100KsG c531100KsG = new C531100KsG(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cw7, viewGroup, false), this.LLILLJJLI);
                try {
                    View view2 = c531100KsG.itemView;
                    if (view2 != null) {
                        view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c531100KsG.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c531100KsG.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C531100KsG.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c531100KsG.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c531100KsG.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C531100KsG.class.getName();
                return c531100KsG;
            }
        };
        RecyclerView recyclerView = this.LLJJJIL;
        if (recyclerView != null) {
            recyclerView.setAdapter(abstractC21673619ry);
            final Context context = recyclerView.getContext();
            recyclerView.setLayoutManager(new WrapGridLayoutManager(context) { // from class: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ecom.search.ExtendAlbumScene$onActivityCreated$2$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollVertically() {
                    return false;
                }
            });
            recyclerView.addItemDecoration(new C0OZZ(4, (int) C12ES.LIZJ(1.0f, recyclerView.getContext()), false));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LLJJJJ = (int) (((double) C12ES.LJIIIIZZ(getSceneContext())) * 0.19d);
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bor, viewGroup, false);
        viewGroup2.getLayoutParams().height = this.LLJJJJ;
        return viewGroup2;
    }
}
