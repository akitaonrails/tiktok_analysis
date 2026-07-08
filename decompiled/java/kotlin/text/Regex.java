package kotlin.text;

import X.C08W9;
import X.C0XJL;
import X.C0XJM;
import X.C13LM;
import X.C13WE;
import X.C1957407lc;
import X.C19719612Di;
import X.C2188811AlT;
import X.C2217108mP;
import X.EnumC688760Qzy;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes31.dex */
public final class Regex implements Serializable {
    public static final C2217108mP Companion;
    public Set<? extends EnumC688760Qzy> LL;
    public final Pattern nativePattern;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.08mP] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Object(defaultConstructorMarker) { // from class: X.08mP
        };
    }

    private final Object writeReplace() {
        final String strPattern = this.nativePattern.pattern();
        final int iFlags = this.nativePattern.flags();
        return new Serializable(strPattern, iFlags) { // from class: X.13WB
            public static final C13WD LLILLL;
            public static final long serialVersionUID = 0;
            public final String LL;
            public final int LLILLJJLI;

            /* JADX WARN: Type inference failed for: r1v0, types: [X.13WD] */
            static {
                final DefaultConstructorMarker defaultConstructorMarker = null;
                LLILLL = new Object(defaultConstructorMarker) { // from class: X.13WD
                };
            }

            private final Object readResolve() {
                return new Regex(PatternProtector.compile(this.LL, this.LLILLJJLI));
            }

            {
                this.LL = strPattern;
                this.LLILLJJLI = iFlags;
            }
        };
    }

    public final Set<EnumC688760Qzy> getOptions() {
        Set set = this.LL;
        if (set != null) {
            return set;
        }
        final int iFlags = this.nativePattern.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(EnumC688760Qzy.class);
        C19719612Di.LJJIII(enumSetAllOf, new Function1<EnumC688760Qzy, Boolean>() { // from class: X.13WA
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(EnumC688760Qzy enumC688760Qzy) {
                boolean z;
                EnumC688760Qzy enumC688760Qzy2 = enumC688760Qzy;
                if ((iFlags & enumC688760Qzy2.getMask()) == enumC688760Qzy2.getValue()) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, false);
        Set<EnumC688760Qzy> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        this.LL = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    public final String getPattern() {
        return this.nativePattern.pattern();
    }

    public String toString() {
        return this.nativePattern.toString();
    }

    public final Pattern toPattern() {
        return this.nativePattern;
    }

    public Regex(String str) {
        this(PatternProtector.compile(str));
    }

    public final boolean containsMatchIn(CharSequence charSequence) {
        return this.nativePattern.matcher(charSequence).find();
    }

    public final MatchResult matchEntire(CharSequence charSequence) {
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (!matcher.matches()) {
            return null;
        }
        return new C0XJM(matcher, charSequence);
    }

    public final boolean matches(CharSequence charSequence) {
        return this.nativePattern.matcher(charSequence).matches();
    }

    public Regex(Pattern pattern) {
        this.nativePattern = pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String str, Set<? extends EnumC688760Qzy> set) {
        C2217108mP c2217108mP = Companion;
        Iterator<T> it2 = set.iterator();
        int value = 0;
        while (it2.hasNext()) {
            value |= ((C13WE) it2.next()).getValue();
        }
        c2217108mP.getClass();
        this(PatternProtector.compile(str, (value & 2) != 0 ? value | 64 : value));
    }

    public final MatchResult find(CharSequence charSequence, int i) {
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (!matcher.find(i)) {
            return null;
        }
        return new C0XJM(matcher, charSequence);
    }

    public final Sequence<MatchResult> findAll(final CharSequence charSequence, final int i) {
        if (i >= 0 && i <= charSequence.length()) {
            return new C13LM(new Function0() { // from class: X.13WC
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.LL.find(charSequence, i);
                }
            }, C0XJL.LL);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Start index out of bounds: ");
        sbLIZ.append(i);
        sbLIZ.append(", input length: ");
        sbLIZ.append(charSequence.length());
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final MatchResult matchAt(CharSequence charSequence, int i) {
        Matcher matcherRegion = this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (matcherRegion.lookingAt()) {
            return new C0XJM(matcherRegion, charSequence);
        }
        return null;
    }

    public final boolean matchesAt(CharSequence charSequence, int i) {
        return this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length()).lookingAt();
    }

    public final String replace(CharSequence charSequence, Function1<? super MatchResult, ? extends CharSequence> function1) {
        int iIntValue = 0;
        MatchResult matchResultFind$default = find$default(this, charSequence, 0, 2, null);
        if (matchResultFind$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, iIntValue, matchResultFind$default.LIZIZ().getStart().intValue());
            sb.append(function1.invoke(matchResultFind$default));
            iIntValue = matchResultFind$default.LIZIZ().LJFF().intValue() + 1;
            matchResultFind$default = matchResultFind$default.next();
            if (iIntValue >= length) {
                break;
            }
        } while (matchResultFind$default != null);
        if (iIntValue < length) {
            sb.append(charSequence, iIntValue, length);
        }
        return sb.toString();
    }

    public final String replaceFirst(CharSequence charSequence, String str) {
        return this.nativePattern.matcher(charSequence).replaceFirst(str);
    }

    public final List<String> split(CharSequence charSequence, int i) {
        a0.LJJLI(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i != 1 && matcher.find()) {
            int i2 = 10;
            if (i > 0 && i <= 10) {
                i2 = i;
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = i - 1;
            int iEnd = 0;
            do {
                arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
                if (i3 >= 0 && arrayList.size() == i3) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
            return arrayList;
        }
        return Collections.singletonList(charSequence.toString());
    }

    public final Sequence<String> splitToSequence(CharSequence charSequence, int i) {
        a0.LJJLI(i);
        return new C1957407lc(new C08W9(this, charSequence, i, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String str, EnumC688760Qzy enumC688760Qzy) {
        C2217108mP c2217108mP = Companion;
        int value = enumC688760Qzy.getValue();
        c2217108mP.getClass();
        this(PatternProtector.compile(str, (value & 2) != 0 ? value | 64 : value));
    }

    public final String replace(CharSequence charSequence, String str) {
        return this.nativePattern.matcher(charSequence).replaceAll(str);
    }

    public static /* synthetic */ MatchResult find$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    public static /* synthetic */ Sequence findAll$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.findAll(charSequence, i);
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    public static /* synthetic */ Sequence splitToSequence$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.splitToSequence(charSequence, i);
    }
}
