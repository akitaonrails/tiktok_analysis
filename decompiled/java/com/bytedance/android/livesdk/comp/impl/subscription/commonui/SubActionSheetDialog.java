package com.bytedance.android.livesdk.comp.impl.subscription.commonui;

import X.C092O;
import X.C0IPC;
import X.C1143680frq;
import X.C16F5;
import X.C20736316Cj;
import X.C497740JfY;
import X.C500060JjI;
import X.C500260Jjc;
import X.C510160Jza;
import X.C786410Ut5;
import X.EnumC500050JjH;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.comp.api.subscription.model.actionsheet.SubActionSheetAction;
import com.bytedance.android.livesdk.comp.api.subscription.model.actionsheet.SubActionSheetCallback;
import com.bytedance.android.livesdk.comp.api.subscription.model.actionsheet.SubActionSheetDescription;
import com.bytedance.android.livesdk.comp.impl.subscription.commonui.SubActionSheetDialog;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class SubActionSheetDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmHELIOSKjYvOyYjPCwjJ2EwJyghJiEmIWsfPC0SKzElJiEAICApPQs6KSkjLg==";
    public String LLJLLL = "";
    public String LLJZ = "";
    public List<SubActionSheetDescription> LLJZIJLIL = new ArrayList();
    public List<SubActionSheetAction> LLL = new ArrayList();
    public SubActionSheetCallback LLLF;
    public boolean LLLFF;
    public C16F5 LLLFFI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C0IPC.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        return true;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        int i;
        C500060JjI c500060JjI = new C500060JjI();
        ArrayList arrayList = new ArrayList();
        for (final SubActionSheetAction subActionSheetAction : this.LLL) {
            String str = subActionSheetAction.variant;
            int iHashCode = str.hashCode();
            if (iHashCode == -1829997182) {
                i = str.equals("destructive") ? R.style.a70 : R.style.a7h;
            } else if (iHashCode != -817598092) {
                if (iHashCode == -314765822) {
                    str.equals("primary");
                }
            } else if (str.equals("secondary")) {
                i = R.style.a83;
            }
            C510160Jza c510160Jza = new C510160Jza(subActionSheetAction.text, i, new C092O() { // from class: X.0JkA
                @Override // X.C092O
                public final void accept(Object obj) {
                    SubActionSheetCallback subActionSheetCallback = this.LIZ.LLLF;
                    if (subActionSheetCallback != null) {
                        subActionSheetCallback.LIZ(subActionSheetAction);
                    }
                    SubActionSheetDialog subActionSheetDialog = this.LIZ;
                    subActionSheetDialog.LLLFF = true;
                    subActionSheetDialog.close(1);
                }
            });
            c500060JjI.LIZLLL = EnumC500050JjH.PADDING_STYLE_LARGE;
            arrayList.add(c510160Jza);
        }
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        ArrayList arrayList;
        ArrayList arrayList2;
        SubActionSheetCallback subActionSheetCallback;
        String string2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("title")) == null) {
            string = "";
        }
        this.LLJLLL = string;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (arrayList = arguments2.getParcelableArrayList("descriptions")) == null) {
            arrayList = new ArrayList();
        }
        this.LLJZIJLIL = arrayList;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (arrayList2 = arguments3.getParcelableArrayList("actions")) == null) {
            arrayList2 = new ArrayList();
        }
        this.LLL = arrayList2;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            subActionSheetCallback = (SubActionSheetCallback) arguments4.getParcelable("callback");
        } else {
            subActionSheetCallback = null;
        }
        this.LLLF = subActionSheetCallback;
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string2 = arguments5.getString("cover")) != null) {
            str = string2;
        }
        this.LLJZ = str;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        SubActionSheetCallback subActionSheetCallback;
        if (!this.LLLFF && (subActionSheetCallback = this.LLLF) != null) {
            subActionSheetCallback.LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        super.onViewCreated(view, bundle);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.jzi);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0JkB
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.LL.close(1);
                }
            });
        }
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.title);
        if (c16f5 != null) {
            c16f5.setText(this.LLJLLL);
            this.LLLFFI = c16f5;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.fpb);
        if (viewGroup != null) {
            for (SubActionSheetDescription subActionSheetDescription : this.LLJZIJLIL) {
                Context context = view.getContext();
                String str = subActionSheetDescription.type;
                int iHashCode = str.hashCode();
                if (iHashCode != 3242771) {
                    if (iHashCode != 3556653) {
                        if (iHashCode == 1377092403 && str.equals("new_line")) {
                            View view3 = new View(context);
                            C786410Ut5.W5(view3, new LinearLayout.LayoutParams(-1, (int) C497740JfY.LIZIZ(16.0f)));
                            view2 = view3;
                            viewGroup.addView(view2);
                        }
                    } else if (str.equals("text")) {
                        C16F5 c16f52 = new C16F5(context, null);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.bottomMargin = (int) C497740JfY.LIZIZ(16.0f);
                        C786410Ut5.y6(c16f52, layoutParams);
                        c16f52.setGravity(17);
                        c16f52.setTextSize(16.0f);
                        c16f52.setText(subActionSheetDescription.value);
                        c16f52.LJJJI(R.style.a92);
                        c16f52.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, context));
                        view2 = c16f52;
                        viewGroup.addView(view2);
                    }
                } else if (str.equals("item")) {
                    View viewSd = C786410Ut5.Sd(R.layout.g1z, getLayoutInflater(), null);
                    C16F5 c16f53 = (C16F5) viewSd.findViewById(R.id.fof);
                    c16f53.setMovementMethod(LinkMovementMethod.getInstance());
                    c16f53.setHighlightColor(0);
                    c16f53.setText(subActionSheetDescription.value);
                    c16f53.setTextSize(17.0f);
                    c16f53.setGravity(8388611);
                    c16f53.LJJJI(R.style.a8y);
                    c16f53.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, context));
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.bottomMargin = (int) C497740JfY.LIZIZ(16.0f);
                    C786410Ut5.W5(viewSd, layoutParams2);
                    view2 = viewSd;
                    viewGroup.addView(view2);
                }
            }
        }
        View viewFindViewById = view.findViewById(R.id.cover);
        if (viewFindViewById != null) {
            String str2 = this.LLJZ;
            if (C500260Jjc.LJJIIZ(str2) && str2 != null) {
                C1143680frq.LIZLLL(viewFindViewById, "tiktok_live_subscription_demand_1", this.LLJZ);
                C16F5 c16f54 = this.LLLFFI;
                if (c16f54 != null) {
                    ViewGroup.LayoutParams layoutParams3 = c16f54.getLayoutParams();
                    if (layoutParams3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(16.0f);
                        C786410Ut5.W5(c16f54, marginLayoutParams);
                        if (Unit.LIZ != null) {
                            return;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
            }
            C500260Jjc.LJIILIIL(viewFindViewById);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gay, viewGroup, false);
    }
}
