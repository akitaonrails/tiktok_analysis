package com.ss.android.ugc.profile.business.ur.following.ui.managefollow;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0HX6;
import X.C0HZQ;
import X.C13LE;
import X.C1954807lC;
import X.C19719912Dl;
import X.C20602415ja;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC20602315jZ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS139S0100000_4;
import Y.ACListenerS165S0100000_31;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ManageFollowCell extends PowerCell<ManageFollowItem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final AssemVMLazy LL;
    public C0HX6 LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public C0HZQ LLILZIL;
    public FrameLayout LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ManageFollowCell.class, "manageFollowVM", "getManageFollowVM()Lcom/ss/android/ugc/profile/business/ur/following/ui/managefollow/ManageFollowVM;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ManageFollowCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageFollowVM.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 1275);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(247);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 1260), awS575S0100000_31, AFwS221S0000000_31.get$arr$(315), new AwS575S0100000_31((C03K6) this, 1261), new AwS575S0100000_31((C03K6) this, 1263), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1265), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 1267), null, new AwS575S0100000_31((C03K6) this, 1268));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 1262);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1264);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 1266);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 83));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 1269);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 1270);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 1271);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 1272);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 1273);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 1274), awS575S0100000_31, AFwS221S0000000_31.get$arr$(316), new AwS575S0100000_31((C03K6) this, 1276), new AwS575S0100000_31((C03K6) this, 1277), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1278), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 1279), null, new AwS575S0100000_31((C03K6) this, 1280));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 1281), awS575S0100000_31, AFwS221S0000000_31.get$arr$(317), new AwS575S0100000_31((C03K6) this, 1282), new AwS575S0100000_31((C03K6) this, 1257), new AwS575S0100000_31((C03K6) this, 1258), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 1259));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (C0HX6) this.itemView.findViewById(R.id.bh2);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.y3b);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.ewp);
        this.LLILZIL = (C0HZQ) this.itemView.findViewById(R.id.dq1);
        this.LLILZLL = (FrameLayout) this.itemView.findViewById(R.id.dq3);
        C786410Ut5.I7(new ACListenerS139S0100000_4(this, 56), this.itemView);
        C0HZQ c0hzq = this.LLILZIL;
        if (c0hzq != null) {
            c0hzq.setInterceptToggleListener(new AwS548S0100000_4(this, 322));
        }
        FrameLayout frameLayout = this.LLILZLL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS165S0100000_31(this, 99));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        float f;
        ManageFollowItem manageFollowItem = (ManageFollowItem) interfaceC1891350zJl;
        C0HX6 c0hx6 = this.LLILLJJLI;
        if (c0hx6 != null) {
            c0hx6.setUserData(manageFollowItem.avatarUrl);
            c0hx6.LIZJ();
            c0hx6.LIZ();
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(manageFollowItem.title);
        }
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(manageFollowItem.content);
        }
        C0HZQ c0hzq = this.LLILZIL;
        if (c0hzq != null) {
            c0hzq.setChecked(manageFollowItem.isChecked);
        }
        View view = this.itemView;
        if (manageFollowItem.enabled) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        C786410Ut5.T4(view, f);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.efm, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        EnumC20602315jZ enumC20602315jZ;
        float f;
        ManageFollowItem manageFollowItem = (ManageFollowItem) interfaceC1891350zJl;
        for (Object obj : list) {
            if ((obj instanceof EnumC20602315jZ) && (enumC20602315jZ = (EnumC20602315jZ) obj) != null) {
                int i = C20602415ja.LIZ[enumC20602315jZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    C0HX6 c0hx6 = this.LLILLJJLI;
                                    if (c0hx6 != null) {
                                        c0hx6.setUserData(manageFollowItem.avatarUrl);
                                        c0hx6.LIZJ();
                                        c0hx6.LIZ();
                                    }
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                C0HZQ c0hzq = this.LLILZIL;
                                if (c0hzq != null) {
                                    c0hzq.setChecked(manageFollowItem.isChecked);
                                }
                            }
                        } else {
                            TuxTextView tuxTextView = this.LLILZ;
                            if (tuxTextView != null) {
                                tuxTextView.setText(manageFollowItem.content);
                            }
                        }
                    } else {
                        TuxTextView tuxTextView2 = this.LLILLL;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setText(manageFollowItem.title);
                        }
                    }
                } else {
                    View view = this.itemView;
                    if (manageFollowItem.enabled) {
                        f = 1.0f;
                    } else {
                        f = 0.4f;
                    }
                    C786410Ut5.T4(view, f);
                }
            }
        }
    }
}
