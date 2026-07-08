package com.bytedance.android.livesdkapi.depend.model.effect;

import X.C09CT;
import X.C0U6H;
import X.C0U9E;
import X.C0VSJ;
import X.C13BV;
import X.C2097608Jq;
import X.C767720U9q;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveEffectOld extends LiveEffect {
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public long LJIILJJIL;
    public long LJIILL;
    public String LJIILLIIL;
    public boolean LJIJ;
    public UrlModel LJIJJ;
    public long LJIL;
    public boolean LJJ;
    public JSONArray LJJI;
    public long LJJIIJ;
    public List<String> LJJIIJZLJL;
    public long LJJIIZ;
    public String LJJIIZI;
    public String LJJIJ;
    public String LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public int LJJIJIL;
    public long LJJIJL;
    public boolean LJJIJLIJ;
    public Map<Long, Integer> LJJIL;
    public long LJJIZ;
    public long LJJJ;
    public int LJJJI;
    public long LJJJIL;
    public String LJJJJ;
    public String LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;
    public boolean LJJJJJL;
    public List<LiveEffect.ComposerConfig> LJJJJL;
    public boolean LJJJJLI;
    public List<? extends LiveEffect> LJJJJLL;
    public ArrayList<String> LJJJJZ;
    public ArrayList<Integer> LJJJJZI;
    public Boolean LJJJLIIL;
    public boolean LJJJLL;
    public boolean LJJJLZIJ;
    public String LJJJZ;
    public String LJJL;
    public String LJJLI;
    public Integer LJJLIIIIJ;
    public Integer LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public boolean LJJLIIIJL;
    public Boolean LJJLIIIJLJLI;
    public boolean LJJLIIIJLLLLLLLZ;
    public boolean LJJLIIJ;
    public boolean LJJLIL;
    public C0U9E LJJLJ;
    public boolean LJJLJLI;
    public boolean LJJLL;
    public boolean LJJZ;
    public String LJJZZI;
    public boolean LJJZZIII;
    public boolean LJL;
    public boolean LJLI;
    public boolean LJLIIIL;
    public boolean LJLIIL;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public List<String> LJLJLJ;
    public int LJLJLLL;
    public List<String> LJLL;
    public long LJLLI;
    public String LJLLILLLL;
    public UrlModel LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public List<String> LJLLLLLL;
    public String LJLZ;
    public boolean LJZ;
    public String LJZI;
    public String LJZL;
    public List<String> LL;
    public String LLD;
    public String LLF;
    public UrlModel LLFF;
    public int LLFFF;
    public List<String> LLFII;
    public String LLFZ;
    public UrlModel LLI;
    public String LLIFFJFJJ;
    public List<String> LLII;
    public List<String> LLIIII;
    public C0U6H LLIIIILZ;
    public String LLIIIJ;
    public String LLIIIL;
    public final int LLIIIZ;
    public String LLIIJI;
    public LiveEffect.StickerSDKExtra LLIIJLIL;
    public String LLIIL;
    public int LLIILII;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long effectId;

    @C09CT("extra")
    public String extra;

    @C09CT("icon_url")
    public UrlModel icon;

    @C09CT("effect_name_en")
    public String nameForEnglish;

    @C09CT("tags")
    public List<String> tags;

    @C09CT("types")
    public List<String> types;
    public String LJFF = "";
    public String LJI = "";

    @C09CT("name")
    public String name = "";
    public String LJIIL = "";
    public String LJIILIIL = "";
    public C767720U9q LJIIZILJ = new C767720U9q();
    public String LJIJI = "";
    public String LJIJJLI = "";
    public List<String> LJJIFFI = new ArrayList();
    public String LJJII = "";
    public String LJJIII = "";

    @Override // X.InterfaceC767600U9e
    public final void LJIJI() {
        this.LJJLJLI = true;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJLIIIIJ() {
        this.LJLIIIL = true;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJLLILLLL() {
        this.LJLI = true;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLIIJI(int i) {
    }

    @Override // X.InterfaceC767600U9e
    public final void LLIL(boolean z) {
    }

    @Override // X.C0UIP
    public final void LLILLIZIL(long j) {
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final void LLLIIIL(long j) {
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJIJJLI() {
        if (!this.LJLIIL) {
            return this.LJJJJIZL;
        }
        String str = this.LJLJI;
        return str != null && str.length() > 0 && new C0VSJ(this.LJIJJLI).exists();
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJJJJLL() {
        if (this.LJJZZIII) {
            return true;
        }
        LiveEffect.StickerSDKExtra stickerSDKExtra = this.LLIIJLIL;
        return (stickerSDKExtra == null || stickerSDKExtra.pl == null) ? false : true;
    }

    @Override // X.InterfaceC767600U9e
    public final String LJJJJZI() {
        String str = this.nameForEnglish;
        return str == null ? "" : str;
    }

    @Override // X.C0U7B
    public final boolean LJLJLJ() {
        Boolean bool = this.LJJLIIIJLJLI;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LLJJI() {
        return !this.LJL;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LLJJJ() {
        LiveEffect.StickerSDKExtra stickerSDKExtra = this.LLIIJLIL;
        return Intrinsics.LJFF(stickerSDKExtra != null ? stickerSDKExtra.type : null, "interactiveEffects");
    }

    @Override // X.InterfaceC767600U9e
    public final String LLJLL() {
        String str = this.LJJJJ;
        return str == null ? "" : str;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final LiveEffect LLJZIJLIL() {
        LiveEffectOld liveEffectOld = new LiveEffectOld();
        liveEffectOld.effectId = this.effectId;
        liveEffectOld.LJFF = this.LJFF;
        liveEffectOld.LJI = this.LJI;
        liveEffectOld.icon = this.icon;
        liveEffectOld.name = this.name;
        liveEffectOld.nameForEnglish = this.nameForEnglish;
        liveEffectOld.LJIIIIZZ = this.LJIIIIZZ;
        liveEffectOld.LJIIJ = this.LJIIJ;
        liveEffectOld.LJIIJJI = this.LJIIJJI;
        liveEffectOld.LJIIZILJ = this.LJIIZILJ;
        liveEffectOld.LJIJI = this.LJIJI;
        liveEffectOld.LJIJJ = this.LJIJJ;
        liveEffectOld.LJIJJLI = this.LJIJJLI;
        liveEffectOld.tags = this.tags;
        liveEffectOld.types = this.types;
        liveEffectOld.LJJJJI = this.LJJJJI;
        liveEffectOld.LJJJJIZL = this.LJJJJIZL;
        liveEffectOld.LJJJJJ = this.LJJJJJ;
        liveEffectOld.LJJJJL = this.LJJJJL;
        liveEffectOld.LJJJJLL = this.LJJJJLL;
        liveEffectOld.LJJJJZ = this.LJJJJZ;
        liveEffectOld.LIZJ = this.LIZJ;
        liveEffectOld.LJJJJZI = this.LJJJJZI;
        liveEffectOld.LJJJLIIL = this.LJJJLIIL;
        liveEffectOld.LJJJLL = this.LJJJLL;
        liveEffectOld.LJJJLZIJ = this.LJJJLZIJ;
        liveEffectOld.LJJJZ = this.LJJJZ;
        liveEffectOld.LJJL = this.LJJL;
        liveEffectOld.LJJLIIIIJ = this.LJJLIIIIJ;
        liveEffectOld.LJJLIIIJ = this.LJJLIIIJ;
        liveEffectOld.extra = this.extra;
        liveEffectOld.LJJLIIIJILLIZJL = this.LJJLIIIJILLIZJL;
        liveEffectOld.LJJLIIIJJI = this.LJJLIIIJJI;
        liveEffectOld.LJJLIIIJL = this.LJJLIIIJL;
        liveEffectOld.LJJLIL = this.LJJLIL;
        liveEffectOld.LLIIJI = this.LLIIJI;
        liveEffectOld.LLIIJLIL = this.LLIIJLIL;
        liveEffectOld.LJJLJ = this.LJJLJ;
        liveEffectOld.LJJLL = this.LJJLL;
        liveEffectOld.LJJZ = this.LJJZ;
        liveEffectOld.LJJZZI = this.LJJZZI;
        liveEffectOld.LLIIL = this.LLIIL;
        liveEffectOld.LJJZZIII = this.LJJZZIII;
        liveEffectOld.LJL = this.LJL;
        liveEffectOld.LJLJJL = this.LJLJJL;
        liveEffectOld.LJJLI = this.LJJLI;
        liveEffectOld.LJLJL = this.LJLJL;
        liveEffectOld.LJLJLJ = this.LJLJLJ;
        liveEffectOld.LJLJLLL = this.LJLJLLL;
        liveEffectOld.LJLLILLLL = this.LJLLILLLL;
        liveEffectOld.LJLL = this.LJLL;
        liveEffectOld.LJLLI = this.LJLLI;
        liveEffectOld.LJLLJ = this.LJLLJ;
        liveEffectOld.LJLLL = this.LJLLL;
        liveEffectOld.LJLLLL = this.LJLLLL;
        liveEffectOld.LJLLLLLL = this.LJLLLLLL;
        liveEffectOld.LJLZ = this.LJLZ;
        liveEffectOld.LJZ = this.LJZ;
        liveEffectOld.LJZI = this.LJZI;
        liveEffectOld.LJZL = this.LJZL;
        liveEffectOld.LL = this.LL;
        liveEffectOld.LLD = this.LLD;
        liveEffectOld.LLF = this.LLF;
        liveEffectOld.LLFF = this.LLFF;
        liveEffectOld.LLFFF = this.LLFFF;
        liveEffectOld.LLFII = this.LLFII;
        liveEffectOld.LLFZ = this.LLFZ;
        liveEffectOld.LLI = this.LLI;
        liveEffectOld.LLIILII = this.LLIILII;
        liveEffectOld.LJJLIIIJJIZ = this.LJJLIIIJJIZ;
        liveEffectOld.LJIIIZ = this.LJIIIZ;
        liveEffectOld.LJJI = this.LJJI;
        liveEffectOld.LJJJIL = this.LJJJIL;
        liveEffectOld.LJJ = this.LJJ;
        liveEffectOld.LJJII = this.LJJII;
        liveEffectOld.LJJIII = this.LJJIII;
        liveEffectOld.LJJIIJ = this.LJJIIJ;
        liveEffectOld.LJJIIJZLJL = this.LJJIIJZLJL;
        liveEffectOld.LJJIFFI = this.LJJIFFI;
        return liveEffectOld;
    }

    public LiveEffectOld() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LJJIIJZLJL = c13bv;
        this.LJJIIZI = "";
        this.LJJIJ = "";
        this.LJJIJIIJI = "";
        this.LJJIJIL = 1;
        this.LJJIL = C2097608Jq.LJ();
        this.LJJJJ = this.LJI;
        this.LJJJJI = "";
        this.LJJJJL = new ArrayList();
        this.LJJJJZ = new ArrayList<>();
        this.LJJJJZI = new ArrayList<>();
        this.LJJLIIIJJIZ = "";
        this.LJJLJ = C0U9E.NORMAL;
        this.LJJZZI = "";
        this.LJLJLJ = c13bv;
        this.LJLLILLLL = "";
        this.LJLLL = "";
        this.LJLZ = "";
        this.LJZI = "";
        this.LJZL = "";
        this.LLD = "";
        this.LLF = "";
        this.LLIIIL = "";
        this.LLIIIZ = -1;
    }

    @Override // X.C0U7B
    public final List<String> LIZ() {
        return this.LJLL;
    }

    @Override // X.InterfaceC767600U9e
    public final String LIZIZ() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC767600U9e
    public final List<String> LIZJ() {
        return this.types;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LIZLLL() {
        return this.LJJJJJ;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJ() {
        return this.LJJLIIJ;
    }

    @Override // X.InterfaceC767600U9e
    public final String LJI() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJIIIIZZ() {
        return this.LJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJIIIZ() {
        return this.LJJLJLI;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJIILIIL() {
        return this.LJJLIL;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJIILJJIL() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC767600U9e
    public final int LJIILLIIL() {
        return this.LLIIIZ;
    }

    @Override // X.InterfaceC767600U9e
    public final Boolean LJIIZILJ() {
        return this.LJJJLIIL;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJIJ() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC767600U9e
    public final String LJJ() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJJI() {
        return this.LJLIIL;
    }

    @Override // X.InterfaceC767600U9e
    public final String LJJIII() {
        return this.LLIIJI;
    }

    @Override // X.C0UIP
    public final long LJJIIJ() {
        return this.LJJIZ;
    }

    @Override // X.InterfaceC767600U9e
    public final long LJJIIZ() {
        return this.LJIILJJIL;
    }

    @Override // X.C0UIP
    public final boolean LJJIJ() {
        return this.LJJIJLIJ;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJJIJIIJI() {
        return this.LJJLIIIJL;
    }

    @Override // X.InterfaceC767600U9e
    public final List<String> LJJIJIIJIL() {
        return this.LJJJJZ;
    }

    @Override // X.InterfaceC767600U9e
    public final String LJJIJIL() {
        return this.LJIIL;
    }

    @Override // X.C0U7B
    public final Integer LJJIJL() {
        return this.LJJLIIIIJ;
    }

    @Override // X.C0U7B
    public final String LJJIJLIJ() {
        return this.LJJL;
    }

    @Override // X.InterfaceC767600U9e
    public final String LJJIL() {
        return this.LLIIL;
    }

    @Override // X.InterfaceC767600U9e
    public final int LJJJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJJJI() {
        return this.LJJJLL;
    }

    @Override // X.InterfaceC767600U9e
    public final int LJJJJ() {
        return this.LLIILII;
    }

    @Override // X.C0U7B
    public final String LJJJJI() {
        return this.LJJLI;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJJJJIZL() {
        return this.LJLIIIL;
    }

    @Override // X.InterfaceC767600U9e
    public final List<Integer> LJJJJJ() {
        return this.LJJJJZI;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJJJJLI() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC767600U9e
    public final List<String> LJJJLIIL() {
        return this.LLFII;
    }

    @Override // X.InterfaceC767600U9e
    public final List<LiveEffect.ComposerConfig> LJJJZ() {
        return this.LJJJJL;
    }

    @Override // X.InterfaceC767600U9e
    public final int LJJL() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJJLIIIJ() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJJLIIIJILLIZJL() {
        return this.LJJJLZIJ;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJJLIIIJJI() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC767600U9e
    public final String LJJLIIIJL() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC767600U9e
    public final String LJJLIIIJLLLLLLLZ() {
        return this.LJLIL;
    }

    @Override // X.C0UIP
    public final boolean LJJLIIJ() {
        return this.LJJIJIIJIL;
    }

    @Override // X.InterfaceC767600U9e
    public final int LJJZZI() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC767600U9e
    public final List<String> LJJZZIII() {
        return this.LL;
    }

    @Override // X.InterfaceC767600U9e
    public final int LJL() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC767600U9e
    public final String LJLIIL() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC767600U9e
    public final C0U9E LJLIL() {
        return this.LJJLJ;
    }

    @Override // X.InterfaceC767600U9e
    public final String LJLJJL() {
        return this.LJJJJI;
    }

    @Override // X.InterfaceC767600U9e
    public final String LJLJJLL() {
        return this.LLIFFJFJJ;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJLJL() {
        return this.LJZ;
    }

    @Override // X.InterfaceC767600U9e
    public final LiveEffect.StickerSDKExtra LJLJLLL() {
        return this.LLIIJLIL;
    }

    @Override // X.InterfaceC767600U9e
    public final String LJLL() {
        return this.LJJLIIIJJI;
    }

    @Override // X.InterfaceC767600U9e
    public final List<String> LJLLJ() {
        return this.LLIIII;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LJLLL() {
        return this.LJJJJJL;
    }

    @Override // X.InterfaceC767600U9e
    public final List<String> LJLLLL() {
        return this.LLII;
    }

    @Override // X.InterfaceC767600U9e
    public final long LJLLLLLL() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC767600U9e
    public final String LJLZ() {
        return this.LLF;
    }

    @Override // X.InterfaceC767600U9e
    public final C0U6H LJZI() {
        return this.LLIIIILZ;
    }

    @Override // X.C0U7B
    public final List<LiveEffect> LL() {
        return this.LJJJJLL;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LLFF() {
        return this.LJJZ;
    }

    @Override // X.InterfaceC767600U9e
    public final String LLFFF() {
        return this.LJZI;
    }

    @Override // X.InterfaceC767600U9e
    public final String LLFZ() {
        return this.LLFZ;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LLI() {
        return this.LJJJJLI;
    }

    @Override // X.C0UIP
    public final Map<Long, Integer> LLIIIZ() {
        return this.LJJIL;
    }

    @Override // X.InterfaceC767600U9e
    public final UrlModel LLIIJLIL() {
        return this.LLFF;
    }

    @Override // X.InterfaceC767600U9e
    public final long LLIIL() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LLIILII() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC767600U9e
    public final String LLIILZL() {
        return this.LJJIIZI;
    }

    @Override // X.C0U7B
    public final String LLILII() {
        return this.LJJJZ;
    }

    @Override // X.InterfaceC767600U9e
    public final String LLILL() {
        return this.LJJLIIIJILLIZJL;
    }

    @Override // X.C0UIP
    public final long LLILLJJLI() {
        return this.LJJIJL;
    }

    @Override // X.C0UIP
    public final String LLILZIL() {
        return this.LJJIJ;
    }

    @Override // X.InterfaceC767600U9e
    public final String LLILZLL() {
        return this.LJZL;
    }

    @Override // X.InterfaceC767600U9e
    public final String LLJI() {
        return this.LJFF;
    }

    @Override // X.InterfaceC767600U9e
    public final UrlModel LLJILJILJ() {
        return this.LLI;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LLJILLL() {
        return this.LJLI;
    }

    @Override // X.InterfaceC767600U9e
    public final List<String> LLJJ() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC767600U9e
    public final String LLJJIJI() {
        return this.LJJZZI;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LLJJIJIL() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0UIP
    public final String LLJJL() {
        return this.LJJIJIIJI;
    }

    @Override // X.InterfaceC767600U9e
    public final UrlModel LLJJLIIIJLLLLLLLZ() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC767600U9e
    public final String LLJLLIL() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC767600U9e
    public final boolean LLJZ() {
        return this.LJJLL;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final List<String> LLL() {
        return this.LJJIIJZLJL;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final boolean LLLF() {
        return this.LJJ;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final long LLLFF() {
        return this.LJJIIJ;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final String LLLFFI() {
        return this.LJJII;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final JSONArray LLLFZ() {
        return this.LJJI;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final String LLLI() {
        return this.LJJIII;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final List<String> LLLII() {
        return this.LJJIFFI;
    }

    @Override // X.InterfaceC767600U9e
    public final String Wp() {
        return this.LLD;
    }

    @Override // X.InterfaceC767600U9e
    public final String getDevicePlatform() {
        return this.LJLLL;
    }

    @Override // X.C0UIP
    public final long getDuration() {
        return this.LJJJIL;
    }

    @Override // X.InterfaceC767600U9e
    public final long getEffectId() {
        return this.effectId;
    }

    @Override // X.InterfaceC767600U9e
    public final String getExtra() {
        return this.extra;
    }

    @Override // X.InterfaceC767600U9e
    public final String getFilePath() {
        return this.LJIJJLI;
    }

    @Override // X.InterfaceC767600U9e
    public final UrlModel getFileUrl() {
        return this.LJLLJ;
    }

    @Override // X.C0UIP
    public final long getFromUserId() {
        return this.LJJJ;
    }

    @Override // X.C0UIP
    public final long getGiftId() {
        return this.LJIL;
    }

    @Override // X.InterfaceC767600U9e
    public final UrlModel getIcon() {
        return this.icon;
    }

    @Override // X.InterfaceC767600U9e
    public final C767720U9q getLogParams() {
        return this.LJIIZILJ;
    }

    @Override // X.C0UIP
    public final long getMsgId() {
        return this.LJJIIZ;
    }

    @Override // X.InterfaceC767600U9e
    public final List<String> getMusic() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC767600U9e
    public final String getName() {
        return this.name;
    }

    @Override // X.InterfaceC767600U9e
    public final String getPanel() {
        return this.LJJLIIIJJIZ;
    }

    @Override // X.InterfaceC767600U9e
    public final String getParent() {
        return this.LJLLLL;
    }

    @Override // X.InterfaceC767600U9e
    public final Integer getPosition() {
        return this.LJJLIIIJ;
    }

    @Override // X.C0UIP
    public final int getPrice() {
        return this.LJJJI;
    }

    @Override // X.C0UIP
    public final int getRepeatCount() {
        return this.LJJIJIL;
    }

    @Override // X.InterfaceC767600U9e
    public final String getResourceId() {
        return this.LJI;
    }

    @Override // X.InterfaceC767600U9e
    public final String getSchema() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC767600U9e
    public final String getSearchId() {
        return this.LLIIIJ;
    }

    @Override // X.InterfaceC767600U9e
    public final String getSessionId() {
        return this.LLIIIL;
    }

    @Override // X.InterfaceC767600U9e
    public final int getSource() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC767600U9e
    public final List<String> getTags() {
        return this.tags;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJFF(String str) {
        this.LLIIIJ = str;
    }

    @Override // X.C0UIP
    public final void LJII(int i) {
        this.LJJIJIL = i;
    }

    @Override // X.C0UIP
    public final void LJIIJ(long j) {
        this.LJJIJL = j;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJIIJJI(String str) {
        this.LJJLIIIJJI = str;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJIIL(String str) {
        this.LJIIL = str;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJIILL(long j) {
        this.LJIILL = j;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJIJJ(LiveEffect.StickerSDKExtra stickerSDKExtra) {
        this.LLIIJLIL = stickerSDKExtra;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJIL(boolean z) {
        this.LJJLIL = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJIFFI(String str) {
        this.nameForEnglish = str;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJII(String str) {
        this.LJI = str;
    }

    @Override // X.C0UIP
    public final void LJJIIJZLJL(Map<Long, Integer> map) {
        this.LJJIL = map;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJIIZI(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJIZ(boolean z) {
        this.LJIIJJI = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJJIL(boolean z) {
        this.LJLJJI = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJJJJL(boolean z) {
        this.LJJJJLI = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJJJL(String str) {
        this.LJLJI = str;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJJJZ(boolean z) {
        this.LJLIIL = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJJLL(boolean z) {
        this.LJIIIIZZ = z;
    }

    @Override // X.C0U7B
    public final void LJJJLZIJ(Boolean bool) {
        this.LJJLIIIJLJLI = bool;
    }

    @Override // X.C0U7B
    public final void LJJLI(Integer num) {
        this.LJJLIIIIJ = num;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJLIIIJJIZ(int i) {
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJLIIIJLJLI(boolean z) {
        this.LJIIJ = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJLIL(boolean z) {
        this.LJJJJIZL = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJLJ(String str) {
        if (str == null) {
            str = "";
        }
        this.LJJLIIIJJIZ = str;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJLJLI(String str) {
        this.LJIILLIIL = str;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJLL(boolean z) {
        this.LJJLIIIJL = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJJZ(boolean z) {
        this.LJJLIIIJLLLLLLLZ = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJLI(String str) {
        this.LLIIL = str;
    }

    @Override // X.C0UIP
    public final void LJLIIIL(String str) {
        this.LJJIJIIJI = str;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJLILLLLZI(boolean z) {
        this.LJJJJJ = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJLJI(List<LiveEffect.ComposerConfig> list) {
        this.LJJJJL = list;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJLJJI(boolean z) {
        this.LJJLL = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJLLI(C0U6H c0u6h) {
        this.LLIIIILZ = c0u6h;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJZ(Integer num) {
        this.LJJLIIIJ = num;
    }

    @Override // X.InterfaceC767600U9e
    public final void LJZL(String str) {
        this.LJJZZI = str;
    }

    @Override // X.C0U7B
    public final void LLD(List<? extends LiveEffect> list) {
        this.LJJJJLL = list;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLF(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLFII(boolean z) {
        this.LJJJLL = z;
    }

    @Override // X.C0UIP
    public final void LLIFFJFJJ(String str) {
        this.LJJIJ = str;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLII(boolean z) {
        this.LJJJLIIL = Boolean.valueOf(z);
    }

    @Override // X.InterfaceC767600U9e
    public final void LLIIII(boolean z) {
        this.LJJZZIII = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLIIIILZ(String str) {
        this.LJJJJ = str;
    }

    @Override // X.C0UIP
    public final void LLIIIJ(long j) {
        this.LJJIIZ = j;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLIIIL(boolean z) {
        this.LJL = !z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLIIZ(long j) {
        this.effectId = j;
    }

    @Override // X.C0U7B
    public final void LLILIL(LiveEffect liveEffect) {
        this.LJJL = liveEffect.getName();
        this.LJJJZ = liveEffect.getResourceId();
        this.LJJLI = String.valueOf(liveEffect.getEffectId());
    }

    @Override // X.InterfaceC767600U9e
    public final void LLILLL(boolean z) {
        this.LJIJ = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLILZ(long j) {
        this.LJIILJJIL = j;
    }

    @Override // X.C0UIP
    public final void LLIZ(long j) {
        this.LJJJ = j;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLIZLLLIL(String str) {
        this.LJJJJZ.add(str);
    }

    @Override // X.InterfaceC767600U9e
    public final void LLJ(boolean z) {
        this.LJJJJJL = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLJIJIL(int i) {
        this.LLIILII = i;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLJILJIL(boolean z) {
        this.LJJZ = z;
    }

    @Override // X.C0UIP
    public final void LLJJIII(boolean z) {
        this.LJJIJIIJIL = z;
    }

    @Override // X.C0UIP
    public final void LLJJIJIIJIL(long j) {
        this.LJJIZ = j;
    }

    @Override // X.C0UIP
    public final void LLJJJIL(long j) {
        this.LJIL = j;
    }

    @Override // X.C0UIP
    public final void LLJJJJ(int i) {
        this.LJJJI = i;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLJJJJJIL(String str) {
        this.LJLILLLLZI = str;
    }

    @Override // X.C0UIP
    public final void LLJJJJLIIL(boolean z) {
        this.LJJIJLIJ = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLJL(boolean z) {
        this.LJIIIZ = z;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLJLIL(String str) {
        this.LJJLIIIJILLIZJL = str;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLJLILLLLZIIL(C0U9E c0u9e) {
        this.LJJLJ = c0u9e;
    }

    @Override // X.InterfaceC767600U9e
    public final void LLJLLL(String str) {
        this.LJIILIIL = str;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final void LLLIIIIL(List<String> list) {
        this.LJJIIJZLJL = list;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final void LLLIIL(boolean z) {
        this.LJJ = z;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final void LLLIILIL(long j) {
        this.LJJIIJ = j;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final void LLLIL(String str) {
        this.LJJII = str;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final void LLLILZ(JSONArray jSONArray) {
        this.LJJI = jSONArray;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final void LLLILZJ(String str) {
        this.LJJIII = str;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final void LLLILZLLLI(List<String> list) {
        this.LJJIFFI = list;
    }

    public final void LLLIZZ(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void LLLJ(String str) {
        this.name = str;
    }

    public final void LLLJIL(List<String> list) {
        this.tags = list;
    }

    public final void LLLJL(List<String> list) {
        this.types = list;
    }

    @Override // X.C0UIP
    public final void setDuration(long j) {
        this.LJJJIL = j;
    }

    @Override // X.InterfaceC767600U9e
    public final void setExtra(String str) {
        this.extra = str;
    }

    @Override // X.InterfaceC767600U9e
    public final void setFilePath(String str) {
        this.LJIJJLI = str;
    }

    @Override // X.InterfaceC767600U9e
    public final void setSessionId(String str) {
        if (str == null) {
            str = "";
        }
        this.LLIIIL = str;
    }
}
