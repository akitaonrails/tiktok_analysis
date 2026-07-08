package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser;

import X.C07E5;
import X.C0HXV;
import X.C1558520qew;
import X.C1839807Im;
import X.C1913107eT;
import X.C21565319aV;
import X.C418440Gaw;
import X.C648880Pck;
import X.C650240Pew;
import X.C656680PpK;
import X.C656810PpX;
import X.C659720PuE;
import X.C723830SaL;
import X.C814420VxA;
import X.EnumC656690PpL;
import X.InterfaceC1587906Jp;
import X.InterfaceC494301wD;
import X.InterfaceC655050Pmh;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSingleCardTemplateAssem<T extends InterfaceC655050Pmh> extends ReusedUISlotAssem<SearchSingleCardTemplateAssem<T>> implements InterfaceC712990Rxx<T> {
    public final C656810PpX<T> LLJJLIIIJLLLLLLLZ;
    public View.OnClickListener LLJL;
    public T LLJLIL;

    public interface SearchCardTemplateAbility extends InterfaceC494301wD {
        void setOnClickListener(View.OnClickListener onClickListener);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f34;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() throws IllegalAccessException {
        C1558520qew.LJIIJ(this, SearchCardScope.class, SearchCardTemplateAbility.class, null);
    }

    public SearchSingleCardTemplateAssem(C656810PpX<T> c656810PpX) {
        this.LLJJLIIIJLLLLLLLZ = c656810PpX;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        C1558520qew.LJI(this, SearchCardScope.class, new SearchCardTemplateAbility(this) { // from class: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchSingleCardTemplateAssem.onViewCreated.1
            public final /* synthetic */ SearchSingleCardTemplateAssem<T> LL;

            {
                this.LL = this;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchSingleCardTemplateAssem.SearchCardTemplateAbility
            public final void setOnClickListener(View.OnClickListener onClickListener) {
                this.LL.LLJL = onClickListener;
            }
        }, SearchCardTemplateAbility.class, null, null);
        C723830SaL.LIZ(this, null, new AwS376S0200000_10((SearchSingleCardTemplateAssem) this, view, (View) 30));
        C656680PpK.LIZ(view.findViewById(R.id.nh_), EnumC656690PpL.VIDEO, new AwS589S0100000_10((SearchSingleCardTemplateAssem) this, 138));
        Integer numValueOf = Integer.valueOf(C1913107eT.LIZLLL());
        if (numValueOf.intValue() > 0) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 4;
        }
        View viewFindViewById = view.findViewById(R.id.nh_);
        if (C650240Pew.LIZ()) {
            C659720PuE.LIZ.getClass();
            if (!C659720PuE.LIZ()) {
                C648880Pck.LIZJ(viewFindViewById);
                C21565319aV.LIZIZ(viewFindViewById, Float.valueOf(C1839807Im.LIZ()), null, null, null, null, 30);
            }
        } else {
            C21565319aV.LIZIZ(viewFindViewById, Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))), null, null, null, null, 30);
        }
        View viewFindViewById2 = view.findViewById(R.id.i9z);
        if (C650240Pew.LIZ()) {
            C650240Pew.LIZ.getClass();
            C21565319aV.LIZIZ(viewFindViewById2, Float.valueOf(0.0f), null, null, null, null, 30);
        } else {
            C21565319aV.LIZIZ(viewFindViewById2, Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))), null, null, null, null, 30);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        this.LLJLIL = (T) obj;
        View contentView = getContentView();
        SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility = (SearchServiceCenter$CardCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class, null);
        int iLIZIZ = 0;
        if (searchServiceCenter$CardCommonAbility != null && searchServiceCenter$CardCommonAbility.Qa0(C1558520qew.LJIIL(this)) && !C650240Pew.LIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
        }
        C0HXV.LIZJ(iLIZIZ, contentView);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
