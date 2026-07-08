package com.ss.android.ugc.aweme.series.feed.seriescenter.assme;

import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C13LP;
import X.C1561130qj9;
import X.C1573150r2X;
import X.C1581520rG2;
import X.C1611550s2T;
import X.C1611660s2e;
import X.C1612480s3y;
import X.C19719912Dl;
import X.C2344009Gk;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenteSubPageAssemViewModel;
import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssemViewModel;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesCenterItemCell extends PowerCell<C1573150r2X> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 957));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 955));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 956));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 958));
    public final C736950SvV LLILZIL;
    public final C736950SvV LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public TuxIconView LLJIJIL;
    public TuxTextView LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public C1573150r2X LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    public final SeriesCenterMainPageAssemViewModel I5() {
        return (SeriesCenterMainPageAssemViewModel) this.LLILZIL.getValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        String str;
        String str2;
        String str3;
        String string;
        String string2;
        String str4;
        super.onViewAttachedToWindow();
        C1573150r2X c1573150r2X = this.LLJJ;
        if (c1573150r2X != null) {
            ShortDramaOverview shortDramaOverview = c1573150r2X.LLILLJJLI;
            C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
            C1561130qj9 c1561130qj9XQ2 = I5().xQ2();
            String str5 = "";
            if (c1561130qj9XQ2 == null || (str = c1561130qj9XQ2.LLIZLLLIL) == null) {
                str = "";
            }
            C1561130qj9 c1561130qj9XQ22 = I5().xQ2();
            if (c1561130qj9XQ22 == null || (str2 = c1561130qj9XQ22.LLILZ) == null) {
                str2 = (String) this.LLILLL.getValue();
            }
            C1561130qj9 c1561130qj9XQ23 = I5().xQ2();
            if (c1561130qj9XQ23 == null || (str3 = c1561130qj9XQ23.LLJ) == null) {
                str3 = (String) this.LLILLL.getValue();
            }
            Long l = shortDramaOverview.collectionId;
            if (l == null || (string = l.toString()) == null) {
                string = "";
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(I5().getState().LLIZ, ",", null, null, 0, null, AFwS264S0000000_24.get$arr$(711), 30);
            SeriesCenterCenterScene seriesCenterCenterScene = I5().getState().LLILZLL;
            if (seriesCenterCenterScene != null && (str4 = seriesCenterCenterScene.categoryId) != null) {
                str5 = str4;
            }
            int i = c1573150r2X.LLILLL;
            SeriesCategory seriesCategory = shortDramaOverview.category;
            Boolean boolIsLimitedFree = shortDramaOverview.isLimitedFree();
            Boolean boolValueOf = Boolean.valueOf(c1573150r2X.LLILZLL);
            String str6 = c1573150r2X.LLIZ;
            Map<String, Object> map = shortDramaOverview.logExtra;
            c1581520rG2.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C1612480s3y.LJIIL(c2344009Gk, "series_center", false);
            c2344009Gk.LJFF("enter_from", "series_center");
            c2344009Gk.LJFF("previous_page", str);
            c2344009Gk.LJFF("series_session_id", str2);
            if (str3 != null) {
                c2344009Gk.LJFF("series_discover_tab_session_id", str3);
            }
            c2344009Gk.LJFF("show_category", strLJJLIIIJ);
            c2344009Gk.LJFF("select_category_id", str5);
            c2344009Gk.LJFF("select_categoty_id", str5);
            c2344009Gk.LJFF("select_category", C1611660s2e.LJJIJIIJI(str5));
            c2344009Gk.LIZJ(i, "rank_num");
            c2344009Gk.LJFF("collection_id", string);
            c1581520rG2.LJJIIJZLJL(c2344009Gk, boolIsLimitedFree, string);
            C1612480s3y.LJIJI(c2344009Gk, seriesCategory);
            c2344009Gk.LJFF("series_center_filter_dict", null);
            if (boolValueOf != null) {
                c2344009Gk.LIZJ(boolValueOf.booleanValue() ? 1 : 0, "is_forced_insertion");
            }
            if (str6 != null) {
                c2344009Gk.LJFF("forced_insertion_from", str6);
                C1611660s2e.LJJIIZI(c2344009Gk);
            }
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!a0.LJJJIL(key)) {
                        if (value instanceof String) {
                            string2 = (String) value;
                        } else if ((value instanceof Number) || (value instanceof Boolean)) {
                            string2 = value.toString();
                        }
                        if (string2 != null && string2.length() != 0) {
                            c2344009Gk.LJFF(key, string2);
                        }
                    }
                }
            }
            MiniDramaETInjectService.LIZ.getClass();
            MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
            if (miniDramaETInjectServiceLIZ != null) {
                miniDramaETInjectServiceLIZ.onEventV3("series_center_mylist_collection_card_show", c2344009Gk.LIZ);
            }
        }
    }

    public SeriesCenterItemCell() {
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 573);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesCenterMainPageAssemViewModel.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(295);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLILZIL = new C736950SvV(c19719912DlLIZ, awS560S0100000_16, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS264S0000000_24, null, null, null);
        AwS560S0100000_16 awS560S0100000_162 = new AwS560S0100000_16(this, 575);
        this.LLILZLL = new C736950SvV(C13LE.LIZ(SeriesCenteSubPageAssemViewModel.class), awS560S0100000_162, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(296), null, null, null);
        this.LLJJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 574));
        this.LLJJIII = C452501pT.LIZIZ(new AwS560S0100000_16(this, 572));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.e7m);
        this.LLIZLLLIL = (TuxTextView) this.itemView.findViewById(R.id.e7k);
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.f750m4p);
        this.LLJI = (TuxTextView) this.itemView.findViewById(R.id.yko);
        this.LLJILJIL = (TuxTextView) this.itemView.findViewById(R.id.fy7);
        this.LLJIJIL = (TuxIconView) this.itemView.findViewById(R.id.qmu);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r9) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.seriescenter.assme.SeriesCenterItemCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f5_, viewGroup, false);
    }
}
