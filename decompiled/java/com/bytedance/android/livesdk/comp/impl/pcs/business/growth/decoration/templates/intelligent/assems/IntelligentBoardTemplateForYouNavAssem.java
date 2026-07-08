package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems;

import X.C01GW;
import X.C0QSJ;
import X.C13LE;
import X.C16F5;
import X.C1846450y9L;
import X.C1846460y9M;
import X.C1846470y9N;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C21626919kR;
import X.C2217381BqS;
import X.C416760GVu;
import X.C452501pT;
import X.C497740JfY;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouNavAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouPageAbility;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class IntelligentBoardTemplateForYouNavAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1846450y9L(this));
    public final C01GW LLJ = C452501pT.LIZIZ(new C1846470y9N(this));
    public final C01GW LLJI = C452501pT.LIZIZ(new C1846460y9M(this));
    public volatile IntelligentBoardTemplateForYouPageAbility LLJIJIL;
    public InterfaceC665370Q7z LLJILJIL;
    public C0QSJ LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IntelligentBoardTemplateForYouNavAssem.class, "intelligentBoardTemplateForYouPageAbility", "getIntelligentBoardTemplateForYouPageAbility()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/templates/intelligent/assems/IntelligentBoardTemplateForYouPageAbility;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{IntelligentBoardTemplateForYouScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IntelligentBoardTemplateForYouScope.class);
        return arrayList;
    }

    public final IntelligentBoardTemplateForYouPageAbility Go() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJILJILJ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJILJIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJILJIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{IntelligentBoardTemplateForYouScope.class});
            this.LLJILJILJ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        IntelligentBoardTemplateForYouPageAbility intelligentBoardTemplateForYouPageAbility = (IntelligentBoardTemplateForYouPageAbility) c0qsjLIZLLL.getAbility(IntelligentBoardTemplateForYouPageAbility.class);
        C687700QyG.LJ(intelligentBoardTemplateForYouPageAbility, IntelligentBoardTemplateForYouPageAbility.class);
        return intelligentBoardTemplateForYouPageAbility;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C416760GVu c416760GVu;
        super.onViewCreated(view);
        LiveIconView liveIconView = (LiveIconView) this.LLIZLLLIL.getValue();
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0y9J
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    IntelligentBoardTemplateForYouNavAssem intelligentBoardTemplateForYouNavAssem = this.LL;
                    IntelligentBoardTemplateForYouPageAbility intelligentBoardTemplateForYouPageAbilityGo = intelligentBoardTemplateForYouNavAssem.LLJIJIL;
                    if (intelligentBoardTemplateForYouPageAbilityGo == null) {
                        synchronized (intelligentBoardTemplateForYouNavAssem) {
                            intelligentBoardTemplateForYouPageAbilityGo = intelligentBoardTemplateForYouNavAssem.LLJIJIL;
                            if (intelligentBoardTemplateForYouPageAbilityGo == null) {
                                intelligentBoardTemplateForYouPageAbilityGo = intelligentBoardTemplateForYouNavAssem.Go();
                                intelligentBoardTemplateForYouNavAssem.LLJIJIL = intelligentBoardTemplateForYouPageAbilityGo;
                            }
                        }
                    }
                    intelligentBoardTemplateForYouPageAbilityGo.mY();
                }
            });
        }
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.dn2, getContext());
        if (c20743516FdLIZLLL != null) {
            c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.ezt, getContext()));
            c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(12.0f), (int) C497740JfY.LIZIZ(12.0f));
            c416760GVu = new C416760GVu(c20743516FdLIZLLL);
        } else {
            c416760GVu = null;
        }
        String strLJIJI = C497740JfY.LJIJI(2131851177);
        if (strLJIJI == null) {
            strLJIJI = "";
        }
        TextView textView = (TextView) this.LLJI.getValue();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (C497740JfY.LJJ()) {
            if (C21626919kR.LIZLLL.LIZ(strLJIJI.length(), strLJIJI)) {
                spannableStringBuilder.append((CharSequence) strLJIJI).append((char) 8202).append((CharSequence) " ").append((char) 8204);
                C786410Ut5.q2(spannableStringBuilder, c416760GVu, strLJIJI.length() + 1, strLJIJI.length() + 2, 17);
            } else {
                spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) strLJIJI);
                C786410Ut5.q2(spannableStringBuilder, c416760GVu, 1, 2, 17);
            }
        } else if (C21626919kR.LIZJ.LIZ(strLJIJI.length(), strLJIJI)) {
            spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) strLJIJI);
            C786410Ut5.q2(spannableStringBuilder, c416760GVu, 1, 2, 17);
        } else {
            spannableStringBuilder.append((CharSequence) strLJIJI).append((char) 8202).append((CharSequence) " ").append((char) 8204);
            C786410Ut5.q2(spannableStringBuilder, c416760GVu, strLJIJI.length() + 1, strLJIJI.length() + 2, 17);
        }
        textView.setText(spannableStringBuilder);
        C786410Ut5.l8((C16F5) this.LLJI.getValue(), new View.OnClickListener() { // from class: X.0y9K
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                IntelligentBoardTemplateForYouNavAssem intelligentBoardTemplateForYouNavAssem = this.LL;
                IntelligentBoardTemplateForYouPageAbility intelligentBoardTemplateForYouPageAbilityGo = intelligentBoardTemplateForYouNavAssem.LLJIJIL;
                if (intelligentBoardTemplateForYouPageAbilityGo == null) {
                    synchronized (intelligentBoardTemplateForYouNavAssem) {
                        intelligentBoardTemplateForYouPageAbilityGo = intelligentBoardTemplateForYouNavAssem.LLJIJIL;
                        if (intelligentBoardTemplateForYouPageAbilityGo == null) {
                            intelligentBoardTemplateForYouPageAbilityGo = intelligentBoardTemplateForYouNavAssem.Go();
                            intelligentBoardTemplateForYouNavAssem.LLJIJIL = intelligentBoardTemplateForYouPageAbilityGo;
                        }
                    }
                }
                intelligentBoardTemplateForYouPageAbilityGo.jg0();
            }
        });
    }
}
