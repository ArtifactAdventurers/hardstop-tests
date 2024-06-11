package dev.gruff.hardstop.testcases.apicheck;

public sealed interface SealedInterfaceLosesPermit permits I1,I2 {
}

non-sealed interface  I1 extends SealedInterfaceLosesPermit{

}

non-sealed interface I2 extends SealedInterfaceLosesPermit{

}

